import React from 'react';
import ReactDOM from 'react-dom';
import './css/index.css';
import * as serviceWorker from './serviceWorker';
import NotFound from "./components/NotFound";
import {Route, BrowserRouter as Router, Switch} from 'react-router-dom';
import Home from "./pages/home/Home";
import Header from "./components/Header";
import ItemDetail from "./pages/itemDetail/ItemDetail";

const routing = (
    <Router>
        <Header />
        <div>
        <Switch>
            <Route path="/item/:id" component={ItemDetail}/>
            <Route exact path="/" component={Home} />
            <Route component={NotFound} />
        </Switch>
        </div>
    </Router>
);

ReactDOM.render(routing, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
