import React from 'react'
import { Feather } from '@expo/vector-icons'
import { View, Text } from 'react-native'
import styles from './styles'
import { BorderlessButton } from 'react-native-gesture-handler'
import { Pedido } from '../../pages/Pedidos'
import successMessage from '../../components/SuccessMessage'
import errorMessage from '../../components/ErrorMessage'
import api from '../../services/api'
import { useNavigation } from '@react-navigation/native'

export interface ProdutoProps {
  id: string
  nome: string
  quantidade: number
  ingredientesEQtd: IngredientesProps[]
}

interface IngredientesProps {
  id: string
  nome: string
  quantidade: number
  quantidadeMinima: number
}

const PedidoItem: React.FC<Pedido> = ({ produtosEQtd, status, id, idMesa }) => {
  const successAlert = successMessage
  const errorAlert = errorMessage
  const { navigate } = useNavigation()

  const handleUpdateStock = (produtos: ProdutoProps[]) => {
    produtos.forEach((item) => {
      api.get('produto/' + item.id).then(response => {

        const produto = response.data.data

        const ingredientes = produto.ingredientesEQtd

        ingredientes.forEach((ingredientItem: IngredientesProps) => {
          const quantidadeARetirar = ingredientItem.quantidade * item.quantidade
          console.log("Quantidade de " + ingredientItem.nome + ": " + ingredientItem.quantidade + " para "
            + item.quantidade + "produtos. Quantidade inserida: " + quantidadeARetirar)

          api.get('estoque/' + ingredientItem.id).then(ingredienteResponse => {
            const amount = ingredienteResponse.data.data.qtdDisponivel - quantidadeARetirar

            if (amount <= ingredienteResponse.data.data.qtdMinima) {
              errorAlert("Ingrediente atingiu a quantidade mínima. Realizando novo pedido ao fornecedor.")

              // Eventual Chamada à Api do fornecedor

            }
            api.put('estoque/' + ingredientItem.id,
              {
                "nome": ingredientItem.nome,
                "qtdDisponivel": amount
              },
            ).then(() => {
              successAlert("Estoque alterado com sucesso!")
              navigate('Main')
            }).catch(() => {
              errorAlert("Erro na operação para o id: {" + ingredientItem.id + "}")
            })
          })
        })
      })
    })
  }

  const handleDeletePedido = () => {
    api.delete('pedido/' + id)
      .then(() => {
        successAlert("Pedido deletado com sucesso!")
        navigate('Main')
      }).catch(() => {
        errorAlert("Erro na operação para o id: {" + id + "}")
      })
  }

  const handleConcluirPedido = () => {
    api.put('pedido/' + id,
      {
        "produtosEQtd": produtosEQtd,
        "idMesa": idMesa,
        "status": "FINALIZADO"
      })
      .then(() => {
        handleUpdateStock(produtosEQtd)
        successAlert("Pedido finalizado com sucesso!")
        navigate('Main')
      }).catch(() => {
        errorAlert("Erro na operação para o id: {" + id + "}")
      })
  }

  return (
    <View style={styles.container}>
      <View style={styles.iconButtons}>
        <BorderlessButton onPress={() => handleDeletePedido()} >
          <Feather name="x-circle" size={30} color="#000" />
        </BorderlessButton>
        {status != "FINALIZADO" && (
          <BorderlessButton onPress={() => handleConcluirPedido()} style={{ paddingLeft: 280 }} >
            <Feather name="check-circle" size={30} color="#000" />
          </BorderlessButton>
        )}

      </View>
      {produtosEQtd.map((item) => {
        return (
          <View style={styles.containerInside} key={item.id}>
            <View style={styles.nomeText} >
              <Text>Nome</Text>
              <Text>{item.nome}</Text>
            </View>
            <View style={styles.quantidadeText}>
              <Text>Quantidade</Text>
              <Text>{item.quantidade}x</Text>
            </View>
          </View>
        )
      })}
      <View style={styles.status}>
        <Text>Status</Text>
        <Text>{status}</Text>
      </View>
    </View>
  )
}

export default PedidoItem