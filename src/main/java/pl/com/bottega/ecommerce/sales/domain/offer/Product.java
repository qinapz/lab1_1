package pl.com.bottega.ecommerce.sales.domain.offer;

public class Product {
	
    private String productId;
    private String productName;
    private Date productSnapshotDate;
    private Money productPrice;
    private String productType;
    
    public Product(String productId, String productName, Date productSnapshotDate, Money productPrice, String productType) {
    	this.productId=productId;
    	this.productName=productName;
    	this.productSnapshotDate=productSnapshotDate;
    	this.productPrice=productPrice;
    	this.productType=productType;
    }
    
    public String getProductId() {
        return productId;
    }

    public Money getProductPrice() {
        return productPrice;
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
}
