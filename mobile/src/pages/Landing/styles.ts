import { StyleSheet } from 'react-native'

const styles = StyleSheet.create({
  container: {
    flex: 1,
    flexDirection: 'column',
    justifyContent: 'center',
    alignItems: 'center',
    padding: 45
  },
  pageBackground: {
    flex: 1,
    resizeMode: "cover",
    justifyContent: "center",
    alignItems: 'center',
  },
  text: {
    paddingRight: 40,
    color: 'black',
    fontSize: 20,
    textAlign: "left",
    position: 'absolute',
    width: 235,
    height: 100,
    left: 150,
    top: 277,
    fontFamily: 'Poppins_400Regular',
    fontStyle: 'normal',
    lineHeight: 27,
  },
  filesMan: {
    position: 'absolute',
    left: 20,
    top: 397,
  },
  title: {
    fontFamily: 'Poppins_400Regular',
    color: 'black',
    fontSize: 30,
    lineHeight: 50,
    top: -224,
  },
  titleBig: {
    fontFamily: 'Poppins_800ExtraBold',
    fontSize: 45,
    lineHeight: 50,
  },
  button: {
    position: 'absolute',
    backgroundColor: '#5A50D2',
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 14,
    width: 309,
    height: 68,
    left: 25,
    top: 661,
  },
  buttonText: {
    fontFamily: 'Poppins_700Bold',
    color: '#F1F0EE',
    fontSize: 20,

  },
})

export default styles