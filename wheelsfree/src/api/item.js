import axios from 'axios';
import baseURL from "./base";

const getAllItems = async () => {
    try {
        const response = await axios.get(baseURL + '/items');
        return response.data
    } catch (e) {
        return null
    }
}

const getAllItems2 = async () => {
    try {
        const response = await axios.get(baseURL + '/items2');
        return response.data
    } catch (e) {
        return null
    }
}

export { getAllItems, getAllItems2 }