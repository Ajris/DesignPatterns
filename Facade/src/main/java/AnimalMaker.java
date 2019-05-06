import java.util.ArrayList;
import java.util.List;

public class AnimalMaker {
    private Animal dog;
    private Animal giraffe;
    private Animal lion;

    public AnimalMaker() {
        dog = new Dog();
        giraffe = new Giraffe();
        lion = new Lion();
    }

    public void sayDog(){
        dog.say();
    }

    public void sayGiraffe(){
        giraffe.say();
    }

    public void sayLion(){
        lion.say();
    }
}
