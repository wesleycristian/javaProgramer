package cap4;

import java.util.Date;

public class ExemploIfelsecascata 
{
    public static void main(String[] args) 
    {
    	Date data = new Date();
        @SuppressWarnings("deprecation")
		long horas = data.getHours();
        
        
       
        
        if (horas < 12 ) 
        {
            System.out.println("São " + horas +" horas Bom dia!");
        } 
        else if (horas < 18 ) 
        {
            System.out.println("São " + horas +" horas Boa tarde!");
        } 
        else 
        {
            System.out.println("São " + horas +" horas Boa noite!");
        }
    }
}