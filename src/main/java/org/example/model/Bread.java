package org.example.model;

public class Bread extends ProductForSale {
    private final int weightGr;
    private final boolean wholeGrain;

    public Bread(String type, double price, String description) {
        this(type, price, description, 400, true); // varsayılanlar
    }

    public Bread(String type, double price, String description, int weightGr, boolean wholeGrain) {
        super(type, price, description);
        this.weightGr = weightGr;
        this.wholeGrain = wholeGrain;
    }

    public int getWeightGr() { return weightGr; }
    public boolean isWholeGrain() { return wholeGrain; }

    @Override
    public void showDetails() {
        System.out.println(
                "Bread {" +
                        "type='" + getType() + '\'' +
                        ", price=" + getPrice() +
                        ", description='" + getDescription() + '\'' +
                        ", weightGr=" + weightGr +
                        ", wholeGrain=" + wholeGrain +
                        '}'
        );
    }
}
