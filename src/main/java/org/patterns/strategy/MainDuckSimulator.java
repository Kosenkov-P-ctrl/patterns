import org.patterns.strategy.Duck;
import org.patterns.strategy.FlyRockerBehavior;
import org.patterns.strategy.MallardDuck;
import org.patterns.strategy.ModelDuck;

void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRockerBehavior());
        model.performFly();
    }
