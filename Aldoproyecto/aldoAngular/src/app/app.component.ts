import { Component, OnInit } from '@angular/core';
import { datoService } from './components/service/datoService';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[datoService]
})
export class AppComponent implements OnInit {
  title = 'app works!';
  arr: any[];
  constructor(private d:datoService){}

  ngOnInit(){
    this.getDatos();
  }

  getDatos() {
    this.d.getDatos().subscribe((datos: any[]) => {
      this.arr = datos;
    });
  }

}
