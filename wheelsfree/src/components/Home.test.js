import React from 'react';
import { mount } from 'enzyme';
import { expect } from 'jest';
import { spy } from 'sinon';
import Home from './Home';

describe('<Home />', () => {
    it('calls componentWillMount', () => {
        const wrapper = mount(<Home />);
        spy(Home, 'componentWillMount');
        expect(Home.componentWillMount).to.have.property('callCount', 1);
    });
});
