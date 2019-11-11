import axios from 'axios';

const baseURL = 'http://localhost:8080/'
const getAllItems = () => axios.get(baseURL + '/items');

export { getAllItems }