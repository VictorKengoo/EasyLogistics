import React, { useEffect, useRef, useState } from 'react'
import { View, Text, ImageBackground, Linking, Alert, KeyboardAvoidingView } from 'react-native'
import { KeyboardAwareScrollView } from 'react-native-keyboard-aware-scroll-view'

import styles from './styles'

import pageBackground from '../../assets/images/pageBackground.png'
import { RectButton, TextInput } from 'react-native-gesture-handler'
import { useNavigation } from '@react-navigation/native'
import successMessage from '../../components/SuccessMessage'
import errorMessage from '../../components/ErrorMessage'
import api from '../../services/api'

function Register() {
  const successAlert = successMessage
  const errorAlert = errorMessage
  const { navigate } = useNavigation()
  const [nome, setNome] = useState('')
  const [email, setEmail] = useState('')
  const [senha, setSenha] = useState('')
  const [tipoUsuario, setTipoUsuario] = useState('')

  async function handleCreateUser() {

    await api.post('/usuario', {
      nome,
      email,
      senha,
      tipoUsuario
    }).then(() => {
      successAlert()
      handleNavigateToLoginPage()
    }).catch(() => {
      errorAlert()
    })
  }
  function handleNavigateToLoginPage() {
    navigate('Login')
  }

  return (
    <ImageBackground source={pageBackground} style={styles.pageBackground}>
      <View style={styles.container}>
        <Text style={styles.title}>
          Cadastre-se,
            {"\n"}ou efetue o Login
        </Text>
        <KeyboardAvoidingView behavior="position" style={styles.userProperties}>
          <TextInput
            value={nome}
            onChangeText={text => setNome(text)}
            style={styles.input}
            placeholder='Escreva seu nome completo'
          />
          <TextInput
            value={email}
            onChangeText={text => setEmail(text)}
            style={styles.input}
            placeholder='Escreva seu Email'
          />
          <TextInput
            value={senha}
            onChangeText={text => setSenha(text)}
            secureTextEntry={true}
            style={styles.input}
            placeholder='Escreva sua senha'
          />
          <TextInput
            value={tipoUsuario}
            onChangeText={text => setTipoUsuario(text)}
            style={styles.input}
            placeholder='Tipo de cadastro (Ex: ADMIN, GERENTE)'
          />
        </KeyboardAvoidingView>

        <RectButton style={styles.button} onPress={handleCreateUser} >
          <Text style={styles.buttonText}>Cadastrar</Text>
        </RectButton>

        <View>
          <Text>
            Já possui um cadastro ?
            <Text style={{ color: 'blue' }} onPress={handleNavigateToLoginPage}>
              {' '}Entrar
            </Text>
          </Text>
        </View>

      </View>
    </ImageBackground>
  )
}

export default Register