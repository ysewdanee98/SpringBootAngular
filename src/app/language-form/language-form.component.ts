import { Component, OnInit } from '@angular/core';
import { Language } from '../language';
import { ActivatedRoute, Router } from '@angular/router';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-language-form',
  templateUrl: './language-form.component.html',
  styleUrls: ['./language-form.component.scss']
})
export class LanguageFormComponent implements OnInit {

  language: Language;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private userService: UserServiceService) {
    this.language = new Language();
  }

  onSubmit() {
    this.userService.save(this.language).subscribe(result => this.gotoLanguageList());
  }

  gotoLanguageList() {
    this.router.navigate(['/languages']);
  }

  ngOnInit(): void {
  }

}
