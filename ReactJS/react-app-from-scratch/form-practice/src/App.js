import React from "react"

class App extends React.Component{
  constructor(){
    super()
    this.state = {
      firstName : "",
      lastName : "",
      isFriendly : true
    }
    this.handleChange = this.handleChange.bind(this)
  }

  handleChange(event){
    const {name, value} = event.target
    this.setState({
      [name] : value
    })
  }
  render(){
    return(
      <form>
        <input type="text" 
        name = "firstName" 
        value = {this.state.firstName}
        placeholder="firstName" 
        onChange = {this.handleChange}/>

        <br/>

        <input type="text" 
        name = "lastName" 
        value = {this.state.lastName}
        placeholder="lastName" 
        onChange = {this.handleChange}/>
        <h1>{this.state.firstName} {this.state.lastName}</h1>


        <textarea value = {"default text"}/>

        <label>
        <input 
         type = "checkbox"
         name ="isFriendly"
         checked = {this.state.isFriendly}
         onChange = {this.handleChange}
         />isFriendly?
         </label>
      </form>
    )
  }
}


export default App