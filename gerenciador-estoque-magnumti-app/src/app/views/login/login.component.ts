import { Component, ViewChild, HostListener, Output, ElementRef, Directive, EventEmitter } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  mostraSenha = false;
  loginForm: FormGroup | any; 
  capsOn: any;

  @ViewChild('emailInput', { static: false }) emailInput: ElementRef<HTMLInputElement> | undefined;

  constructor(
    private formBuilder: FormBuilder,
    private router: Router,
  ) { }

  ngOnInit(): void {

    this.loginForm = this.formBuilder.group({
      email: [''],
      senha: ['']
    });
  }

  login() {
    const email = this.loginForm.controls.email.value;
    const senha = this.loginForm.controls.senha.value;
  }

  mostrarSenha() {
    this.mostraSenha = !this.mostraSenha
  }
}

@Directive({ selector: '[capsLock]' })
export class TrackCapsDirective {
  @Output('capsLock') capsLock = new EventEmitter<Boolean>();

  @HostListener('window:keydown', ['$event'])
  onKeyDown(event: KeyboardEvent): void {
    const capsOn = event.getModifierState && event.getModifierState('CapsLock');
    this.capsLock.emit(capsOn);
  }
  @HostListener('window:keyup', ['$event'])
  onKeyUp(event: KeyboardEvent): void {
    const capsOn = event.getModifierState && event.getModifierState('CapsLock');
    this.capsLock.emit(capsOn);
  }
}
