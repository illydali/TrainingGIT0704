import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { RegistrationSbService } from '../service/registration.service';

@Component({
  selector: 'app-login-sb',
  templateUrl: './login-sb.component.html',
  styleUrls: ['./login-sb.component.css']
})
export class LoginSbComponent implements OnInit {
  loginForm: FormGroup;
  submitted = false;
  constructor(private formBuilder: FormBuilder, private router: Router, private registrationService: RegistrationSbService) { }

  ngOnInit(): void {
    const emailPattern = "^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$";
    const phoneNumber = "^(\+\d{1,3}[- ]?)?\d{10}$";
    this.loginForm = this.formBuilder.group({
      // adminName: ['admin', [Validators.required, Validators.minLength(4), Validators.maxLength(20)]],
      email: ['a@a.com', [Validators.required, Validators.email, Validators.pattern(emailPattern)]],
      // phone: ['1111111111', [Validators.required, Validators.pattern("^((\\+65-?)|0)?[0-9]{10}$")]],
      // password: ['passpass', [Validators.required, Validators.minLength(6)]]
       password: ['passpass', [Validators.required]]
    })
  }
  // convenience getter for easy access to form fields
  get f() { return this.loginForm.controls; }

  onSubmit() {
    this.submitted = true;

    // stop here if form is invalid
    if (this.loginForm.invalid) {
      return;
    }
    console.log(this.loginForm.value);
    console.log('\n\n' + JSON.stringify(this.loginForm.value))

    this.registrationService.authenticate(this.loginForm.controls['email'].value,this.loginForm.controls['password'].value)
      .subscribe((data) => {
        console.log('Auth Status :', data);
        if(data) {
          console.log("registrationService.authenticate " )
          sessionStorage.setItem("loggedIn",'yes')
          this.router.navigate(['employees-sb'])
        }
      })
    this.router.navigate(['login-sb'])
  }
}
