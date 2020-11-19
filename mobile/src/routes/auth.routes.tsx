import React from 'react'
import Landing from '../pages/Landing'
import Register from '../pages/Register'
import Login from '../pages/Login'

import { createStackNavigator } from '@react-navigation/stack'

const { Navigator, Screen } = createStackNavigator()

const AuthRoutes: React.FC = () => (
  <Navigator screenOptions={{ headerShown: false }} >
    <Screen name="Landing" component={Landing} />
    <Screen name="Register" component={Register} />
    <Screen name="Login" component={Login} />
  </Navigator>
)

export default AuthRoutes