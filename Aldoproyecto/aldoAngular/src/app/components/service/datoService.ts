import {Injectable} from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';

@Injectable()
export class datoService {

    private baseUrl = 'http://localhost:8080/datos';
    private httpHeaders = new HttpHeaders({'Content-Type': 'application/json'});

    constructor(private http:HttpClient)
    {

    }

    getDatos(){
        return this.http.get(this.baseUrl);
    }
    
}
