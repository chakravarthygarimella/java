import React, {Component} from "react"
class App extends Component {
    constructor() {
        super()
        this.state = {
          isLoading: false,
          apiData : {}
        }
    }
    
    componentDidMount() {
      this.setState({isLoading: true})
        fetch("http://localhost:8080/api/v1/employees/1")
            .then(response => response.json())
            .then(data => {
              this.setState({
                  apiData : data
              })
            })
    }
     
    render() {
        return (
            <div>
                <h2>id: {this.state.apiData.id}</h2>
                <hr/>
                <h2>id: {this.state.apiData.firstName}</h2>
                <hr/>
                <h2>id: {this.state.apiData.lastName}</h2>
                <hr/>
                <h2>id: {this.state.apiData.emailId}</h2>
            </div>
        )
    }
}

export default App
