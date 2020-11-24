import React, { useContext, useState } from 'react'
import { View, Text, ImageBackground, KeyboardAvoidingView, Image } from 'react-native'
import { useNavigation } from '@react-navigation/native'
import styles from './styles'
import AuthContext from '../../contexts/auth'

import pageBackground from '../../assets/images/pageBackground.png'
import phoneMan from '../../assets/images/phoneMan.png'
import { RectButton, TextInput } from 'react-native-gesture-handler'
import errorMessage from '../../components/ErrorMessage'

function Login() {
  const { signed, user, signIn } = useContext(AuthContext)
  const { navigate } = useNavigation()
  console.log(signed)
  console.log(user)

  const [email, setEmail] = useState('')
  const [senha, setSenha] = useState('')

  function handleLogin() {
    signIn()
    navigate('Main')
  }

  return (
    <ImageBackground source={pageBackground} style={styles.pageBackground}>
      <KeyboardAvoidingView behavior="position" style={styles.container}>
        <Text style={styles.title}>
          Bem vindo de volta!
        </Text>
        <Image source={phoneMan} style={styles.phoneMan} />
        <View style={styles.inputs}>
          <TextInput
            onChangeText={text => setEmail(text)}
            style={styles.input}
            placeholder='Escreva seu Email'
          />
          <TextInput
            onChangeText={text => setSenha(text)}
            style={styles.input}
            secureTextEntry={true}
            placeholder='Escreva sua senha'
          />
        </View>
        <RectButton style={styles.button} onPress={handleLogin} >
          <Text style={styles.buttonText}>Login</Text>
        </RectButton>
      </KeyboardAvoidingView>
    </ImageBackground>
  )
}

export default Login