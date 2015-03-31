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
public class PruebaRegistrar {
    
    public PruebaRegistrar() {
        
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
    public void PruebaRegistro(){
        String resultadoes="La persona ha sido registrada exitosamente";
        PersonaDTO pDTO = new PersonaDTO();
                pDTO.setIdPersona(1023896753);
                pDTO.setTpdoc(1);
                pDTO.setNom1("Juan");
                pDTO.setApe1("Sanchez");
                pDTO.setCorreo("jmsanchez@misena.edu.co");
                
                
                PersonaDAO pDAO = new PersonaDAO();
                String resultado = pDAO.registrarPersona(pDTO);
                assertEquals(resultadoes,resultado);
    }
}
