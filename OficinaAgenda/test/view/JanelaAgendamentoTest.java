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
public class JanelaAgendamentoTest {
    
    public JanelaAgendamentoTest() {
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
     * Test of getJanelaAgendamento method, of class JanelaAgendamento.
     */
    @Test
    public void testGetJanelaAgendamento() {
        System.out.println("getJanelaAgendamento");
        JanelaAgendamento expResult = null;
        JanelaAgendamento result = JanelaAgendamento.getJanelaAgendamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lerAgendamento method, of class JanelaAgendamento.
     */
    @Test
    public void testLerAgendamento() {
        System.out.println("lerAgendamento");
        JanelaAgendamento instance = new JanelaAgendamento();
        instance.lerAgendamento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConsultaAgendamento method, of class JanelaAgendamento.
     */
    @Test
    public void testConsultaAgendamento() {
        System.out.println("ConsultaAgendamento");
        JanelaAgendamento instance = new JanelaAgendamento();
        instance.ConsultaAgendamento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConsultaAgendamentoNome method, of class JanelaAgendamento.
     */
    @Test
    public void testConsultaAgendamentoNome() {
        System.out.println("ConsultaAgendamentoNome");
        JanelaAgendamento instance = new JanelaAgendamento();
        instance.ConsultaAgendamentoNome();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limparagendamento method, of class JanelaAgendamento.
     */
    @Test
    public void testLimparagendamento() {
        System.out.println("limparagendamento");
        JanelaAgendamento instance = new JanelaAgendamento();
        instance.limparagendamento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class JanelaAgendamento.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JanelaAgendamento.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
