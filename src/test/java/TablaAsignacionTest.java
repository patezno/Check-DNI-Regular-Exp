import NIF.TablaAsignacion;
import org.junit.Assert;
import org.junit.Test;

public class TablaAsignacionTest {

    @Test
    public void getSizeTest() {
        Assert.assertEquals(23, TablaAsignacion.getSize());
    }

    @Test
    public void wordAllowedTest() {
        Assert.assertTrue(TablaAsignacion.wordAllowed("R"));
        Assert.assertTrue(TablaAsignacion.wordAllowed("X"));
    }

    @Test
    public void showWordsTest() {
        TablaAsignacion.showWords();
    }

}
