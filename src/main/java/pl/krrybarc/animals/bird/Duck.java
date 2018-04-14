package pl.krrybarc.animals.bird;

import pl.krrybarc.behaviour.FastFlying;
import pl.krrybarc.behaviour.Quacking;

class Duck extends Bird {

    public Duck() {
        super(new FastFlying(), new Quacking());
    }

    @Override
    public void display() {
        System.out.println("I am a duck");
    }

}
