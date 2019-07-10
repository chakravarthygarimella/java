import React from "react"

function Joke(props){
    console.log(props)
    return (
        <div>
        <h2>Question: {props.jk.question}</h2>
        <h2>Answer: {props.jk.answer}</h2>
        <hr/>
        </div>
    )
}

export default Joke