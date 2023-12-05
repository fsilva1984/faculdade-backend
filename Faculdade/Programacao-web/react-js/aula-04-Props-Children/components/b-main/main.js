// import React from "react";
// import './styleMain.css';
// import Card from '../c-card/card';

// class Main extends React.Component {
//   render() { 
//     return (
//       <div className="main"> 
//         <Card title='Title Of Card' subTitle='Paragraph Of Card'/>
//       </div>
//     )
//   }
// }
// export default Main

//## Paradigma estruturado, obtendo o children ##//

import './styleMain.css';
import Card from '../c-card/card';
export default function Main() {
  return (
    <div className='main'>
      <Card>
        <h1>Title Of Card</h1>
        <p>Paragraph Of Card</p>
      </Card>

      <Card>
        <h1>Title Of Card</h1>
        <p>Paragraph Of Card</p>
      </Card>

    </div>


  )
}