
package view;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Philipe
 */
public class JanelaAgendamentoTest {
    
    /**
     * Test of getJanelaAgendamento method, of class JanelaAgendamento.
     */
    @Test
    public void testGetJanelaAgendamento() {
        System.out.println("getJanelaAgendamento");
        JanelaAgendamento instance = new JanelaAgendamento();

        int height = instance.getHeight();
        int width = instance.getWidth();
   
     
        assertEquals(height, 631);
        assertEquals(width, 1031);
      

    }

    /**
     * Test of lerAgendamento method, of class JanelaAgendamento.
     */
    @Test
    public void testLerAgendamento() {
        System.out.println("lerAgendamento");
        JanelaAgendamento instance = new JanelaAgendamento();
        instance.lerAgendamento();
        
        int height = instance.getHeight();
        int width = instance.getWidth();
   
     
        assertEquals(height, 656);
        assertEquals(width, 1025);
       

    }
    
    
    /**
     * Test of ConsultaAgendamentoNome method, of class JanelaAgendamento.
     */
    @Test
    public void testConsultaAgendamentoNome() {
        System.out.println("ConsultaAgendamentoNome");
        JanelaAgendamento instance = new JanelaAgendamento();
        instance.ConsultaAgendamentoNome();
        int height = instance.getHeight();
        int width = instance.getWidth();
   
     
        assertEquals(height, 656);
        assertEquals(width, 1025);

    }

    /**
     * Test of limparagendamento method, of class JanelaAgendamento.
     */
    @Test
    public void testLimparagendamento() {
        System.out.println("limparagendamento");
        JanelaAgendamento instance = new JanelaAgendamento();
        instance.limparagendamento();
     
       int height = instance.getHeight();
        int width = instance.getWidth();
   
     
        assertEquals(height, 656);
        assertEquals(width, 1025);
    }

    /**
     * Test of main method, of class JanelaAgendamento.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JanelaAgendamento.main(args);
      
        
    }
    
}
