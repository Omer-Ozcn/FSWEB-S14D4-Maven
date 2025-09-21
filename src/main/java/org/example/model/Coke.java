package org.example.model;

public class Coke extends ProductForSale {
    private final int volumeMl;
    private final boolean diet;

    public Coke(String type, double price, String description) {
        this(type, price, description, 330, false); // varsayılan: 330 ml, normal
    }

    public Coke(String type, double price, String description, int volumeMl, boolean diet) {
        super(type, price, description);
        this.volumeMl = volumeMl;
        this.diet = diet;
    }

    public int getVolumeMl() { return volumeMl; }
    public boolean isDiet() { return diet; }

    @Override
    public void showDetails() {
        System.out.println(
                "Coke {" +
                        "type='" + getType() + '\'' +
                        ", price=" + getPrice() +
                        ", description='" + getDescription() + '\'' +
                        ", volumeMl=" + volumeMl +
                        ", diet=" + diet +
                        '}'
        );
    }
}
