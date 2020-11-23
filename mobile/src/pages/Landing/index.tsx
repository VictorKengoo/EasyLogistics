import React from 'react'
import { View, Image, ImageBackground, Text } from 'react-native'
import { RectButton } from 'react-native-gesture-handler'

import { useNavigation } from '@react-navigation/native'

import styles from './styles'
import filesMan from '../../assets/images/filesMan.png'
import pageBackground from '../../assets/images/pageBackground.png'

function Landing() {
  const { navigate } = useNavigation()

  function handleNavigateToRegisterPage() {
    navigate('Register')
  }

  return (
    <ImageBackground source={pageBackground} style={styles.pageBackground}>
      <View style={styles.container}>

        <Text style={styles.title}>
          Seja bem-vindo ao
          <Text style={styles.titleBig}>
            {"\n"}EasyLogistics
          </Text>
        </Text>
        <Text style={styles.text}>Onde seu negócio é controlado, do jeito que você sempre quis.</Text>

        <Image source={filesMan} style={styles.filesMan} />

        <RectButton style={styles.button} onPress={handleNavigateToRegisterPage} >
          <Text style={styles.buttonText}>Controlar meu estoque</Text>
        </RectButton>

      </View>
    </ImageBackground>
  )
}

export default Landing