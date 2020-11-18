import axios from 'axios'
import { backendBaseURL } from '../../myConfig.json'

const api = axios.create({
  baseURL: backendBaseURL
})

export default api