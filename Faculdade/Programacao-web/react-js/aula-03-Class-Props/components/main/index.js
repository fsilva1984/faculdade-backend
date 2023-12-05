// ## paradigma POO

import React from "react";
import './style.css';
import Card from "../cards/index";

class Main extends React.Component {
  render() {// Ao primerio Card daremos uma propriedade
    return (
      <div className="main">
        <Card title='Title Of Card 1' subTitle=' Card - 01' />
        <Card title='Title Of Card 2' subTitle=' Card - 02' />
        <Card title='Title Of Card 3' subTitle=' Card - 03' />
      </div>
    )
  }
}

export default Main

//## Mesmo codigo no paradigma estruturado (funções) ou funcional ##//

// import './style.css'

// import Card from "../cards/index";

// export default function Main() {

//   return (
//     <div className="main">
//       <Card title='Title Of Card 1' subTitle=' Card - 01' />
//       <Card title='Title Of Card 2' subTitle=' Card - 02' />
//       <Card title='Title Of Card 3' subTitle=' Card - 03' />
//     </div>
//   )
// }























