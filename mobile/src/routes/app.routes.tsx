import React from 'react'
import Main from '../pages/Main'
import Estoque from '../pages/Estoque'
import Pedidos from '../pages/Pedidos'
import Produtos from '../pages/Produtos'

import { createStackNavigator } from '@react-navigation/stack'

const { Navigator, Screen } = createStackNavigator()

const AppRoutes: React.FC = () => (
  <Navigator>
    <Screen options={{ headerShown: false }} name="Main" component={Main} />
    <Screen name="Estoque" component={Estoque} />
    <Screen name="Pedidos" component={Pedidos} />
    <Screen name="Produtos" component={Produtos} />
  </Navigator>
)

export default AppRoutes