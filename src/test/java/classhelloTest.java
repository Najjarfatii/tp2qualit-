import static org.junit.Assert.*;


public class classhelloTest {
    @org.junit.Test
    public void affiche() throws Exception {
        String expectedValue="Hello World";
        classhello app=new classhello();
        String actualValue=app.affiche();
        assertEquals(expectedValue, actualValue);
    }

}