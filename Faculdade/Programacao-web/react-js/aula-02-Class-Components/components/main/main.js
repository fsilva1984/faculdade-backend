import React from 'react';
import './styleMain.css';

import Section1 from '../section1/section1'
import Section2 from '../section2/section2'


class Main extends React.Component {
  render() {
    return (
      <div className='main'>
        <Section1 />
        <Section2 />
      </div>
    )
  }
}

export default Main