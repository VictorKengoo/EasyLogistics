import React from 'react'
import { View, ImageBackground, Text } from 'react-native'

import styles from './styles'

import pageBackground from '../../assets/images/pageBackground.png'
import { RectButton } from 'react-native-gesture-handler'

function Main() {
  return (
    <ImageBackground source={pageBackground} style={styles.pageBackground}>
      <View style={styles.container}>
        <Text style={styles.title}>
          Administrar
        </Text>
        <View style={styles.buttons} >

          <RectButton style={styles.button}>
            <Text style={styles.buttonText}>Pedidos</Text>
          </RectButton>

          <RectButton style={styles.button}>
            <Text style={styles.buttonText}>Produtos</Text>
          </RectButton>

          <RectButton style={styles.button}>
            <Text style={styles.buttonText}>Estoque</Text>
          </RectButton>

          <RectButton style={styles.button}>
            <Text style={styles.buttonText}>Mesas</Text>
          </RectButton>

          <RectButton style={styles.button}>
            <Text style={styles.buttonText}>Usuário</Text>
          </RectButton>
        </View>
      </View>
    </ImageBackground>
  )
}

export default Main