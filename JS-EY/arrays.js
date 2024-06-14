var arrvar=new Array("abc","xyz","pqr","mno","efg","hij");
	console.log(arrvar.length);
	
	var arrjoin=arrvar.join(", ");
	console.log("Join Data : "+arrjoin );
	
	var arrslice=arrvar.slice(0,3);
	console.log("Sliced Data : "+arrslice );
	
	var arrcon=arrvar.concat(arrslice);
	console.log("Concatinated Data : "+arrcon );
	
	var arrrev=arrvar.reverse() ;
	console.log("Reversed Data : "+arrrev );
	
	var arrsort=arrvar.sort();
	console.log("Sorted Data : "+arrsort );
	
	var arrvalue =new Array(5,2,7,89,3);
	console.log("Sorted Value : "+arrvalue.sort() );
	
	arrvar.add="C.b.d"	;
	
	console.log (arrvar.add);