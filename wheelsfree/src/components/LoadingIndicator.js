import React from 'react';
import LinearProgress from '@material-ui/core/LinearProgress';

const LoadingIndicator = () => (
    <div styles={{flexGrow: 1}}>
        <LinearProgress color="secondary" />
    </div>
);

export default LoadingIndicator;