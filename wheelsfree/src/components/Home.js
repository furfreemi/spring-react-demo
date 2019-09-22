import React, { Component } from 'react';
import '../css/App.css';
import api from '../api';
import LoadingIndicator from "./LoadingIndicator";
import ItemCard from "./ItemCard";

class Home extends Component {
    constructor(props) {
        super(props);

        this.state = {
            isLoading: true,
            items: []
        };
    }

    componentDidMount() {
        api.get('/items').then(response => {
            this.setState({
                items: response.data.items,
                isLoading: false
            });
        });
    }

    render() {
        return (<div style={{display: 'flex', justifyContent: 'center'}}>
            {this.state.isLoading ?
                <LoadingIndicator/> :
                <div>
                    {this.state.items.map(
                        item => <ItemCard
                            key={item.id}
                            item={item}/>
                    )}
                </div>}
            </div>
        );
    }
}

export default Home;