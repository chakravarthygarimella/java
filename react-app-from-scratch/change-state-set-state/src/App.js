import React from "react"
import style from "./style.css"

class App extends React.Component {
    constructor() {
        super()
        this.state = {
            count: 0,
            doubleTheNumber : 1,
            multiplyNumber : 2
        }
        this.handleClick = this.handleClick.bind(this)
        this.doubleTheNumber = this.doubleTheNumber.bind(this)
        this.multiplyNumber = this.multiplyNumber.bind(this)
    }

    handleClick(){
      this.setState((prevState) => {
        return {
          count : prevState.count + 1
        }
      })
    }

    doubleTheNumber(){
      return(
        this.setState(prevState => {
          return{
              doubleTheNumber : prevState.doubleTheNumber *2
          }
        })
      )
    }

    multiplyNumber(){
      return(
        this.setState(prevState => {
          return{
            multiplyNumber : prevState.multiplyNumber *prevState.multiplyNumber
          }
        })
      )
    }
    
    render() {
        return (
            <div>
                <h1>{this.state.count}</h1>
                <button onClick = {this.handleClick}>Change!</button>
                <hr/>
                <hr/>
                <hr/>
                <h1>{this.state.doubleTheNumber}</h1>
                <button onClick = {this.doubleTheNumber}>double the number!</button>
                <hr/>
                <hr/>
                <hr/>
                <h1>{this.state.multiplyNumber}</h1>
                <button onClick = {this.multiplyNumber}>Muliply the number</button>
            </div>
        )
    }
}

export default App
