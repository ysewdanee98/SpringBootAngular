import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LanguageListComponent } from './language-list/language-list.component';
import { LanguageFormComponent } from './language-form/language-form.component';

const routes: Routes = [
  { path: 'languages', component: LanguageListComponent },
  { path: 'addLanguage', component: LanguageFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
