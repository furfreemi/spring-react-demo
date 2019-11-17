import React, { Component } from 'react';
import '../../css/App.css';
import { TextField } from "@material-ui/core";

class ItemDetail extends Component {
    constructor(props) {
        super(props);

        this.state = {
            name: '',
            email: ''
        }
    }

    handleNameChange = (event) => {
        this.setState({name: event.target.value})
    };

    render() {
        const itemId = this.props.match.params.id;
        return (
            <div>
                Currently viewing item {itemId}

                <TextField
                    required
                    label="Name"
                    value={this.state.name}
                    onChange={this.handleNameChange}
                />
            </div>
        );
    }
}

export default ItemDetail;