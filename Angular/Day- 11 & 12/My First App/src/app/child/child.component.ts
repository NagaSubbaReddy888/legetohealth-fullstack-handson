import { Component, Input, OnInit, Output,EventEmitter } from '@angular/core';


@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {

  @Input()

  username = 'Subbu';
  @Output()
  eventCounter : EventEmitter<number> = new EventEmitter<number>();
   counter : number = 0;
   childCounter : number = 0;
   incrememntCounter(){
     this.counter = this.counter + 1 ;
     this.childCounter++;
     this.eventCounter.emit(this.counter);
     this.counter = 0;
   }
}


