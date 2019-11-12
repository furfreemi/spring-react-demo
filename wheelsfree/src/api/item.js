import axios from 'axios';
import baseURL from "./base";

const ItemApi = {
    getAllItems: async () => {
        try {
            const response = await axios.get(baseURL + '/items');
            return response.data
        } catch (e) {
            return null
        }
    }
}

export default ItemApi