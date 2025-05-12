// firstFunction();
// secondFunction();
// let firstName: string | undefined;
// function firstFunction() {
//     let firstName = "Aniket";
//     console.log(firstName);
// }
// function secondFunction() {
//     let firstName = "Sonu";
//     console.log(firstName);
// }
// console.log(firstName);

const x = 22;
{
    console.log(x);
    {
        const x = 77;
        console.log(x);
    }
    {
        const x = 45;
        console.log(x);
    }
}
console.log(x);