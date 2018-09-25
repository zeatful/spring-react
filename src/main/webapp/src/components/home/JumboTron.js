import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import { Button, Jumbotron } from 'react-bootstrap';

export default class JumboTron extends Component {
    componentDidMount() {
      var eventSource = new EventSource('http://localhost:8080/suggestions');
        eventSource.onopen = function(e) {
            console.info('Open!');
        };
        
      eventSource.onmessage = function(e) {
          console.info('Message!');
      };

        eventSource.onclose = function(e) {
            console.info('Closed!');
        };
    } 
    
    render() {
        return (
            <Jumbotron>
                <h1>Welcome!</h1>
                <p>
                    Voice a suggestion for others to vote on or vote on existing topics for your specific location!  Get traction behind your ideas and get the attention of leaders!
                </p>
                <p>
                    <Button bsStyle="primary">Get Started</Button>
                </p>
            </Jumbotron>
        );
    }
}