public class Dog extends  Animal{
    public Dog(){
        super();
        setSound("Bark!");
    }
    public void digHole(){
        System.out.println("Dug a hole!");
    }

    public void changeVar(int randNum){
        randNum = 120;
        System.out.println("Number in method is :"+randNum);

    }
    private void bePrivate(){
        System.out.println("I am in a private method");
    }

    public void accessPrivate(){
        bePrivate(); // You can access private methods in the same class
    }
}
