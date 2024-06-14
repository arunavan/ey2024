let colors = new Set(['Green', 'Red', 'Orange', 'Yellow', 'Red']);  
console.log(colors.size);  
console.log(colors);  
 
colors.add('Violet');  
colors.add('Indigo');  
colors.add('Blue');  
colors.add('Violet');  //Set.prototype.add("Black");

console.log(colors); 
//colors.clear()     ///Set.prototype.clear()
console.log(colors.size);  // /Set.prototype.size
colors.delete("Violet"); //Set.prototype.delete()
var itr = colors.entries();   //Set.prototype.entries()
for(i=0;i<colors.size;i++)  {  
    console.log(itr.next().value);   
}  

//===========   Set.prototype.forEach
function details(values){  
    console.log(values);  
}  
colors.forEach(details);  

console.log(colors.has('Indigo'));    //Set.prototye.has

var val = colors.values();      //Set.prototype.values()
console.log(val.next().value);   
console.log(val.next().value);   
console.log(val.next().value);   
console.log(val.next().value);   
console.log(val.next().value); 

//Weak set only includes add(value), delete(value) and has(value) methods of Set object.

let ws = new WeakSet();    
   let obj = {msg:"Welcome Back!"};   
   ws.add(obj);   
   console.log(ws.has(obj));   
   ws.delete(obj);   
   console.log(ws.has(obj));  