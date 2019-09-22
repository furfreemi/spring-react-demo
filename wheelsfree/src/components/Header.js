import React from 'react'
import { Typography } from "@material-ui/core";
import { Link } from 'react-router-dom';

const Header = () => (
    <div style={{
        display: 'flex',
        justifyContent: 'center',
        padding: '40px',
        borderBottom: '2px solid #000000'
    }}>
        <Link to="/" style={{textDecoration: 'none', color: '#000000'}}>
            <Typography variant="h2">WheelsFree</Typography>
        </Link>
    </div>
);

export default Header;