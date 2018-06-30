/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Duoc
 */
@WebService(serviceName = "servicioServExtra")
public class servicioServExtra {

    /**
     * This is a sample web service operation
     */
    
    @WebMethod(operationName = "reservarServicio")
    public int reservarServicio(@WebParam(name = "idServicio") String idServicio) {
        
        int retorno;
        
        /*
            21	Cancha de tennis
            22	Spa
            0	sin servicio
            20	Piscina
            19	Gimnasio
        */
        
        switch (idServicio){
            case "21":   
                    retorno = 1;
                     break;
            case "22": 
                    retorno = 0;
                     break;
            case "0": 
                    retorno = 0;
                     break;
            case "20": 
                    retorno = 1;
                     break;
            case "19": 
                    retorno = 1;
                     break;         
            default:
                    retorno = 1;
                     break;
        }
        
        return retorno;
    }
}
