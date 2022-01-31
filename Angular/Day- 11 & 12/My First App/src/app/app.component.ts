import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-first-app';
  Users = [
    {name: 'Subba Reddy', gender : 'Male'},
    {name: 'Cherishma', gender : 'Female'},
    {name: 'Priyanka', gender : 'Female'},
    {name: 'Mahesh', gender : 'Male'},
    {name: 'Chandra', gender : 'Male'}
  ]
}
