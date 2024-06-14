var addNum=(a,b) =>a+b;


console.log(addNum(20,30));

/*arrow function with one statement*/
let addNumbers = (firstNumber,secondNumber) => firstNumber + secondNumber;
console.log("Addition : "+addNumbers(4,5));

/*arrow function with multiple statements*/
let factorial = (number) => {
    let fact = 1;
    for(let counter=1;counter<=number;counter++){
        fact = fact * counter;
    }
    return fact;
}
console.log("Factorial : "+factorial(5));
