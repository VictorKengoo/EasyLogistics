import { StyleSheet } from 'react-native'

const styles = StyleSheet.create({
  container: {
    flex: 1,
    flexDirection: 'column',
    alignItems: 'center',
    paddingTop: 40,
  },
  pageBackground: {
    flex: 1,
    resizeMode: "cover",
    justifyContent: "center",
    alignItems: 'center',
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
    height: 285,
    marginTop: 25,
    shadowOffset: { width: 6, height: 0 },
    shadowOpacity: 0.46,
    shadowRadius: 20,
    elevation: 5,
  },
  buttonText: {
    fontFamily: 'Poppins_700Bold',
    color: '#F1F0EE',
    fontSize: 40,
  },
  signOutButton: {
    backgroundColor: '#D25050',
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 14,
    width: 313,
    height: 40,
    marginTop: 25,
    shadowOffset: { width: 6, height: 0 },
    shadowOpacity: 0.46,
    shadowRadius: 20,
    elevation: 5,
  },
  buttonLogOutText: {
    fontFamily: 'Poppins_700Bold',
    color: '#F1F0EE',
    fontSize: 15,
  },
})

export default styles