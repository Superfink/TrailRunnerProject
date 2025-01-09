
package se.kristins;
import org.junit.jupiter.api.*;

import org.mockito.*;

import se.kristins.TestFeatures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;


public class TestMain {

    @Mock
    private Runner runner;
    private Run run;
    
    @BeforeEach
    public void setUp(){
        runner = mock(Runner.class);
        run = mock(Run.class);
    }

    
       
    
    @Test
    public void twoAndFiveIsSeven(){
        assertEquals(7, TestFeatures.add(2, 5));

    }




    
    @Disabled
    @Test
    public void runAddedToList(){
        int arrayLength = runner.runList.size();
        runner.runList.add(run);
        assertEquals(1, (runner.runList.size() - arrayLength));
    }

}
