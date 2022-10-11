package se.iths.files;

import java.math.BigDecimal;
import java.util.Objects;

public final class Disc {
    private final String name;
    private final int price;
    private final int productID;

    public Disc(String name, int price, int productID) {
        this.name = name;
        this.price = price;
        this.productID = productID;
    }

    public String name() {
        return name;
    }

    public int price() {
        return price;
    }

    public int productID() {
        return productID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Disc) obj;
        return Objects.equals(this.name, that.name) &&
                this.price == that.price &&
                this.productID == that.productID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, productID);
    }

    @Override
    public String toString() {
        return "Disc[" +
                "name=" + name + ", " +
                "price=" + price + ", " +
                "productID=" + productID + ']';
    }
}
