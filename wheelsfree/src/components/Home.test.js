import React from 'react';
import { mount } from 'enzyme';
import { spy, spyOn } from 'sinon';
import Home from './Home';
import api from '../api'
import ItemCard from './ItemCard'
import {BrowserRouter} from "react-router-dom";

jest.mock("../api");

describe('<Home />', () => {

    const buildItem = (id) => ({
        id: id,
        name: 'TestItem',
        description: 'Some test item description',
        price: 28.32,
        imageUrl: 'testImgUrl'
    });

    it('should request all items from api', done => {
        api.get = (url) => {
            return Promise.resolve().then(() => {
                expect(url).toEqual('/items');
                done();
            });
        };

        mount(
            <BrowserRouter>
                <Home/>
            </BrowserRouter>
        );
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
