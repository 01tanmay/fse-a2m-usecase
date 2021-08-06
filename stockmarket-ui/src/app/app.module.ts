import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './_components/app/app-routing.module';
import { AppComponent } from './_components/app/app.component';
import { LoginComponent } from './_components/login/login.component';
import { RegisterComponent } from './_components/register/register.component';
import { HomeComponent } from './_components/home/home.component';
import { ProfileComponent } from './_components/profile/profile.component';
import { BoardAdminComponent } from './_components/board-admin/board-admin.component';
import { BoardModeratorComponent } from './_components/board-moderator/board-moderator.component';
import { BoardUserComponent } from './_components/board-user/board-user.component';

import { authInterceptorProviders } from './_helpers/auth.interceptor';
import { MaterialModule } from './_components/material/material.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FooterComponent } from './_components/footer/footer.component';
import { QuotesTableComponent } from './_components/quotes-table/quotes-table.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    ProfileComponent,
    BoardAdminComponent,
    BoardModeratorComponent,
    BoardUserComponent,
    FooterComponent,
    QuotesTableComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MaterialModule
  ],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
