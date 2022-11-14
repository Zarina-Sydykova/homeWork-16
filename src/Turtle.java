public class Turtle extends Animal{
    String name;

    public Turtle(String name) {
        this.name = name;
    }

    public Turtle() {
    }

    public void getSwim(){

    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + name + '\'' +
                '}';
    }
}
