import React from "react"

class App extends React.Component{
  constructor(){
    super()
    this.state = {
      unreadMessahes : ["2", "3", "3"]
    }
  }
  render(){
    return(
      <div>
        {
          this.state.unreadMessahes.length > 0 && <h1>you have unread {this.state.unreadMessahes.length} messages</h1>
        }
      </div>
    )
  }
}

export default App