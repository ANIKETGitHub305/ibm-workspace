// 1️⃣ Basic Tuple
var basicTuple = ["Alice", 30];
console.log("Basic Tuple:", basicTuple); // ["Alice", 30]
// 2️⃣ Optional Tuple Elements
var optionalTuple1 = ["Bob"];
var optionalTuple2 = ["Bob", 25];
console.log("Optional Tuple 1:", optionalTuple1); // ["Bob"]
console.log("Optional Tuple 2:", optionalTuple2); // ["Bob", 25]
// 3️⃣ Tuple with Rest Elements
var restTuple = ["Charlie", 85, 90, 95];
console.log("Tuple with Rest Elements:", restTuple); // ["Charlie", 85, 90, 95]
var employee = ["Diana", 28, "HR"];
console.log("Named Tuple:", employee); // ["Diana", 28, "HR"]
// 5️⃣ Destructuring Tuple
var empName = employee[0], empAge = employee[1], empDept = employee[2];
console.log("Destructured -> Name: ".concat(empName, ", Age: ").concat(empAge, ", Dept: ").concat(empDept));
// Output: Name: Diana, Age: 28, Dept: HR
