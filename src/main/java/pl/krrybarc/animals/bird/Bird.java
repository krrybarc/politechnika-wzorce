package pl.krrybarc.animals.bird;

import pl.krrybarc.behaviour.Flying;
import pl.krrybarc.behaviour.Singing;

public abstract class Bird {

    Flying flying;

    Singing singing;

    public Bird(Flying flying, Singing singing) {
        this.flying = flying;
        this.singing = singing;
    }

    public void fly() {
        flying.performFly();
    }

    public void sing() {
        singing.sing();
    }

    public abstract void display();

}
