import React from "react"
import Styles from "./Styles.css"
import ContactCard from "./ContactCard"

function App(){
  return (
    <div className = "contacts">
        <ContactCard
           name="Mr. Chakri" 
           image="http://placekitten.com/300/200" 
           phone="(098) 555-1234" 
           email="mr.chex@catnap.meow"
        />
        <ContactCard
           name="Mr. Naveen" 
           image="http://placekitten.com/300/200" 
           phone="(235) 555-1234" 
           email="mr.nav@catnap.meow"
        />
        <ContactCard
           name="Mr. Amar" 
           image="http://placekitten.com/300/200" 
           phone="(678) 555-1234" 
           email="mr.amm@catnap.meow"
        />
        <ContactCard
           name="Mr. Sarath" 
           image="http://placekitten.com/300/200" 
           phone="(345) 555-1234" 
           email="mr.saru@catnap.meow"
        />
    </div>
  )
}

export default App