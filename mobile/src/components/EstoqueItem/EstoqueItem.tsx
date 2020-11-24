import React from 'react'
import { View, Text } from 'react-native'
import styles from './styles'

interface EstoqueItemProps {
  id: string
  nome: string,
  qtdDisponivel: number
}

const EstoqueItem: React.FC<EstoqueItemProps> = ({ nome, qtdDisponivel }) => {
  return (
    <>
      <View style={styles.container}>
        <View style={styles.nomeText}>
          <Text>Nome</Text>
          <Text>{nome}</Text>
        </View>
        <View style={styles.quantidadeText}>
          <Text>Quantidade</Text>
          <Text>{qtdDisponivel}</Text>
        </View>
      </View>
    </>
  )
}

export default EstoqueItem