
package se.kristins;
import org.junit.jupiter.api.*;

import org.mockito.*;

import se.kristins.MyFirstStubEtc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class TestMain {

    
    @Test
    public void twoAndFiveIsSeven(){
        assertEquals(7, MyFirstStubEtc.add(2, 5));

    }

    @Disabled
    @Test
    public void twoAndSevenIsNotSeven(){
        assertEquals(7, MyFirstStubEtc.add(2, 7));
    }

    

}
