import { StyleSheet } from 'react-native'

const styles = StyleSheet.create({
  container: {
    flex: 1,
    flexDirection: 'column',
    alignItems: 'center',
    paddingTop: 250,
  },
  pageBackground: {
    flex: 1,
    resizeMode: "cover",
    justifyContent: "center",
    alignItems: 'center',
  },
  text: {
    paddingRight: 15,
    color: 'black',
    fontSize: 20,
    textAlign: "left",
    width: 240,
    height: 100,
    marginLeft: 170,
    fontFamily: 'Poppins_400Regular',
    fontStyle: 'normal',
    lineHeight: 27,
    marginBottom: 27
  },
  filesMan: {
    marginBottom: 70,
  },
  title: {
    position: 'absolute',
    top: 110,
    fontFamily: 'Poppins_400Regular',
    color: 'black',
    fontSize: 30,
    lineHeight: 25,
  },
  titleBig: {
    fontFamily: 'Poppins_800ExtraBold',
    fontSize: 45,
    lineHeight: 55,
  },
  button: {
    backgroundColor: '#5A50D2',
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 14,
    width: 313,
    height: 68,
    shadowOffset: { width: 6, height: 0 },
    shadowOpacity: 0.46,
    shadowRadius: 20,
    elevation: 5,
  },
  buttonText: {
    fontFamily: 'Poppins_700Bold',
    color: '#F1F0EE',
    fontSize: 20,
  },
})

export default styles