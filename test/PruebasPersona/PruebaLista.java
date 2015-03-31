package PruebasPersona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class PruebaLista {
    private PersonaDTO p1= new PersonaDTO();
    private PersonaDTO p2= new PersonaDTO();
    private PersonaDTO p3= new PersonaDTO();
    private ArrayList<PersonaDTO> lista;
    public PruebaLista() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        lista = new ArrayList();
        p1 =new PersonaDTO();
        p2 = new PersonaDTO();
        p3 = new PersonaDTO();
        
        p1.setIdPersona(1019097669);
        p2.setIdPersona(1020876543);
        p3.setIdPersona(1023896797);
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
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
    public void pruebalistapersona(){
        PersonaDAO pDAO = new PersonaDAO();
        ArrayList<PersonaDTO> ListaPersonas = new ArrayList();
        ListaPersonas = pDAO.listarPersonas();
        
        assertEquals(ListaPersonas.get(0).getIdPersona(),lista.get(0).getIdPersona());
        assertEquals(ListaPersonas.get(1).getIdPersona(),lista.get(1).getIdPersona());
        assertEquals(ListaPersonas.get(2).getIdPersona(),lista.get(2).getIdPersona());
    }
    
}
