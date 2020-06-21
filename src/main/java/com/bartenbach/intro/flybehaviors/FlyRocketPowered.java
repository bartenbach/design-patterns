package com.bartenbach.intro.flybehaviors;

import com.bartenbach.intro.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }

}
