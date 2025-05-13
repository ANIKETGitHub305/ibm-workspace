
import './App.css'
import ExpenseEntryItem from './components/ExpensecComponents';

interface GreatingsPop{
  name:string;
  city: string
}

function Greating({name,city}:GreatingsPop){
  return(
    <>
      <h2>Hello</h2>
      <h3>{name} From {city}</h3>
    </>
  )
}

interface ActionButtonProps{
  title: string;
  disabled : boolean;
}

function handleClick(){
  alert('Button Clicked');
}

function ActionButton({title,disabled}:ActionButtonProps){
  return(
    <>
      <button disabled={disabled} onClick={handleClick}>{title}</button>
    </>
  )
}

function App() {
 

  return (
    <>
     <Greating name = 'Aniket Sahoo' city='Bhubaneswar,Odisha'/>
     <ExpenseEntryItem/>
     <ActionButton title='Action' disabled = {false}/>
    </>
  )
}

export default App
