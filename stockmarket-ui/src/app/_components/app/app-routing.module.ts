import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { RegisterComponent } from '../register/register.component';
import { LoginComponent } from '../login/login.component';
import { ProfileComponent } from '../profile/profile.component';
import { BoardUserComponent } from '../board-user/board-user.component';
import { AppRouteGuard } from './app-route.guard';

const routes: Routes = [
  //{ path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'profile', component: ProfileComponent, canActivate: [AppRouteGuard]},
  { path: 'board', component: BoardUserComponent, canActivate: [AppRouteGuard]},
  //{ path: 'mod', component: BoardModeratorComponent },
  //{ path: 'admin', component: BoardAdminComponent },
  { path: '', redirectTo: 'login', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
