import { Component } from '@angular/core'; 

@Component({
    selector: 'demo-app',
    templateUrl: './demo.component.html'
})
export class DemoComponent {
    username : string = 'Subba Reddy';
    dob : Date = new Date(1998, 6, 13);
}