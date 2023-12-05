
import React from 'react';
import './styleSection1.css'


import Card from '../card/card'

class Section1 extends React.Component {
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
export default Section1

