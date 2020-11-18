import React from 'react'
import { Alert } from "react-native";

const createSuccessMessage = () =>
  Alert.alert(
    "Success",
    "Usuário cadastrado com sucesso!",
    [
      {
        text: "Cancel",
        onPress: () => console.log("Cancel Pressed"),
        style: "cancel"
      },
      { text: "OK", onPress: () => console.log("OK Pressed") }
    ],
    { cancelable: false }
  );

export default createSuccessMessage