package com.JUnit.Geometria;

import com.JUnit.dto.Geometria.Geometria;

public class App 
{
    public static void main( String[] args )
    {
	   //Creacion de Objeto Circulo
	   Geometria gm = new Geometria(2);
	   double areaCirc = gm.areaCirculo(2);
	   gm.setArea(areaCirc);    
	   System.out.println(gm);
    }
    
}
