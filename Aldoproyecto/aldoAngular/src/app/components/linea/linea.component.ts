import { Component, OnInit } from '@angular/core';
import { datoService } from '../service/datoService';

@Component({
  selector: 'app-linea',
  templateUrl: './linea.component.html',
  styleUrls: ['./linea.component.css'],
  providers: [datoService]
})
export class LineaComponent implements OnInit {

  items: any[];
  lineChartData: any[];
  lineChartLabels: any[] = new Array<any>();

  constructor(private d: datoService) { }
  ngOnInit() {
    this.getDatos();

  }

  getDatos() {
    this.d.getDatos().subscribe((datos: any[]) => {
      this.items = datos;
      this.createGraps();
    });
  }

  createGraps(){
      let data1 = []
      this.items.map((dato: any) => {
        data1.push(dato.emi);
      })
    
      this.lineChartData= [
   
      {data: data1, label: 'Emisiones de CO2 en el mundo desde 1975 al 2014'}
      ];
      
      this.items.map((dato: any)=>{
        this.lineChartLabels.push(dato.anio)
      })
    } 

    public lineChartOptions:any = {
      responsive: true
    };
  
    public lineChartColors:Array<any> = [
      { // grey
        backgroundColor: 'rgba(148,159,177,0.2)',
        borderColor: 'rgba(148,159,177,1)',
        pointBackgroundColor: 'rgba(148,159,177,1)',
        pointBorderColor: '#fff',
        pointHoverBackgroundColor: '#fff',
        pointHoverBorderColor: 'rgba(148,159,177,0.8)'
      }];
    public lineChartLegend:boolean = true;
    public lineChartType:string = 'line';
  
    public chartClicked(e:any):void {
      console.log(e);
    }
   
    public chartHovered(e:any):void {
      console.log(e);
    }
}