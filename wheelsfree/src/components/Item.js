import React, { Component } from 'react';
import '../css/App.css';

class Item extends Component {
    render() {
        return (<div>
                Item: {this.props.match.params.id}
            </div>
        );
    }
}

export default Item;