import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Language } from './language';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  private languagesUrl: string;


  constructor(private http: HttpClient) {
    this.languagesUrl = 'http://localhost:8082/languages';
  }

  public findAll() {
    return this.http.get(this.languagesUrl);
  }

  public save(language: Language) {
    return this.http.post<Language>(this.languagesUrl, language);
  }

}
