public class Pensioner extends Person {
    private double pension;

    public void setPension(double pension) {
        this.pension = pension;
    }

    public double getPension() {
        return pension;
    }

    public Pensioner(String name, int age, int height, int weight, double pension) {
        super(name, age, height, weight);
        this.pension = pension;
    }

    @Override
    public void die() {
        double x = (getAge() - 50) * pension;
        System.out.println("Этот пенсионер умер, он заработал: " + x);
    }

    @Override
    public String toString() {
        return "Pensioner{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                ", pension=" + pension +
                '}';
    }
}