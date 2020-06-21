package com.bartenbach.intro.ducks;

import com.bartenbach.intro.Duck;
import com.bartenbach.intro.flybehaviors.FlyNoWay;
import com.bartenbach.intro.quackbehaviors.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}
