import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './views/login/login.component';
import { LoadingComponent } from './views/loading/loading.component';
import { HomepageComponent } from './views/homepage/homepage.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: '/loading',
    pathMatch: 'full'
  },
  {
    path: 'login',
    component: LoginComponent,
    data: {
      title: 'Login Page'
    },
  },
  {
    path: 'loading',
    component: LoadingComponent,
    data: {
      title: 'Loading Page'
    },
  },
  {
    path: 'homepage',
    component: HomepageComponent,
    data: {
      title: 'Home Page'
    },
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
