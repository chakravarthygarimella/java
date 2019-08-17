import React from 'react';
import Joke from "./Joke"

function App(){
  return (
    <div>
    <Joke jk = {{question : "What do you call it when you have your mom’s mom on speed dial?", answer: "Instagram"}}/>
    <Joke jk = {{question : "What should you do after your Nintendo game ends in a tie?", answer: "Ask for a Wii-match!"}}/>
    <Joke jk = {{question : "Why are iPhone chargers not called Apple Juice?", answer: "Apple iphone"}}/>
    <Joke jk = {{question : "How does a computer get drunk?", answer: "It takes screenshots"}}/>
    <Joke jk = {{question : "Why did the PowerPoint Presentation cross the road?", answer: "To get to the other slide"}}/>
    </div>
  )
}

export default App
