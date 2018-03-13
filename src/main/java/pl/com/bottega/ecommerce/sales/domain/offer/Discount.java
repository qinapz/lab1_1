package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Objects;

public class Discount{
    public String cause;
    public BigDecimal value;
    
    public Discount(BigDecimal value, String cause) {
        this.value = value;
        this.cause = cause;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (cause == null ? 0 : cause.hashCode());
        result = prime * result + (value == null ? 0 : value.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Discount discount = (Discount) obj;

        if (cause != null ? !cause.equals(discount.cause) : discount.cause != null)
            return false;
        return value != null ? value.equals(discount.value) : discount.value == null;
    }
}
