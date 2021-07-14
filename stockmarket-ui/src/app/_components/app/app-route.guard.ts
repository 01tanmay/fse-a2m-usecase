import { Injectable } from "@angular/core";
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from "@angular/router";
import { Observable } from "rxjs";
import { TokenStorageService } from "src/app/_services/token-storage.service";

@Injectable({
    providedIn: 'root'
  })
export class AppRouteGuard implements CanActivate {
  
    currentUser: any;
    
    constructor(private token: TokenStorageService, private router: Router ) { }

    canActivate(next: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<boolean> | Promise<boolean> | boolean {

      this.currentUser = this.token.getUser();
      console.log('currenttoken: '+this.token.getToken());
      console.log('currentuser: ' + this.currentUser.username);

      const bearerToken = this.token.getToken();
      const sessionUsername = this.token.getToken();
    
      if (bearerToken != null && sessionUsername != null) {
      return true;
    } else {
      this.router.navigate(['login']);
      return false;
    }
    }
  
  }
