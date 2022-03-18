/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.util.List;
import model.Agendamento;
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
public class AgendamentoDAOTest {
    
    public AgendamentoDAOTest() {
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
     * Test of cadastrarAgendamento method, of class AgendamentoDAO.
     */
    @Test
    public void testCadastrarAgendamento() {
        System.out.println("cadastrarAgendamento");
        Agendamento agendamento = null;
        Connection conexao = null;
        AgendamentoDAO instance = new AgendamentoDAO();
        instance.cadastrarAgendamento(agendamento, conexao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Read method, of class AgendamentoDAO.
     */
    @Test
    public void testRead() {
        System.out.println("Read");
        Connection conexao = null;
        AgendamentoDAO instance = new AgendamentoDAO();
        List<Agendamento> expResult = null;
        List<Agendamento> result = instance.Read(conexao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Consultacli method, of class AgendamentoDAO.
     */
    @Test
    public void testConsultacli() {
        System.out.println("Consultacli");
        Connection conexao = null;
        int IDagendamento = 0;
        AgendamentoDAO instance = new AgendamentoDAO();
        List<Agendamento> expResult = null;
        List<Agendamento> result = instance.Consultacli(conexao, IDagendamento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConsultacliNome method, of class AgendamentoDAO.
     */
    @Test
    public void testConsultacliNome() {
        System.out.println("ConsultacliNome");
        Connection conexao = null;
        String Buscar = "";
        AgendamentoDAO instance = new AgendamentoDAO();
        List<Agendamento> expResult = null;
        List<Agendamento> result = instance.ConsultacliNome(conexao, Buscar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarAgendamento method, of class AgendamentoDAO.
     */
    @Test
    public void testAlterarAgendamento() {
        System.out.println("alterarAgendamento");
        Connection conexao = null;
        Agendamento agendamentotoedit = null;
        int aux = 0;
        AgendamentoDAO instance = new AgendamentoDAO();
        instance.alterarAgendamento(conexao, agendamentotoedit, aux);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluiAgendamento method, of class AgendamentoDAO.
     */
    @Test
    public void testExcluiAgendamento() {
        System.out.println("excluiAgendamento");
        Connection conexao = null;
        int IDAgendamento = 0;
        AgendamentoDAO instance = new AgendamentoDAO();
        instance.excluiAgendamento(conexao, IDAgendamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
