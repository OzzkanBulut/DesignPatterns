public abstract class Creature { // You cant create objects of an abstract class

    protected  String name;
    protected int weight;
    protected  String sound;

    public abstract  void setName(String name);
    public abstract  String getName();

    public abstract void setWeight(int weight);
    public abstract int getWeight();


}
