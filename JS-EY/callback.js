//A function may be passed as a parameter to another function. 
//This mechanism is termed as a Callback. A Callback would be helpful in events.
var a=10;
function notifyAll(fnSms, fnEmail) {   
   console.log(a*a);
    console.log('starting notification process');   
    fnSms();   
    fnEmail();   
 }   
 notifyAll(function() {   
    console.log("Sms send ..");   
 }, 
 function() {   
    console.log("email send ..");   
 });   
 console.log("End of script"); 