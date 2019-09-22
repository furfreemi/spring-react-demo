import React from 'react';
import { mount } from 'enzyme';
import { spy } from 'sinon';
import Home from './Home';

spy(Home.prototype, 'componentWillMount');

describe('<Home />', () => {
    it('calls componentWillMount', () => {
        const wrapper = mount(<Home />);
        expect(Home.prototype.componentWillMount).to.have.property('callCount', 1);
    });
});
