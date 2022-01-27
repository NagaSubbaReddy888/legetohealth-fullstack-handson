import logo from './logo.svg';
import './App.css';
import Greetings, { Hello } from './components/Greetings';
import Button, { Input } from './components/Button'
import { Counter } from './components/Counter';
import { Form } from './components/FormData';
import { EmployeeList } from './components/EmployeeEx';
import { EmployeeCurd, EmployeeUpdate } from './components/EmployeeCRUD';
import {Route,Link,Routes} from 'react-router-dom'


function Navigation(){
  return(<div>
    <Link to='/store'>Store Employess</Link>  /
    <Link to='/fetchAll'>Show Employess Data</Link> /
    <Link to='/update'>Update Employess Data</Link>
  </div>)
}


function App() {
  let message='Hello Every one';
  let profile={name:'Subba Reddy',age:23,dob:new Date(1998,6,13)};
  return (
    <div>
      <h1> React Js </h1>
             <div>
                <Navigation></Navigation>
             </div>
              <div>
                 <Routes>
                  
                     <Route path='/store' element={<EmployeeCRUD/>}></Route>
                     <Route path='/fetchAll' element={<EmployeeList/>}></Route>
                     <Route path='/update' element={<EmployeeUpdate/>}></Route>
                 </Routes>
              </div>
          </div>
  );
}

export default App;
