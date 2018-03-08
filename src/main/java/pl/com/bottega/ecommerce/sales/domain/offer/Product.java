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
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (productName == null ? 0 : productName.hashCode());
        result = prime * result + (productPrice == null ? 0 : productPrice.hashCode());
        result = prime * result + (productId == null ? 0 : productId.hashCode());
        result = prime * result + (productType == null ? 0 : productType.hashCode());
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
        Product other=(Product)obj;
        
        return  productId.equals(other.getProductId()) 
        		&& productName.equals(other.productName) 
        		&& productPrice.equals(other.getProductPrice()) 
        		&& productSnapshotDate.equals(other.getProductSnapshotDate()) 
        		&& productType.equals(other.getProductType());
    }
}
}
