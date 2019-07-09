import React from "react"
import Styles from "./styles.css"

function TodoItem(){
    return(
    <div className = "todo-item">
        <input type = "checkbox"/>
        <p>This is the placeholder text</p>
    </div>
    )
}

export default TodoItem