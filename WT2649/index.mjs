import { totalSale, buy, sell, numberSale } from "./product.mjs";
import defval from "./secretindegrient.mjs";

let buyer = {
    name: "Satish",
    total: 0
};

let item = {
    price: 10,
    quantity: 100
};

console.log("Total Sale Till now = ", totalSale);

buy(buyer, item);
sell(item);

console.log("Buyer Name :",buyer.name);
console.log("Total expense of buyer = ", buyer.total);
console.log("Quantity of item left =", item.quantity);
console.log("Total Sale till now =", totalSale);
console.log("Number of item sold =", numberSale);
console.log(defval);
