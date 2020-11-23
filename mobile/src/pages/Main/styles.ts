import { StyleSheet } from 'react-native'

const styles = StyleSheet.create({
  container: {
    flex: 1,
    flexDirection: 'column',
    alignItems: 'center',
    paddingTop: 180,
  },
  pageBackground: {
    flex: 1,
    resizeMode: "cover",
    justifyContent: "center",
    alignItems: 'center',
  },
  title: {
    position: 'absolute',
    top: 100,
    fontFamily: 'Poppins_700Bold',
    color: 'black',
    fontSize: 30,
    lineHeight: 40,
  },
  buttons: {
    marginTop: 0
  },
  button: {
    backgroundColor: '#5A50D2',
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 14,
    width: 313,
    height: 68,
    marginBottom: 47,
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