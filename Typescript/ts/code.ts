let numbers: number[] = [1,2,3,4,5];
numbers.push(6);
console.log(numbers);


let fruits: Array<string> = ['apple' , 'Banana' ,'Orange'];
fruits.push("mango");
console.log(fruits);


const colors: readonly string[] = ['red','green','blue'];


let mixed: (string | number)[] = ['Hello' ,42,"world",100];
mixed.push(200);
mixed.push('typescript');