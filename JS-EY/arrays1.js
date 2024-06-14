var numbers = Array(100);
		console.log('Array size : ',numbers.length);
		
		/*Array.of()*/
		var numbers = Array.of(100);
		console.log('Array.of size: ',numbers.length);
		
		/*Array.from()*/
		var numbers = [100,200,300];
		var results = Array.from(numbers,number=>number+100);
		console.log('Array.from : ',results);
		
		/*fill()*/
		var numbers = [100,200,300];
		numbers.fill(50);
		console.log('Array.fill : ',numbers);
		
		/*find()*/
		var numbers = [21,25,34,56];
		var result = numbers.find(function(value,index,array){
			if(value < 21)
				return true;
		});
		console.log('Array.find():',result);
		
		/*findIndex()*/
		var numbers = [21,25,34,56];
		var result = numbers.findIndex(function(value,index,array){
			if(value > 26)
				return true;
		});
		console.log('Array.findIndex():',result);
		
		/*copyWithin()*/
		var numbers = [21,25,34,56,87];
		numbers.copyWithin(1, 2, 4);
		console.log('Array.copyWithin():',numbers);
		
		/*entries,keys,values*/
		var numbers = [21,25,44,55,77];
		var entries = numbers.entries();
		var keys = numbers.keys();
		var values = numbers.values();
		
		console.log('entries : ',...entries);
		console.log('keys : ', ...keys);
		console.log('keys : ', ...values);