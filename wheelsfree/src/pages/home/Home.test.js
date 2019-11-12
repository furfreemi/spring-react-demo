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
    it("should fetches item from items api and render items when Home mounted", (done) => {
        // mock
        mockAxios.get.mockImplementationOnce(() =>
            Promise.resolve({
                data: { items: [buildItem(1), buildItem(2), buildItem(3)] }
            })
        ).mockImplementationOnce(() =>
            Promise.resolve({
                data: { items: [buildItem(4)] }
            })
        )

        //mount
        const wrapper = mount(
            <BrowserRouter>
                <Home/>
            </BrowserRouter>
        );

        // expect
        setTimeout(() => {
            wrapper.update();
            expect(mockAxios.get).toHaveBeenCalledTimes(2);
            expect(mockAxios.get.mock.calls[0]).toEqual([baseURL + '/items']);
            expect(mockAxios.get.mock.calls[1]).toEqual([baseURL + '/items2']);
            // expect(mockAxios.get).toHaveBeenCalledWith(baseURL + '/items2');
            expect(wrapper.find('ItemCard').length).toEqual(3);
            done()
        }, 100)
    });
});
