package $package;

import static junit.framework.TestCase.assertNotNull;
import org.junit.Test;


public class MainTest {


    /**
     * Test for Hello, World! print
     *
     * Delete after modifying the main method
     *
     */
    @Test
    public void shouldCreateMainObject(){
        Main main = new Main();
        assertNotNull("Main method called.", main);
    }
}


