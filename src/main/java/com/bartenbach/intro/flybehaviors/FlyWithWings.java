package com.bartenbach.intro.flybehaviors;

import com.bartenbach.intro.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }

}
