import React from "react"
import Styles from "./styles.css"

function TodoItem(props){
    return(
    <div className = "todo-item">
        <input type = "checkbox" checked = {props.item.completed}/>
        <p style = {{color:"red", fontWeight:"bold"}}>{props.item.text}</p>
    </div>
    )
}

export default TodoItem