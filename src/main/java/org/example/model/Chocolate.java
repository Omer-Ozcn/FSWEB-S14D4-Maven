package org.example.model;

public class Chocolate extends ProductForSale {
    private final int cocoaPercent;

    public Chocolate(String type, double price, String description) {
        this(type, price, description, 50); // varsayılan %50 kakao
    }

    public Chocolate(String type, double price, String description, int cocoaPercent) {
        super(type, price, description);
        this.cocoaPercent = cocoaPercent;
    }

    public int getCocoaPercent() { return cocoaPercent; }

    @Override
    public void showDetails() {
        System.out.println(
                "Chocolate {" +
                        "type='" + getType() + '\'' +
                        ", price=" + getPrice() +
                        ", description='" + getDescription() + '\'' +
                        ", cocoaPercent=" + cocoaPercent + "%" +
                        '}'
        );
    }
}
