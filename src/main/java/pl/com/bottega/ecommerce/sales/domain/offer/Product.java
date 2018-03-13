package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class Product {

    private String id;

    private Money price;

    private String name;

    private Date snapshotDate;

    private String type;

    public String getId() {
        return id;
    }

    public Money getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Date getSnapshotDate() {
        return snapshotDate;
    }

    public String getType() {
        return type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (id == null ? 0 : id.hashCode());
        result = prime * result + (price == null ? 0 : price.hashCode());
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (snapshotDate == null ? 0 : snapshotDate.hashCode());
        result = prime * result + (type == null ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Product newProduct = (Product) obj;
        return id.equals(newProduct.getId()) && price.equals(newProduct.getPrice()) &&
                name.equals(newProduct.getName()) && snapshotDate.equals(newProduct.getSnapshotDate()) &&
                type.equals(newProduct.getPrice());
    }
}
