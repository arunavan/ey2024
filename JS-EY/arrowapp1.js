
let sum1=(a,b)=>{  a+b;
     let av=a+b/2;
}

console.log(sum1(5,6));
console.log("arraow functions");

//asyc, resolve, reject, pending - promise 
var promise = new Promise(function(resolve, reject) { 
    const x = 12; 
    const y = 3;
    if(x >= y) { 
      resolve(); 
    } else { 
      reject(); 
    } 
  }); 
    
  promise.then(function () { 
          console.log('Sucess! x have grater value'); 
      }). 
      catch(function () { 
          console.log('Error'); 
      }); 