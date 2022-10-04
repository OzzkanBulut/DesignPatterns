public class Animal {

    public FlyBehaviour flyingType;
    private String name;
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int weight;

    public void setFlyingType(FlyBehaviour flyingType){
        this.flyingType = flyingType;
    }

    public String tryToFly(){
        return flyingType.fly();
    }

}
