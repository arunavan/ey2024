var asyncOperation = function(){
    if(true)
        return Promise.resolve('async Success');
    else
        return Promise.reject('async Failed');
    
}
//success
asyncOperation().then(function(res){
    console.log(res);
});

//failure
asyncOperation().catch(function(res){
    console.log("Error :",res);
});