import React, { useEffect, useState } from 'react'
import { ImageBackground, ScrollView } from 'react-native'

import styles from './styles'

import pageBackground from '../../assets/images/pageBackground.png'
import api from '../../services/api';
import PedidoItem, { ProdutoProps } from '../../components/PedidoItem/PedidoItem';

export interface Pedido {
  id: string
  produtosEQtd: ProdutoProps[]
  status: string
  idMesa: string
}

function Pedidos() {

  const [pedidos, setPedidos] = useState([]);

  useEffect(() => {
    api.get('pedido').then(response => {
      const pedido = response.data.data
      setPedidos(pedido)
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
        {pedidos.map((item: Pedido) => {
          return (
            <PedidoItem
              key={item.id}
              id={item.id}
              produtosEQtd={item.produtosEQtd}
              status={item.status}
              idMesa={item.idMesa}
            />
          )
        })}
      </ScrollView>
    </ImageBackground>
  )
}

export default Pedidos