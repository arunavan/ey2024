var add = (function () {  //outer function 
          var counter = 0;
           return function ()  //inner function 
              {counter += 1;
                  return counter
                }
                       }
          ) ();
  
  console.log(add());
  console.log(add());
  console.log(add());