public class Monkey implements Living{
    private String name;
    private int weight;
    private int speed;
        public Monkey(){
            this.name = "mnkey";
            this.weight = 100;
            this.speed = 25;

        }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }


}
