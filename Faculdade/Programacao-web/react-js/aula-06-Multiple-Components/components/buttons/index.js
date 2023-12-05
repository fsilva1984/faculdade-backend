import React from "react";
import './style.css';

class Button extends React.Component {
  render() { 
    return (
      <button className="btn">{this.props.label}</button>
    )
  }
}

Button.defaultProps = {
  label: 'Click'
}

export default Button