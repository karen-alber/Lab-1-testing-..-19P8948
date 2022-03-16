import org.junit.Test;
import static org.junit.Assert.*;

public class Watermelon_test {

    @Test
    public void W_M(){
        Watermelon wm = new Watermelon();
        assertEquals("YES" , wm.W_M(8));
        assertEquals("out of bounds!!" , wm.W_M(0));
        assertEquals("NO" , wm.W_M(1));
        assertEquals("NO" , wm.W_M(2));
        assertEquals("NO" , wm.W_M(9));
        assertEquals("YES" , wm.W_M(100));
        assertEquals("out of bounds!!" , wm.W_M(102));

    }
}
