package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class Product {

    private String id;
    private String name;
    private String type;
    private Cost cost;
    private Date snapshotDate;

    public Product(String id, String name, String type, Cost cost, Date snapshotDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.snapshotDate = snapshotDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Cost getCost() {
        return cost;
    }
    
    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public Date getSnapshotDate() {
        return snapshotDate;
    }

    public void setSnapshotDate(Date snapshotDate) {
        this.snapshotDate = snapshotDate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (id == null ? 0 : id.hashCode());
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (type == null ? 0 : type.hashCode());
        result = prime * result + (cost == null ? 0 : cost.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        return id.equals(other.getId()) && name.equals(other.getName()) && 
        	   type.equals(other.getType()) && cost.equals(other.getCost());
    }
}
