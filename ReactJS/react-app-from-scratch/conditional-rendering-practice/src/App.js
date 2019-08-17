import React from "react"

class App extends React.Component{
  constructor(){
    super()
    this.state = {
      isLoggedin : "true"
    }
    this.onClickHandler = this.onClickHandler.bind(this)
  }

  onClickHandler(){
    return(
      this.setState(prevState => {
        return{
            isLoggedin : !prevState.isLoggedin
        }
      })
    )
  }
  render(){
    let buttonText = this.state.isLoggedin ? "LOGIN" : "LOGOUT"
    let displayText = this.state.isLoggedin ? "logged out" : "logged in"
    return(
      <div>
        <button onClick = {this.onClickHandler}>{buttonText}</button>
        <h1>{displayText}</h1>
      </div>
    )
  }
}

export default App