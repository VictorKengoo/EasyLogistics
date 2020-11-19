import { StyleSheet } from 'react-native'

const styles = StyleSheet.create({
  container: {
    flex: 1,
    flexDirection: 'column',
    alignItems: 'center',
  },
  pageBackground: {
    flex: 1,
    resizeMode: "cover",
  },
  title: {
    fontFamily: 'Poppins_700Bold',
    color: 'black',
    alignSelf: 'center',
    fontSize: 30,
    paddingTop: 110,
    marginBottom: 37
  },
  phoneMan: {
    alignSelf: 'center',
    marginBottom: 29
  },
  inputs: {
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
    shadowColor: '#000',
    shadowOpacity: 0.46,
    shadowRadius: 20,
    elevation: 5,
  },
  button: {
    backgroundColor: '#5A50D2',
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 14,
    shadowColor: '#000',
    shadowOffset: { width: 6, height: 0 },
    shadowOpacity: 0.46,
    shadowRadius: 20,
    elevation: 5,
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