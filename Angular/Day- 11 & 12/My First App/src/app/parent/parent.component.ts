import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent  {

firstname = 'Rishabh'
Users = ['Prithvi Shaw', 'Sikhar Dhawan', 'Shreyas Iyer','Ajinkya Rahane' ]
Clicks: any =0;
numberOfClicks(value:any){
  console.log(value);
  this.Clicks = this . Clicks + value;
}
}
