package com.bartenbach.intro.ducks;

import com.bartenbach.intro.Duck;
import com.bartenbach.intro.flybehaviors.FlyWithWings;
import com.bartenbach.intro.quackbehaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
