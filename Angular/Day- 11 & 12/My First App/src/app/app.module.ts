import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { DemoComponent } from './demo/demo.component';
import { HelloComponent } from './hello/hello.component';
import { DataBindComponent } from './data-bind/data-bind.component';
import { EmployeeComponent } from './employee/employee.component';
import { GenderPipe } from './gender.pipe';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';

@NgModule({
  declarations: [
    DemoComponent,
    AppComponent,
    HelloComponent,
    DataBindComponent,
    EmployeeComponent,
    GenderPipe,
    ParentComponent,
    ChildComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
