/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasPersona;

import Persona.PersonaDAO;
import Persona.PersonaDTO;
import java.util.ArrayList;
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
public class PruebaListarId {
    private PersonaDTO p1= new PersonaDTO();
    
    public PruebaListarId() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       
        p1 =new PersonaDTO();
        
        p1.setIdPersona(1019097669);
        
       
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
    public void PruebaListarId(){
        
        PersonaDTO pDTO = new PersonaDTO();
        PersonaDAO pDAO = new PersonaDAO();
        
        pDTO = pDAO.listarById(1019097669);
 
                assertEquals(pDTO.getIdPersona(),p1.getIdPersona());
    }
}
