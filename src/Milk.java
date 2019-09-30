public class Milk
{
    private String nameMilk;
    private double percentMilk;
    private boolean isMilk;

    public Milk(String nameMilk, double percentMilk, boolean isMilk) {
        this.nameMilk = nameMilk;
        this.percentMilk = percentMilk;
        this.isMilk = isMilk;
    }

    public String getNameMilk() {
        return nameMilk;
    }

    public double getPercentMilk() {
        return percentMilk;
    }

    public boolean isIsMilk() {
        return isMilk;
    }
}
