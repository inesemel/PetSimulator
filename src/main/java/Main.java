public class Main {

    public static void main(String[] args) {

        Pet pet = new Pet("Bella", "Cat");
        System.out.println(pet.introduce());
        System.out.println(pet.feed());
        System.out.println(pet.feed());
        System.out.println(pet.feed());
        System.out.println(pet.nextDay());
        System.out.println(pet.feed());
        System.out.println(pet.feed());

        System.out.println(pet.getWeight());
    }

}
