public class Shark extends Animal{
    String name;

    public Shark(String name) {
        this.name = name;
    }

    public Shark() {
    }

    public void getAttack(){

    }

    @Override
    public String toString() {
        return "Shark{" +
                "name='" + name + '\'' +
                '}';
    }
}
