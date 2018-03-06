package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class Product {

    private String productId;

    private Money price;

    private String productName;

    private Date productSnapshotDate;

    private String productType;

    public String getProductId() {
        return productId;
    }

    public BigDecimal getProductPrice() {
        return price.getCost();
    }

    public String getProductName() {
        return productName;
    }

    public Date getProductSnapshotDate() {
        return productSnapshotDate;
    }

    public String getProductType() {
        return productType;
    }

    public Money getPrice() {
        return price;
    }

    public Product(String productId, BigDecimal productPrice, String productName, Date productSnapshotDate,
            String productType) {
        super();
        this.price = new Money(productPrice);
        this.productId = productId;
        this.productName = productName;
        this.productSnapshotDate = productSnapshotDate;
        this.productType = productType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + (productName == null ? 0 : productName.hashCode());
        result = prime * result + (price == null ? 0 : price.hashCode());
        result = prime * result + (productId == null ? 0 : productId.hashCode());
        result = prime * result + (productType == null ? 0 : productType.hashCode());
        return result;
    }
}
