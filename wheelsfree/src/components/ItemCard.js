import React from 'react';
import '../css/App.css';
import PropTypes from "prop-types";
import { withRouter } from 'react-router-dom';
import { Button, Card, CardActions, CardContent, CardMedia, Typography } from "@material-ui/core";

const ItemCard = props => {
    const { id, name, description, imageUrl, price } = props.item;

    const onItemSelect = () => {
        props.history.push(`/item/${id}`);
    };

    return (
        <Card style={{ margin: '50px' }}>
            <CardMedia
                style={{ margin: '0 auto', width: '600px', maxHeight: '250px' }}
                component='img'
                src={imageUrl}
            />

            <CardContent style={{ textAlign: 'center' }}>
                <Typography variant="h5">
                    {name}
                </Typography>
                <Typography variant="body1">
                    {description}
                </Typography>
            </CardContent>

            <CardActions style={{ paddingBottom: '16px', display: 'flex', justifyContent: 'center' }}>
                <Button
                    variant="outlined"
                    size="large"
                    color="secondary"
                    onClick={onItemSelect}>
                    Reserve
                </Button>
                <Typography variant="body1">
                    ${price}
                </Typography>
            </CardActions>
        </Card>
    );
};

ItemCard.propTypes = {
    item: PropTypes.shape({
        id: PropTypes.number.isRequired,
        name: PropTypes.string.isRequired,
        description: PropTypes.string.isRequired,
        imageUrl: PropTypes.string.isRequired,
        price: PropTypes.number.isRequired
    }).isRequired
};


export default withRouter(ItemCard);