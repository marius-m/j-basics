package lt.vcs;

public class Gas {
    public double liters;
    public double kilometers;

    public Gas(String liters, String kilometers) {
        this.liters = Double.parseDouble(liters.replace(",", "."));
        this.kilometers = Double.parseDouble(kilometers.replace(",", "."));
    }

    public double calculate() {
        return (liters * 100) / kilometers;
    }

    @Override
    public String toString() {
        return "Gas: " + liters + " / " + kilometers;
    }
}
