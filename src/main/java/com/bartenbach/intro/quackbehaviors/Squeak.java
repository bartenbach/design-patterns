package com.bartenbach.intro.quackbehaviors;

import com.bartenbach.intro.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
