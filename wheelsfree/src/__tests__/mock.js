import axios from "axios";
import baseURL from "../api/base";

beforeEach(() => {
    expect.hasAssertions();
});

describe('Mock', () => {
    test('how to mock axios(Promise) by jest', (done) => {
        let api = () => axios.get("http://localhost:8080/");
        // call api without mock
        // api()

        // mock here
        api = jest.fn(() => Promise.resolve({ data: ['product1', 'product2', 'product3'] }))

        api().then((res) => {
            expect(res).toEqual({ data: ['product1', 'product2', 'product3'] });
            expect(api).toHaveBeenCalledTimes(1);
            done()
        })
    });

    test('how to mock async await api by jest', () => {
        let api = async () => {
            try {
                const response = await axios.get(baseURL);
                return response.data
            } catch (e) {
                return null
            }
        }
        // call api without mock
        // const data = await api()
        // console.log(data)

        // mock here
        api = jest.fn(() => ['product1', 'product2', 'product3'])
        const data = api()
        console.log(data)
        expect(data).toEqual(['product1', 'product2', 'product3']);
        expect(api).toHaveBeenCalledTimes(1);
    });
})