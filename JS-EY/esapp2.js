var Emp = /** @class */ 
(function () {
    function Emp() {
        this.show = function () {
            console.log(this.ename);
        };
    }
    return Emp;
} ());
var e = new Emp();
e.ename = "Srikanth";
e.show();
