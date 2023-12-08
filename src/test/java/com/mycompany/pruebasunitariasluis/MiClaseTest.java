/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pruebasunitariasluis;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author luis
 */
public class MiClaseTest {
    
    public MiClaseTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of dia_laboral method, of class MiClase.
     */
    @Test
    public void testDia_laboralLunes() {
        //System.out.println("dia_laboral");
        String dia = "Lunes";
        boolean expResult = true;
        boolean result = MiClase.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testDia_laboralMartes() {
        //System.out.println("dia_laboral");
        String dia = "Martes";
        boolean expResult = true;
        boolean result = MiClase.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testDia_laboralMiercoles() {
        //System.out.println("dia_laboral");
        String dia = "Miercoles";
        boolean expResult = true;
        boolean result = MiClase.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testDia_laboralJueves() {
        System.out.println("dia_laboral");
        String dia = "Jueves";
        boolean expResult = true;
        boolean result = MiClase.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testDia_laboralViernes() {
        //System.out.println("dia_laboral");
        String dia = "Viernes";
        boolean expResult = true;
        boolean result = MiClase.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testDia_laboralSabado() {
        //System.out.println("dia_laboral");
        String dia = "Sabado";
        boolean expResult = false;
        boolean result = MiClase.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testDia_laboralDomingo() {
        //System.out.println("dia_laboral");
        String dia = "Domingo";
        boolean expResult = false;
        boolean result = MiClase.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testDia_laboralInvalido() {
        //System.out.println("dia_laboral");
        String dia = "Lunes";
        boolean expResult = false;
        boolean result = MiClase.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
