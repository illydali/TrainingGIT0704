import { Component, OnInit } from '@angular/core';
import { Employee } from '../model/employee.model';
import { EmployeeService } from '../service/employee.service';

@Component({
  selector: 'app-list-emp',
  templateUrl: './list-emp.component.html',
  styleUrls: ['./list-emp.component.css']
})
//life-cycle hooks (initialization)
export class ListEmpComponent implements OnInit {
  employees?: Employee[];
  employeeService: EmployeeService;
  // instantiates the employee service
  constructor(employeeService: EmployeeService) {
    this.employeeService = employeeService;
  }
  // populates the data into the employees array.
  ngOnInit(): void {
    //inintialize
    this.employeeService.getEmployees().subscribe(
      (employeeData) => { this.employees = employeeData }
    );
  }
}
