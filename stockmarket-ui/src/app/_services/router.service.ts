import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class RouterService {

  constructor(private router: Router) { }

  routeToHome() {
    console.log('Navigating to home');
    this.router.navigate(['board']);
  }
}
