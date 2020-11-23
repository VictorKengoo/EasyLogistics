import React from 'react'
import { Alert } from "react-native";

const createErrorMessage = (message: string) =>
  Alert.alert(
    "Erro",
    message,
    [
      { text: "OK", onPress: () => console.log("OK Pressed") }
    ],
    { cancelable: false }
  );

export default createErrorMessage