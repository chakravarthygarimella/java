import React from "react"

function Joke(props){
    console.log(props)
    return (
        <div>
        <h2 style={{color: "blue"}}>Question: {props.jk.question}</h2>
        <h2 style={{color: "green"}}>Answer: {props.jk.answer}</h2>
        <hr style={{color: "green"}}/>
        </div>
    )
}

export default Joke