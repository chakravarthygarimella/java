import React from "react"
import TodoItem from "./TodoItem"
import Styles from "./styles.css"

function App(){
  return (
    <div className = "todo-list">
        <TodoItem/>
        <TodoItem/>
        <TodoItem/>
        <TodoItem/>
        <TodoItem/>
    </div>
  )
}

export default App