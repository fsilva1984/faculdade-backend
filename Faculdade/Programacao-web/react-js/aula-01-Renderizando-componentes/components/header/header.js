import './styleHeader.css';


//import components
import Input from "../input/input";
import Button from '../buttons/button';

function Hd() {
  return (
    <header className="header">
      <h1>Curso de React</h1>
      <p>Primeiros componentes renderizados!</p>
      <div>
        <Input />
        <Button />
      </div>

    </header>
  )
}

export default Hd