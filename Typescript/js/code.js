//Grouping COnsole Example
function f1() {
    console.group("Group 1");
    console.groupCollapsed();
    console.info("Getting Started");
    console.error("Something Went wrong");
    console.log('logging this');
    console.groupEnd();
    console.info('Bye');
}
f1();
