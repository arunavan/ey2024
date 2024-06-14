class Car {
   
    constructor(name, year) {
      this.name = name;
      this.year = year;
    }
    disp = () => {
        console.log(this.name+"  "+this.year);
    }

  }
  
  myCar = new Car("Ford", 2014);
  console.log( myCar.name + " " + myCar.year);
  myCar.disp();


  