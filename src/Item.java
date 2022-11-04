public class Item {
    private String itemDescription;
    private double itemWeight;

    public Item(String itemDescription, double itemWeight) {
        this.itemDescription = itemDescription;
        this.itemWeight = itemWeight;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(double itemWeight) {
        this.itemWeight = itemWeight;
    }

    @Override
    public String toString() {
        return itemDescription + "(" + itemWeight + " kg)";
    }
}
