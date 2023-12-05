// ## paradigma POO

import React from "react"
import './style.css'

class Card extends React.Component {
  render() {
    console.log(this.props);
    return (
      <div className="card">
        <h1>{ this.props.title }</h1>
        <p>{ this.props.subTitle }</p>
        <p>Paragraph Of Card</p>
        <button>.</button>
      </div>
    )
  }
}
export default Card

//## Paradigma estruturado ##//

// import './style.css';

// const Card = ({ title, subTitle }) => {//shorthand notation
//   return (
//     <div className="card">
//       <h1>{title}</h1>
//       <p>{subTitle}</p>
//       <p>Paragraph Of Card</p>
//       <button>.</button>
//     </div>
//   )
// }
// export default Card

