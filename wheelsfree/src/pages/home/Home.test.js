import React from 'react';
import { mount, shallow } from 'enzyme';
import { spy, spyOn } from 'sinon';
import Home from './Home';
import ItemCard from '../../components/ItemCard'
import { BrowserRouter } from "react-router-dom";
import baseURL from "../../api/base";
import mockAxios from "../../__mocks__/axios";

const buildItem = (id) => ({
    id: id,
    name: 'TestItem',
    description: 'Some test item description',
    price: 28.32,
    imageUrl: 'testImgUrl'
});

describe('<Home />', () => {
    // mockResolvedValue
    it("should fetches data from api items when Home mounted", (done) => {
        // mock
        // mockAxios.get.mockImplementationOnce(() =>
        //     Promise.resolve({
        //         data: { items: [buildItem(1), buildItem(2), buildItem(3)] }
        //     })
        // );
        mockAxios.get.mockResolvedValue({
            data: { items: [buildItem(1), buildItem(2), buildItem(3)] }
        })

        //mount
        const wrapper = mount(
            <BrowserRouter>
                <Home/>
            </BrowserRouter>
        );

        // expect
        expect(mockAxios.get).toHaveBeenCalledTimes(1);
        expect(mockAxios.get).toHaveBeenCalledWith(baseURL + '/items');

        setTimeout(() => {
            wrapper.update();
            expect(wrapper.find('ItemCard').length).toEqual(3);
            done()
        }, 1000)
    });

    it('should render a card for each item', done => {
        const mockedGetItems = () => Promise.resolve({
            data: {
                items: [
                    buildItem(14), buildItem(15), buildItem(16)
                ]
            }
        });

        let promise;
        api.get = () => {
            promise = Promise.resolve().then(mockedGetItems);
            return promise;
        };

        const wrapper = mount(
            <BrowserRouter>
                <Home/>
            </BrowserRouter>
        );

        promise.then(() => {
            wrapper.update();
            expect(wrapper.find('ItemCard').length).toEqual(3);
            done();
        });
    });
});
