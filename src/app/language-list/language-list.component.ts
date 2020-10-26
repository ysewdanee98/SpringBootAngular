import { Component, OnInit } from '@angular/core';
import { Language } from '../language';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-language-list',
  templateUrl: './language-list.component.html',
  styleUrls: ['./language-list.component.scss']
})
export class LanguageListComponent implements OnInit {

  languages: Language[];

  constructor(private userService: UserServiceService) {
  }

  ngOnInit() {
    this.userService.findAll().subscribe((dataM: any) => {
      this.languages = dataM;
      console.log(dataM);
    });
  }

}
