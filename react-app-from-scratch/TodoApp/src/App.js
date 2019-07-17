import React from "react"
import TodoItem from "./TodoItem"
import Styles from "./styles.css"
import todosData from "./todosData";

function App(){

  const todoItems = todosData.map(todoitem => <TodoItem  key = {todoitem.id} item = {todoitem}/>)
  return (
    <div className = "todo-list">
        {todoItems}
    </div>
  )
}

export default App