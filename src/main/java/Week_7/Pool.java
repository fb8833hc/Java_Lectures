package Week_7;

public class Pool {
    private String name; //field or a variable
    private double length; //another field
    private String address;
    private double maxDepth;

    public Pool(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public double distanceForLaps(int laps) {
        //10 laps of pool of length 50, that's 500 meters
        double total = laps * this.length;
        return total;
    }

    @Override
    public String toString() {
        String description = this.name + " pool is " + this.length + " meters long.";
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 1000) {
            return;
        }
        this.length = length;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }
}
