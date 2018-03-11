package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class Product {
    public String id;    
    public String name;
    public Price price;
    public String type;
    public Date snapshotDate;
    
    
    public Product(String id,  String name, Price price, String type,  Date snapshotDate) {
        this.id = id;        
        this.name = name;
        this.price = price;
        this.type = type;
        this.snapshotDate = snapshotDate;        
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (id == null ? 0 : id.hashCode());
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (price == null ? 0 : price.hashCode());        
        result = prime * result + (type == null ? 0 : type.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product other = (Product) obj;
        return id.equals(other.id) && name.equals(other.name) && 
        	   type.equals(other.type) && price.equals(other.price);
    }
}
