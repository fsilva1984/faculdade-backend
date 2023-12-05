import React from 'react';
import './styleHeader.css';

class Header extends React.Component {
  render() {
    return (
      <header className='header'>
        <div>
          <h1>React Aula 2</h1>
          <p>Conseitos de class</p>
        </div>
      </header>
    )
  }
}

export default Header