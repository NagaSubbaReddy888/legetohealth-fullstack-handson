import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  fetchEmployeeId(id: any) {
    throw new Error('Method not implemented.');
  }

  constructor() { }
  strore() : void {
    console.log('Store inside the service');
  }
}
