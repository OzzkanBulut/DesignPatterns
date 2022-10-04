public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.setName("Fido");
        System.out.println("Dog name before method :" + dog.getName());
        changeObjectName(dog);
        System.out.println("Dog name after method :" + dog.getName());
        System.out.println("Cat sounds like : " + cat.getSound());


        dog.digHole();

        try {
            dog.setWeight(10);
        } catch (WeightException e) {
            throw new RuntimeException(e);
        }
//        dog.setWeight(-2);  throws an exception because weight is negative
        System.out.println();
        int randNum = 10;
        System.out.println("Number in main : " + randNum);
        dog.changeVar(randNum);
        System.out.println("Number in main after method : " + randNum);

        Animal doggy = new Dog();
        Animal kitty = new Cat();


        Animal[] animals = new Animal[2];
        doggy.setName("Dog");
        kitty.setName("Cat");
        animals[0] = doggy;
        animals[1] = kitty;

        speakAnimal(doggy);

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says:" + animal.getSound());
        }

//        sayHello(); wont work because sayHello is not static

//        doggy.bePrivate();  dont work because it is a private method in dog class
        dog.accessPrivate(); // Works because this public method is in the same class with the private one so it accesses it

        Giraffe giraffe = new Giraffe();
        giraffe.setName("Frank");
        System.out.println(giraffe.getName());

        Monkey monkey = new Monkey();
        System.out.println("Name :"+monkey.getName());
        System.out.println("Weight : "+monkey.getWeight());
        System.out.println("speed:"+monkey.getSpeed());
    }

    private static void speakAnimal(Animal doggy) {
        System.out.println("Animal says : " + doggy.getSound());
    }

    public static void changeObjectName(Dog dog) {
        dog.setName("Miko");

    }

    public void sayHello() {
        System.out.println("Hello");
    }
}