import React from "react"

class App extends React.Component{
  constructor(){
    super();
    this.state = {
      answer: "Chakri"
    }
  }
  render(){
    return(
      <div>
          <h1>Hello, {this.state.answer}</h1>
      </div>
    )
  }
}

export default App