/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasPersona;

import Persona.PersonaDAO;
import Persona.PersonaDTO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mr.Canchila
 */
public class PruebaEliminar {
    
    public PruebaEliminar() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test 
    public void PruebaEliminar(){
        String resultadoes="Proceso Exitoso";
        PersonaDTO pDTO = new PersonaDTO();
                pDTO.setIdPersona(1023896753);
                              
                
                PersonaDAO pDAO = new PersonaDAO();
                String resultado = pDAO.eliminarPersona(pDTO.getIdPersona());
                assertEquals(resultadoes,resultado);
    }
}
