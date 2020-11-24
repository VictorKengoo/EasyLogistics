import React, { useEffect, useState } from 'react'
import { ImageBackground } from 'react-native'
import { ScrollView } from 'react-native-gesture-handler'

import styles from './styles'

import pageBackground from '../../assets/images/pageBackground.png'
import EstoqueItem from '../../components/EstoqueItem/EstoqueItem'
import api from '../../services/api'

export interface Estoque {
  id: string
  nome: string;
  qtdDisponivel: number;
}

function Estoque() {

  const [estoque, setEstoque] = useState([]);

  useEffect(() => {
    api.get('estoque').then(response => {
      const estoqueData = response.data.data

      setEstoque(estoqueData)
    })
  }, [])

  return (
    <ImageBackground source={pageBackground} style={styles.pageBackground}>
      <ScrollView
        style={styles.container}
        contentContainerStyle={{
          paddingHorizontal: 16,
          paddingBottom: 16,
        }}
      >
        {estoque.map((item: Estoque) => {
          return (
            <EstoqueItem
              key={item.id}
              id={item.id}
              nome={item.nome}
              qtdDisponivel={item.qtdDisponivel}
            />
          )
        })}
      </ScrollView>
    </ImageBackground>
  )
}

export default Estoque