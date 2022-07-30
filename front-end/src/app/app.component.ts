import { Component } from '@angular/core';
import {PlayerService} from "./service/player.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'springsecurity';


  constructor(private playerService :PlayerService) {
    this.ngOnInit()
  }


  ngOnInit(): void {
    this.playerService.getPlayer().subscribe(
      data => {

      }
    );
  }
}
