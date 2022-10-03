import static org.junit.Assert.*;

public class mynewprojectTest {

    @org.junit.Test
    public void add() {
        int result = mynewproject.add(3,3);
        int correct= 6;
        assertEquals(  6,result);
    }
}