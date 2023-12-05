import React from 'react';
import './styleCard.css'

class Card extends React.Component {
  render() {
    return (
      <div className='card'>
        <h1>Title Of Card</h1>
        <p>Paragraph Of Card</p>
        <button>.</button>
      </div>
    )
  }
}
export default Card