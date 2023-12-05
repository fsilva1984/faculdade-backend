// import React from "react";
// import './styleCard.css';

// class Card extends React.Component {
//   render() {
//     return (
//       <div className="card">
//         <h1>{this.props.title}</h1>
//         <p>{this.props.subTitle}</p>
//       </div>
//     )
//   }
// }

// export default Card

//## Paradigma estruturado ou funcional ##//
import './styleCard.css'

export default function Crad({ children }) {
  return (
    <div className='card'>{children}</div>
  )
}

