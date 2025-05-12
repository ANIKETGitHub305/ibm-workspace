// 1️⃣ Basic Tuple
let basicTuple: [string, number] = ["Alice", 30];
console.log("Basic Tuple:", basicTuple); // ["Alice", 30]

// 2️⃣ Optional Tuple Elements
let optionalTuple1: [string, number?] = ["Bob"];
let optionalTuple2: [string, number?] = ["Bob", 25];
console.log("Optional Tuple 1:", optionalTuple1); // ["Bob"]
console.log("Optional Tuple 2:", optionalTuple2); // ["Bob", 25]

// 3️⃣ Tuple with Rest Elements
let restTuple: [string, ...number[]] = ["Charlie", 85, 90, 95];
console.log("Tuple with Rest Elements:", restTuple); // ["Charlie", 85, 90, 95]

// 4️⃣ Named Tuple (for clarity, mainly used with documentation or destructuring)
type Employee = [name: string, age: number, department?: string];
let employee: Employee = ["Diana", 28, "HR"];
console.log("Named Tuple:", employee); // ["Diana", 28, "HR"]

// 5️⃣ Destructuring Tuple
const [empName, empAge, empDept] = employee;
console.log(`Destructured -> Name: ${empName}, Age: ${empAge}, Dept: ${empDept}`);
// Output: Name: Diana, Age: 28, Dept: HR
