import React, {Component} from "react"

//supports events in react, please refer this https://reactjs.org/docs/events.html#supported-events
class App extends Component{

  clickHandler(){
    return(
      console.log("I was clicked")
    )
  }
  render(){
    return(
      <div>
        <img onMouseOver = {() => {console.log("Hovered")}} src="https://www.fillmurray.com/200/100"/>
        <br/>
        <br/>
        <button onClick={this.clickHandler}>click me</button>
      </div>
    )
  }
}

export default App