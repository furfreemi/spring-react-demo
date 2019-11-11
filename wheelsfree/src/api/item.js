import axios from 'axios';
import baseURL from "./base";

const getAllItems = async () => {
    const response = await axios.get(baseURL + '/items');
    return response.data;
}

export { getAllItems }