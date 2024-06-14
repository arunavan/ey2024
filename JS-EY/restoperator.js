var test = function(name,age,...others){
    console.log(name,age,others);
}
test('Rahul',30,'Consultant','Manager');

var demo = function(name,age,...others){
    console.log(name,age,others);
}


var add= function(a,b=20) {
    console.log(a+b);
}
add(10,30);
add(10);
demo('Rahul',30);

demo('karthik',"23","SE","CG");