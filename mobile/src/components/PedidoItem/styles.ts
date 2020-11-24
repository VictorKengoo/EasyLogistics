import { StyleSheet } from 'react-native'

const styles = StyleSheet.create({
  container: {
    flex: 1,
    flexDirection: 'column',
    alignItems: 'center',
    backgroundColor: "#F1F0EE",
    width: 345,
    borderRadius: 9,
    marginTop: 30,
  },
  containerInside: {
    flex: 1,
    flexDirection: 'row',
    paddingTop: 15,
    paddingBottom: 25
  },
  nomeText: {
    flex: 1,
    flexDirection: 'column',
    paddingLeft: 20,
    marginRight: 50,
  },
  quantidadeText: {
    marginRight: 20,
  },
  status: {
    paddingBottom: 20
  },
  iconButtons: {
    flex: 1,
    flexDirection: 'row',
    justifyContent: 'space-between',

  }
})

export default styles