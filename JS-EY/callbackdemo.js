function mySandwich(x, y, callback) {
    console.log('Started eating my sandwich.\n\nIt has: ' +x + ', ' +y);

    callback(); //callig callback 
}
//calling
mySandwich('ham', 'cheese', function() {console.log('Finished eating my sandwich.');}
);
