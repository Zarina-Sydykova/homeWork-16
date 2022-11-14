public class Main {
    public static void main(String[] args) {


        Animal [] animals={new Shark("Shark"),
                           new Shark("Octopus"),

                           new Turtle("Turtle"),
                           new Turtle("Fish"),

                           new Eagle("Eagle"),
                           new Eagle("Hummingbird")};

        for (Animal animal: animals) {
            System.out.println(animal);
            if (animal.getClass().equals(Shark.class)){
                ((Shark) animal).getAttack();

            } else if (animal instanceof Turtle){
                ((Turtle) animal).getSwim();

            } else {
                ((Eagle) animal).getFly();
            }


        }

    }
}