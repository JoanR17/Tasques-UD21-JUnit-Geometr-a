package com.JUnit.Geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.JUnit.dto.Geometria.Geometria;

class AppTest {

	Geometria geo;
	
	@BeforeEach
	public void before()
	{
		geo = new Geometria();
		geo = new Geometria(1);
		geo = new Geometria(2);
		geo = new Geometria(3);
		geo = new Geometria(4);
		geo = new Geometria(6);
		geo = new Geometria(7);
		geo = new Geometria(8);
		System.out.println("before()");
		geo = new Geometria(5);
	}
	
	@AfterEach
	public void after()
	{
		System.out.println("after()");
		geo = null;
	}
	
	@Test
	public void testAreaCuadrado()
	{
		System.out.println("testAreaCuadrado()");
		int result = geo.areacuadrado(2);
		int esper = 4;
		
		assertEquals(esper, result);
	}
	
	@Test
	public void testAreaCirculo()
	{
		System.out.println("testAreaCirculo()");
		double result = geo.areaCirculo(2);
		double esper = 3.1416 * Math.pow(2, 2);
		
		assertEquals(esper, result);
	}
	
	@Test
	public void testAreaTriangulo()
	{
		System.out.println("testAreaTriangulo()");
		int result = geo.areatriangulo(2, 5);
		int esper = 5;
		
		assertEquals(esper, result);
	}
	
	@Test
	public void testAreaRectangulo()
	{
		System.out.println("testAreaRectangulo()");
		int result = geo.arearectangulo(2, 5);
		int esper = 10;
		
		assertEquals(esper, result);
	}
	
	@Test
	public void testAreaPentagono()
	{
		System.out.println("testAreaPentagono()");
		int result = geo.areapentagono(2, 5);
		int esper = 5;
		
		assertEquals(esper, result);
	}
	
	@Test
	public void testAreaRombo()
	{
		System.out.println("testAreaRombo()");
		int result = geo.arearombo(2, 5);
		int esper = 5;
		
		assertEquals(esper, result);
	}
	
	@Test
	public void testAreaRomboide()
	{
		System.out.println("testAreaRomboide()");
		int result = geo.arearomboide(2, 5);
		int esper = 10;
		
		assertEquals(esper, result);
	}
	
	@Test
	public void testAreaTrapecio()
	{
		System.out.println("testAreaTrapecio()");
		int result = geo.areatrapecio(5, 5, 5);
		int esper = 25;
		
		assertEquals(esper, result);
	}
	
	@Test
	public void testFigura()
	{
		System.out.println("testFigura()");
		geo.figura(9);
		String result = geo.figura(5);
		String esper = "Pentagono";
		
		assertEquals(esper, result);
	}
	
	@Test
	public void testGetId()
	{
		System.out.println("testGetId()");
		int result = geo.getId();
		int esper = 5;
		
		assertEquals(esper, result);
	}
	
	@Test
	public void testSetId()
	{
		System.out.println("testSetId()");
		geo.setId(2);
		int result = geo.getId();
		int esper = 2;
		
		assertEquals(esper, result);
	}
	
	@Test
	public void testGetNom()
	{
		System.out.println("testGetNom()");
		String result = geo.getNom();
		String esper = "Pentagono";
		
		assertEquals(esper, result);
	}
	
	@Test
	public void testSetNom()
	{
		System.out.println("testSetNom()");
		geo.setNom("Joan");
		String result = geo.getNom();
		String esper = "Joan";
		
		assertEquals(esper, result);
	}
	
	@Test
	public void testGetArea()
	{
		System.out.println("testGetArea()");
		double result = geo.getArea();
		double esper = 0;
		
		assertEquals(esper, result);
	}
	
	@Test
	public void testSetArea()
	{
		System.out.println("testSetArea()");
		geo.setArea(geo.areapentagono(5, 2));
		double result = geo.getArea();
		double esper = 5;
		
		assertEquals(esper, result);
	}
	
	@Test
	public void testToString()
	{
		System.out.println("testToString()");
		
		String result = geo.toString();
		String esper = "Geometria [id=5, nom=Pentagono, area=0.0]";
		
		assertEquals(esper, result);
	}
}
