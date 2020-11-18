import React from 'react'
import { Alert } from "react-native";

const createErrorMessage = () =>
  Alert.alert(
    "Erro",
    "Erro no cadastro",
    [
      { text: "OK", onPress: () => console.log("OK Pressed") }
    ],
    { cancelable: false }
  );

export default createErrorMessage