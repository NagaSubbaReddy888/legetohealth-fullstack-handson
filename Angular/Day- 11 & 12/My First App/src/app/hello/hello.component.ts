import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent {
  name : string = 'Subba Reddy';
  salary: number = 30000;
  dob : Date = new Date(2000, 9, 15);
  fruits : any = ["Apple", "Grapes", "Orange"];
  status : boolean = true;
  
}


