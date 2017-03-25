package tutorial;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


/**
 * Created by bbn on 24/03/17.
*/
public class TestCalculator {
    @Mock
    private Calculator calc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAbs(){
        // Useful to mock some functionalities
        when(calc.abs(-20)).thenReturn(20);

        assertEquals(20, calc.abs(-20));
    }
}
