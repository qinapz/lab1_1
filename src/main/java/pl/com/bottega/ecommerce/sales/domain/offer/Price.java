package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class Price {	
	public BigDecimal value;
    public String currency;    
    
    public Price(BigDecimal value, String currency) {
    	this.value = value;  
        this.currency = currency;            
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (value == null ? 0 : value.hashCode());
        result = prime * result + (currency == null ? 0 : currency.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price other = (Price) obj;
        return value.equals(other.value) && currency.equals(other.currency);
    }
}
