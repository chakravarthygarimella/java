import React from "react"
import ProductData from "./ProductData"

function Product(props){
    return( 
        <div>
            <h2>Product name: {props.singleProduct.name}</h2>
            <p>Description: {props.singleProduct.description}</p>
            <p>Price: {props.singleProduct.price.toLocaleString("en-US", { style: "currency", currency: "USD" })}</p>
            <hr/>
        </div>
    )
}
export default Product