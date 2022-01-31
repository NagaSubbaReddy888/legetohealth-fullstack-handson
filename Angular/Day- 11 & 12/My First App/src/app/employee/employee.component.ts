import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {

  employee : any = [{id:111,name:'Subba Reddy' , salary:30000}, {id:222,name:'Mahesh' , salary:40000}];
}
