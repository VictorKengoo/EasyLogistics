import React from 'react'
import { Alert } from "react-native";

const createSuccessMessage = (message: string) =>
  Alert.alert(
    "Success",
    message,
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