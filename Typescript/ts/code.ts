// Prompot and Alert example
let userInput: string | null = window.prompt('please Enter your Input')

if(userInput !== null) {
    window.alert(`Hello, ${userInput}!`);
} else {
    window.alert("You clicked Cancel or CLosed the Prompt.")
}