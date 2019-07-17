import React from "react"

function onclickCheckBox(){
    return(
        console.log("checked")
    )
}

function TodoItem(props) {
    return (
        <div className="todo-item">
            <input type="checkbox" checked={props.item.completed} onChange = {() => {console.log("checked")}}/>
            <p>{props.item.text}</p>
        </div>
    )
}

export default TodoItem