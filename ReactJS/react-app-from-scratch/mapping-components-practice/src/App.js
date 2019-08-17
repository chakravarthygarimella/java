import React from "react"
import Product from "./Product"
import ProductData from "./ProductData"

function App(){
  const productComponents = ProductData.map(item => <Product key = {item.id} singleProduct = {item}/>)
  return(
    <div>
      {productComponents}
    </div>
  )
}

export default App