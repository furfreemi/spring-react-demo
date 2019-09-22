import React, { Component } from 'react';
import '../css/App.css';
import api from '../api';
import LoadingIndicator from "./LoadingIndicator";

class Home extends Component {
    state = {
        isLoading: true,
        items: []
    };

    constructor(props) {
        super(props);
    }

    componentDidMount() {
        const response = api.get('/items').then(response => {
            this.setState({items: response.data});
            this.setState({isLoading: false});
        });
    }

    render() {
        return (<div>
            {this.state.isLoading ?
                <LoadingIndicator/> :
                this.state.items}
            </div>
        );
    }
}

export default Home;