/*
TypeScript: Private Variables 
Create a class named MyClass with: 
1. A private integer variable x, initialized to 0 
2. Two methods: addival) Increments the value of x by val getX(). 
Returns the current value of x Ensure that the variable x cannot be accessed or modified directly from outside the class. 
Variable x should be undefined if accessed directly by an instance of MyClass. 
There are nqueries of either of 2 types. 
1 var Increment the value of the private variable x of an instance by val 
2. Return the value of the private variable x of an instance. The provided stub code reads inputs, instantiates MyClass as needed, and calls the methods. 
For example, if we create an instance of MyClass named myclass with the value of x initialized as 0, then add(5) will increase the value of x by 5, and getX() will return the current value of x ...
*/

class MyClass {
  #x: number = 0; // ECMAScript # private field

  add(val: number): void {
    this.#x += val;
  }

  getX(): number {
    return this.#x;
  }
}
