import React from "react"

class Conditional extends React.Component{
    render(){
        return(
            <div>
                {this.props.isLoading == true ? <h1>Loading.....</h1> : <h1>Data got saved in database successfully</h1>}
            </div>
        )
    }    
}

export default Conditional