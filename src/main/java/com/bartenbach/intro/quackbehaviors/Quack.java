package com.bartenbach.intro.quackbehaviors;

import com.bartenbach.intro.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
