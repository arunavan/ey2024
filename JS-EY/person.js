var person = {
    fullName: function() {
      return this.firstName + " " + this.lastName;
    }
  }
  var person1 = {
    firstName:"John",
    lastName: "Doe"
  }
  var p2 = {
      firstName:"Ram",
      lastName:"Raj"
  }
  console.log(person.fullName.call(person1));
  console.log(person.fullName.call(p2));
  console.log(person.fullName.apply(person1,["Smith","Peter"]));