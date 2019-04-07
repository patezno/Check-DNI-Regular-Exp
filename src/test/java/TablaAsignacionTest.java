import NIF.TablaAsignacion;
import org.junit.Assert;
import org.junit.Test;

public class TablaAsignacionTest {

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
