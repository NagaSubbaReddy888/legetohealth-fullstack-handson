import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { TdfDemoComponent } from './tdf-demo/tdf-demo.component';
import { MdfDemoComponent } from './mdf-demo/mdf-demo.component';
import { HttpClientModule} from '@angular/common/http';
import { FetchemployeeComponent } from './fetch-employee/fetch-employee.component';
import { FetchEmployeesComponent } from './fetch-employees/fetch-employees.component';
import { StoreemployeeComponent } from './store-employee/store-employee.component';
import { SuccessComponent } from './success/success.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { SettingsComponent } from './settings/settings.component';
import { ProfileComponent } from './profile/profile.component'
@NgModule({
  declarations: [
    AppComponent,
    TdfDemoComponent,
    MdfDemoComponent,
    FetchemployeeComponent,
    FetchEmployeesComponent,
    StoreemployeeComponent,
    SuccessComponent,
    DashboardComponent,
    SettingsComponent,
    ProfileComponent
  ],
  imports: [
    BrowserModule,FormsModule,ReactiveFormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
