import React from 'react'
import { NavigationContainer } from '@react-navigation/native'
import { createStackNavigator } from '@react-navigation/stack'

import Landing from '../pages/Landing'
import Register from '../pages/Register'
import Login from '../pages/Login'
import Main from '../pages/Main'

const { Navigator, Screen } = createStackNavigator()
function AppStack() {
  return (
    <NavigationContainer>
      <Navigator screenOptions={{ headerShown: false }} >
        <Screen name="Landing" component={Landing} />
        <Screen name="Register" component={Register} />
        <Screen name="Login" component={Login} />
        <Screen name="Main" component={Main} />
      </Navigator>
    </NavigationContainer>
  )
}

export default AppStack