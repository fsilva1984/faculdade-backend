
import './style.css';
import React from 'react';

class Button extends React.Component {
  render() {
    return (
      <button className='button'>{ this.props.label }</button>
    )
  }
}

//## Paradigma estruturado ou funcional ##//
// const Button = ({ label }) => {// shorthand notation
//   return <button className='button'>{label}</button>
// }


// Definindo propriedades padrao
Button.defaultProps = {
  label: 'Download'
}
export default Button 