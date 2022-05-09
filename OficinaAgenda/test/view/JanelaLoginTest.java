
package view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Philipe
 */
public class JanelaLoginTest {
    
   

    /**
     * Test of logar method, of class JanelaLogin.
     */
    @Test
    public void testLogar() {
        System.out.println("logar");
        JanelaLogin instance = new JanelaLogin();
        instance.logar();
    
        
        int height = instance.getHeight();
        int width = instance.getWidth();
   
     
        assertEquals(height, 284);
        assertEquals(width, 301);
    }

    /**
     * Test of main method, of class JanelaLogin.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JanelaLogin.main(args);
    }
    
}
