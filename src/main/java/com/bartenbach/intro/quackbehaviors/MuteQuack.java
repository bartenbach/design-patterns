package com.bartenbach.intro.quackbehaviors;

import com.bartenbach.intro.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
