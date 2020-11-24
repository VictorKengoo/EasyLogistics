import { StyleSheet } from 'react-native'

const styles = StyleSheet.create({
  container: {
    flex: 1,
    flexDirection: 'row',
    alignItems: 'center',
    backgroundColor: "#F1F0EE",
    width: 350,
    height: 100,
    borderRadius: 9,
    marginTop: 50,
  },
  nomeText: {
    flex: 1,
    flexDirection: 'column',
    paddingLeft: 20,
    marginRight: 50,
  },
  quantidadeText: {
    marginRight: 20,
  }
})

export default styles