package com.bartenbach.intro.flybehaviors;

import com.bartenbach.intro.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
