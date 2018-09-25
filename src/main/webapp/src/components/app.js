import React, {Component} from 'react';
import ReactDOM from 'react-dom';

import NavBar from './home/NavBar';
import JumboTron from './home/JumboTron';
export default class App extends Component {
  render() {
    return (
      <div>
      <NavBar></NavBar>
      <JumboTron></JumboTron>
      </div>
    );
  }
}