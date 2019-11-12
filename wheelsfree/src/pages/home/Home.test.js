import React from 'react';
import { mount, shallow } from 'enzyme';
import { spy, spyOn } from 'sinon';
import Home from './Home';
import ItemCard from '../../components/ItemCard'
import { BrowserRouter } from "react-router-dom";
import ItemApi from "../../api/item"

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
        ItemApi.getAllItems = jest.fn(() => {
            return { items: [buildItem(1), buildItem(2), buildItem(3)] }
        });
        //mount
        const wrapper = mount(
            <BrowserRouter>
                <Home/>
            </BrowserRouter>
        );

        // expect
        setTimeout(() => {
            wrapper.update();
            expect(ItemApi.getAllItems).toHaveBeenCalledTimes(1);
            expect(wrapper.find('ItemCard').length).toEqual(3);
            done()
        }, 100)
    });
});
