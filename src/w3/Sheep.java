package w3;

public class Sheep extends Mammal{
    private int numberOfHorns = 0;
    
    @Override
    public void eat() {
        System.out.println("Eat grass");
    }
}
