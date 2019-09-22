import React, { Component } from 'react';
import '../css/App.css';

class ItemDetail extends Component {

    render() {
        const { id: itemId } = this.props.match.params;
        return (
            <div>
                {itemId}
            </div>
        );
    }
}

export default ItemDetail;