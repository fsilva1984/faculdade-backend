import React from 'react';
import './styleSection2.css'


import Card from '../card/card'

class Section2 extends React.Component {
  render() {
    return (

      <section className='section'>
        <Card />
        <Card />
        <Card />
      </section>

    )
  }
}
export default Section2