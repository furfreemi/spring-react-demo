import React, { Component } from 'react';
import '../../css/App.css';
import { getAllItems, getAllItems2 } from '../../api/item';
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
        this.setState({ isLoading: true }, async () => {
                const data = await getAllItems();
                let data2 = await getAllItems2();
                this.setState({
                    items: data.items,
                    isLoading: false
                });
            }
        )
    }

    render() {
        return (
            <div>
                {this.state.isLoading ?
                    <LoadingIndicator/> :
                    <>
                        {this.state.items.map(item =>
                            <ItemCard
                                key={item.id}
                                item={item}
                            />
                        )}
                    </>
                }
            </div>
        );
    }
}

export default Home;