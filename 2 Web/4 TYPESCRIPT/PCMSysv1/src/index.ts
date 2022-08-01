console.clear();
// datatypes
var x; //undefined
console.log(x);console.log(typeof x);
x = 10;
console.log(x);console.log(typeof x);
x = 1.05;
console.log(x);console.log(typeof x);
x = "welcome";
console.log(x);console.log(typeof x);
x = true;
console.log(x);console.log(typeof x);

interface Product {
    productId : string;
    price : number;
    productName : string;
}

var product = {
    productId : "P01",
    price : "Pizza",
    productName : 'Food'
}

const productTS : Product  = {
    productId : "P01",
    price : 500,
    productName : 'Food'
}

class ProductClass {
    productId :string ;
    price: number ;
    productName: string ;
    constructor(productId: string, price : number,productName: string ){
        this.productId = productId;
        this.price = price;
        this.productName = productName;
    }
}

// create product
// var productObject = new ProductClass("P1", "Pizza", "Book");
// console.log(productObject);

// const productObject1:ProductClass = new ProductClass("P1", "Pizza", "Book");
// console.log(productObject);

var productObject = new ProductClass("P1", 500 , "Book");
// console.log(productObject);
// console.log(typeof productTS);
// console.log(typeof rambo);