// Prompot and Alert example
var userInput = window.prompt('please Enter your Input');
if (userInput !== null) {
    window.alert("Hello, ".concat(userInput, "!"));
}
else {
    window.alert("You clicked Cancel or CLosed the Prompt.");
}
