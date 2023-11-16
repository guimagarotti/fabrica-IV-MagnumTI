import { Component, HostListener } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  tamanhoTela: any;
  habilitaSidemenu = true;

  imgUrl: string | any = null;

  @HostListener('window:resize', ['$event'])
  onResize() {
    this.atualizaTamanho();
  }

  constructor(
    private router: Router,
  ) { }

  logout() {
    this.router.navigate(['login']);
  }

  ngOnInit() {
    this.atualizaTamanho();
    this.imgUrl = 'assets/images/logo.png';
  }

  atualizaTamanho() {
    this.tamanhoTela = window.innerWidth;
    if (this.tamanhoTela <= 650)
      this.habilitaSidemenu = false;
    else
      this.habilitaSidemenu = true;
  }
}
