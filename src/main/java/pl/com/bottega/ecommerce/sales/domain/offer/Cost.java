package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Cost {
    
    private BigDecimal value;
    private String currency;
    
    public Cost(BigDecimal value, String currency) {
        this.value = value;
        this.currency = currency;
    }
    
    public BigDecimal getValue() {
        return value;
    }
    
    public void setValue(BigDecimal value) {
        this.value = value;
    }
    
    public String getCurrency() {
        return currency;
    }
    
    public void setCurrency(String currency) {
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
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Cost)) {
            return false;
        }
        Cost other = (Cost) object;
        return value.equals(other.getValue()) && currency.equals(other.getCurrency());
    }
    
}
