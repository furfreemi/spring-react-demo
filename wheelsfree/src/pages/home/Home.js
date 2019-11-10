import React, { Component } from 'react';
import '../../css/App.css';
import api from '../../api';
import LoadingIndicator from "../../components/LoadingIndicator";
import ItemCard from "../../components/ItemCard";

class Home extends Component {
    constructor(props) {
        super(props);

        this.state = {
            isLoading: false,
            items: []
        };
    }

    componentDidMount() {
        this.setState({isLoading: true}, () => {
                api.get('/items').then(response => {
                    this.setState({
                        items: response.data.items,
                        isLoading: false
                    });
                }).finally(() => {
                    this.setState({
                        isLoading: false
                    })
                })
            }
        )
    }

    render() {
        return (
            <div>
                {this.state.isLoading ?
                    <LoadingIndicator/> :
                    <div>
                        {this.state.items.map(item =>
                            <ItemCard
                                key={item.id}
                                item={item}
                            />
                        )}
                    </div>
                }
            </div>
        );
    }
}

export default Home;