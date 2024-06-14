var data = [7,3,6,23,4,5,6,77];
		var maximumData = Math.max(...data); //variable args, variable lengthof args
		console.log("Maximum Value : "+maximumData);
		
		var addNumbers=function(a,b){
			return a+b;
		}
		
		var numbers = [2,4];
		var addResult = addNumbers(...numbers);
		console.log("Addition : "+addResult);
		
		
		var nameChars = [..."Karthik"];
		console.log(nameChars);