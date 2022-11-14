public class Eagle extends Animal{
    String name;

    public Eagle(String name) {
        this.name = name;
    }

    public Eagle() {
    }

    public void getFly(){

    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                '}';
    }
}
