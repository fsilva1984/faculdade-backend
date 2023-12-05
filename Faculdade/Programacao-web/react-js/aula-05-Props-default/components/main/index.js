import './style.css';
import React from "react";
import Button from '../buttons/index';

class Main extends React.Component {
  render() {
    return (
      <div className='main'>
        <header className='header'>
          <h1>React - Aula 5 Props Default</h1>
        </header>
        <Button label='Click'/>
        <Button />
        <Button label='About' />
        <Button label='Link' />
        <Button label='Search'/>
      </div>
    )
  }
}



export default Main