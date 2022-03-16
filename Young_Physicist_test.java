import org.junit.Test;
import static org.junit.Assert.*;

public class Young_Physicist_test {

    @Test
    public void y_p() {
        Young_Physicist yp = new Young_Physicist();
        int arr[] ={4,1,7,-2,4,-1,1,-5,-3};
         assertEquals("No", yp.y_p(3, arr));   //3  4 1 7  -2 4 -1  1 -5 -3
        int zrr[] ={3,-1,7,-5,2,-4,2,-1,-3};
         assertEquals("Yes", yp.y_p(3, zrr));    //3  3 -1 7  -5 2 -4  2 -1 -3
        int krr[] ={101,-102,0,-99,2,-4,2,99,-3};
        assertEquals("out of bounds!!", yp.y_p(101, krr));
        int vrr[] ={101,-102,99,0,100,-90,-101,2,-9};
        assertEquals("out of bounds!!", yp.y_p(102, vrr));
    }

}