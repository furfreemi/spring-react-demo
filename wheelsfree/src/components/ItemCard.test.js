import React from 'react';
import {mount, shallow} from 'enzyme';
import { spy } from 'sinon';
import ItemCard from './ItemCard';
import Button from "@material-ui/core";
import {BrowserRouter} from "react-router-dom";

describe('<ItemCard />', () => {

    const item = {
      id: 10,
      name: 'TestItem1',
      description: 'Test item description',
      price: 25.25,
      imageUrl: 'testurl'
    };

    it('should display item name, description, and formatted price', () => {
        const wrapper = mount(
            <BrowserRouter>
                <ItemCard item={item} />
            </BrowserRouter>
        );

        const displayedText = wrapper.text();
        expect(displayedText).toEqual(expect.stringContaining(item.name));
        expect(displayedText).toEqual(expect.stringContaining(item.description));
        expect(displayedText).toEqual(expect.stringContaining(`$${item.price}`));
    });

    it('should direct to item details on reservation selection', () => {
        const wrapper = mount(
            <BrowserRouter>
                <ItemCard item={item}/>
            </BrowserRouter>
        );

        wrapper
            .find('button')
            .first()
            .simulate("click");

        const history = wrapper.instance().history;
        const currentPath = history.location.pathname;

        expect(currentPath).toEqual(`/item/${item.id}`);
    });
});
