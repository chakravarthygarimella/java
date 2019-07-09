import React from "react"
import { red } from "ansi-colors";

function App(){

  const date = new Date(2018,6,8,20)
  const hours = date.getHours()
  let timeOfDay

  const styles = {
    color:"black",
    backgroundColor:"red", 
    fontSize:100
   }

  if(hours < 12){
    timeOfDay = "morning"
    styles.color = "blue"
  } 
  else if(hours >= 12 && hours <= 17){
    timeOfDay = "afternoon"
    styles.color = "yellow"
  }
  else{
    timeOfDay = "night"
    styles.color = "white"
  }

  return (
    <h1 style = {styles}>Good {timeOfDay}!</h1>
  )
}

export default App