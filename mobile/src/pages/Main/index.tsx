import React, { useContext, useEffect, useState } from 'react'
import { View, ImageBackground, Text } from 'react-native'

import styles from './styles'

import pageBackground from '../../assets/images/pageBackground.png'
import { RectButton } from 'react-native-gesture-handler'
import { useNavigation } from '@react-navigation/native'
import api from '../../services/api'
import { Pedido } from '../Pedidos'
import AuthContext from '../../contexts/auth'

function Main() {
  const { navigate } = useNavigation()
  const { signOut } = useContext(AuthContext)

  const [isAvailableProduct, setIsAvailableProduct] = useState(true)

  function handleSignOut() {
    signOut()
  }

  function handleNavigateToPedidosPage() {
    navigate('Pedidos')
  }

  function handleNavigateToEstoquePage() {
    navigate('Estoque')
  }

  return (
    <ImageBackground source={pageBackground} style={styles.pageBackground}>
      <View style={styles.container}>
        <View style={styles.buttons}>
          <RectButton style={styles.button} onPress={handleNavigateToPedidosPage}>
            <Text style={styles.buttonText}>Pedidos</Text>
          </RectButton>

          <RectButton style={styles.button} onPress={handleNavigateToEstoquePage}>
            <Text style={styles.buttonText}>Estoque</Text>
          </RectButton>

          <RectButton style={styles.signOutButton} onPress={handleSignOut}>
            <Text style={styles.buttonLogOutText}>Logout</Text>
          </RectButton>
        </View>
      </View>
    </ImageBackground>
  )
}

export default Main