import React from "react";
import Button from "./index";

class Buttons extends React.Component {
  render() {
    return (
      <>
        <Button />
        <Button label='Posts' />
        <Button label='Blog' />
        <Button label='Link' />
        <Button label='About' />
      </>
    )
  }
}; export default Buttons