import React from 'react';
import Joke from "./Joke"
import JokesData from "./JokesData"

function App() {
  const jokesComponents = JokesData.map(joke => <Joke key={joke.id} question = {joke.question} answer={joke.answer}/>)
  return (
    <div>
    {jokesComponents}
    </div>
  );
}

export default App;
