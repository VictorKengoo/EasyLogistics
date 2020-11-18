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
  },
  title: {
    position: 'absolute',
    top: 100,
    fontFamily: 'Poppins_700Bold',
    color: 'black',
    fontSize: 30,
    lineHeight: 40,
    marginBottom: 100
  },
  userProperties: {
    marginBottom: 45
  },
  input: {
    fontFamily: 'Poppins_400Regular',
    fontSize: 13,
    letterSpacing: 0.6,
    height: 50,
    width: 325,
    backgroundColor: '#F2F2F2',
    borderRadius: 20,
    marginBottom: 34,
    justifyContent: 'center',
    paddingHorizontal: 16,
  },
  button: {
    backgroundColor: '#5A50D2',
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 14,
    width: 313,
    height: 68,
    marginBottom: 8,
  },
  buttonText: {
    fontFamily: 'Poppins_700Bold',
    color: '#F1F0EE',
    fontSize: 20,
  },
})

export default styles