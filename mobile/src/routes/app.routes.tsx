import React from 'react'
import Main from '../pages/Main'

import { createStackNavigator } from '@react-navigation/stack'

const { Navigator, Screen } = createStackNavigator()

const AppRoutes: React.FC = () => (
  <Navigator screenOptions={{ headerShown: false }} >
    <Screen name="Main" component={Main} />
  </Navigator>
)

export default AppRoutes