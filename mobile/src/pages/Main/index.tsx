import React from 'react'
import { View, Image, ImageBackground, Text, TouchableOpacity, Button } from 'react-native'

import styles from './styles'

import pageBackground from '../../assets/images/pageBackground.png'

function Main() {
  return (
    <ImageBackground source={pageBackground} style={styles.pageBackground}>
      <View style={styles.container}>

      </View>
    </ImageBackground>
  )
}

export default Main