import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LanguageFormComponent } from './language-form/language-form.component';
import { LanguageListComponent } from './language-list/language-list.component';
import { HttpClientModule } from '@angular/common/http';
import { UserServiceService } from './user-service.service';


@NgModule({
  declarations: [
    AppComponent,
    LanguageFormComponent,
    LanguageListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [UserServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
