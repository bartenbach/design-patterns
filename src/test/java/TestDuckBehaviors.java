import com.bartenbach.intro.Duck;
import com.bartenbach.intro.ducks.MallardDuck;
import com.bartenbach.intro.ducks.ModelDuck;
import com.bartenbach.intro.flybehaviors.FlyRocketPowered;
import org.junit.Test;

public class TestDuckBehaviors {

    @Test
    public void testDuckBehaviors() {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
