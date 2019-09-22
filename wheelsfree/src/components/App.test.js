import React from 'react';
import { expect } from 'chai';
import { mount } from 'enzyme';
import { spy } from 'sinon';
import App from './App';

spy(App.prototype, 'componentWillMount');

describe('<App />', () => {
    it('calls componentWillMount', () => {
        const wrapper = mount(<App />);
        expect(App.prototype.componentWillMount).to.have.property('callCount', 1);
    });
});
