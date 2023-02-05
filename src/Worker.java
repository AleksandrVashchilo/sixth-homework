public class Worker extends Person implements AbleToCalculatePension{

    private int minSalary;
    private int maxSalary;

    public int getMinSalary() {
        return minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    @Override
    public double calculatePension() {
        PensionFund pensionFund = new PensionFund("Пенсионный фонд Милана", "27-12-1946", TypeOfFund.STATE);
        int age = getAge();
        double result = pensionFund.calculatePension(age, minSalary, maxSalary);
        return result;
    }
}
