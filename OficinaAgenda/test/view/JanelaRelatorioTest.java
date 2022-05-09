
package view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Philipe
 */
public class JanelaRelatorioTest {
    
    

    /**
     * Test of getJanelaRelatorio method, of class JanelaRelatorio.
     */
    @Test
    public void testGetJanelaRelatorio() {
        System.out.println("getJanelaRelatorio");

        JanelaRelatorio instance = new JanelaRelatorio();
        JanelaRelatorio result = JanelaRelatorio.getJanelaRelatorio();
        
        
        int height = instance.getHeight();
        int width = instance.getWidth();
   
     
        assertEquals(height, 400);
        assertEquals(width, 501);
    }

    /**
     * Test of lerAgendamento method, of class JanelaRelatorio.
     */
    @Test
    public void testLerAgendamento() {
        System.out.println("lerAgendamento");
        JanelaRelatorio instance = new JanelaRelatorio();
        instance.lerAgendamento();
       
        
        int height = instance.getHeight();
        int width = instance.getWidth();
   
     
        assertEquals(height, 398);
        assertEquals(width, 489);
    }
    /**
     * Test of ConsultaAgendamento method, of class JanelaRelatorio.
     */
    @Test
    public void testConsultaAgendamento() {
        System.out.println("ConsultaAgendamento");
        JanelaRelatorio instance = new JanelaRelatorio();
        instance.ConsultaAgendamento();
     
        
        int height = instance.getHeight();
        int width = instance.getWidth();
   
     
        assertEquals(height, 398);
        assertEquals(width, 489);
    }

    /**
     * Test of ConsultaAgendamentoNome method, of class JanelaRelatorio.
     */
    @Test
    public void testConsultaAgendamentoNome() {
        System.out.println("ConsultaAgendamentoNome");
        JanelaRelatorio instance = new JanelaRelatorio();
        instance.ConsultaAgendamentoNome();
      
        int height = instance.getHeight();
        int width = instance.getWidth();
   
     
        assertEquals(height, 398);
        assertEquals(width, 489);
    }

    /**
     * Test of main method, of class JanelaRelatorio.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JanelaRelatorio.main(args);
        
    }

    /**
     * Test of getJanelarelatorioUnico method, of class JanelaRelatorio.
     */
    @Test
    public void testGetJanelarelatorioUnico() {
        System.out.println("getJanelarelatorioUnico");
  
        JanelaRelatorio instance = new JanelaRelatorio();
        JanelaRelatorio result = JanelaRelatorio.getJanelarelatorioUnico();
 

        
        int height = instance.getHeight();
        int width = instance.getWidth();
   
     
        assertEquals(height, 398);
        assertEquals(width, 489);
    }

    /**
     * Test of setJanelarelatorioUnico method, of class JanelaRelatorio.
     */
    @Test
    public void testSetJanelarelatorioUnico() {
        System.out.println("setJanelarelatorioUnico");
        JanelaRelatorio aJanelarelatorioUnico = null;
        JanelaRelatorio.setJanelarelatorioUnico(aJanelarelatorioUnico);
     
    }
    
}
