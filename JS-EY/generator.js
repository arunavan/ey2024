function *process1(){  // generator
    yield 1;
    yield ;
}

var iterator1 = process1();
console.log('Generators-Basics');
console.log(iterator1.next());
console.log(iterator1.next());
console.log(iterator1.next());

function *process5(){
    try
    {
        yield 1;
    }
    catch(e)
    {
        console.log(e);
    }

    try
    {
        yield 2;
    }
    catch(e)
    {
        console.log(e);
    }
}

var iterator5 = process5();
console.log('Throwing Exception');
console.log(iterator5.next());
console.log(iterator5.next());
console.log(iterator5.throw('Custom Exception occured while yielding 2'));


