interface Response {
  token: string
  user: {
    name: string
    email: string
    type: string
  }
}

export function signIn(): Promise<Response> {
  return new Promise(resolve => {
    setTimeout(() => {
      resolve({
        token: 'as9d8fha97fgb87wgh3r9782gb3978twg79fg7w8eghf897w4g',
        user: {
          name: 'Victor',
          email: 'victor@victor.com',
          type: 'ADMIN'
        }
      })
    })
  })
}