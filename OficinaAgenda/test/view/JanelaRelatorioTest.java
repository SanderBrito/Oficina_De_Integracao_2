/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package view;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Philipe
 */
public class JanelaRelatorioTest {
    
    public JanelaRelatorioTest() {
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
     * Test of getJanelaRelatorio method, of class JanelaRelatorio.
     */
    @Test
    public void testGetJanelaRelatorio() {
        System.out.println("getJanelaRelatorio");
        JanelaRelatorio expResult = null;
        JanelaRelatorio result = JanelaRelatorio.getJanelaRelatorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lerAgendamento method, of class JanelaRelatorio.
     */
    @Test
    public void testLerAgendamento() {
        System.out.println("lerAgendamento");
        JanelaRelatorio instance = new JanelaRelatorio();
        instance.lerAgendamento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConsultaAgendamento method, of class JanelaRelatorio.
     */
    @Test
    public void testConsultaAgendamento() {
        System.out.println("ConsultaAgendamento");
        JanelaRelatorio instance = new JanelaRelatorio();
        instance.ConsultaAgendamento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConsultaAgendamentoNome method, of class JanelaRelatorio.
     */
    @Test
    public void testConsultaAgendamentoNome() {
        System.out.println("ConsultaAgendamentoNome");
        JanelaRelatorio instance = new JanelaRelatorio();
        instance.ConsultaAgendamentoNome();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class JanelaRelatorio.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JanelaRelatorio.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJanelarelatorioUnico method, of class JanelaRelatorio.
     */
    @Test
    public void testGetJanelarelatorioUnico() {
        System.out.println("getJanelarelatorioUnico");
        JanelaRelatorio expResult = null;
        JanelaRelatorio result = JanelaRelatorio.getJanelarelatorioUnico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJanelarelatorioUnico method, of class JanelaRelatorio.
     */
    @Test
    public void testSetJanelarelatorioUnico() {
        System.out.println("setJanelarelatorioUnico");
        JanelaRelatorio aJanelarelatorioUnico = null;
        JanelaRelatorio.setJanelarelatorioUnico(aJanelarelatorioUnico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
