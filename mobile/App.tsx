import { StatusBar } from 'expo-status-bar';
import React, { useEffect, useState } from 'react';
import { ActivityIndicator, StyleSheet, Text, View } from 'react-native';
// import AppStack from './src/routes/AppStack'
import { AppLoading } from 'expo';
import { useFonts, Poppins_400Regular, Poppins_600SemiBold, Poppins_800ExtraBold, Poppins_700Bold } from '@expo-google-fonts/poppins';
import { AuthProvider } from './src/contexts/auth'
import Routes from './src/routes'
import { NavigationContainer } from '@react-navigation/native';

export default function App() {
  let [fontsLoaded] = useFonts({
    Poppins_400Regular,
    Poppins_600SemiBold,
    Poppins_700Bold,
    Poppins_800ExtraBold
  });

  if (!fontsLoaded) {
    return <AppLoading />
  } else {
    return (
      <NavigationContainer>
        <AuthProvider>
          <Routes />
        </AuthProvider>
        <StatusBar style='auto' />
      </NavigationContainer>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
