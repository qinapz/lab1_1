package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money {
    public BigDecimal value;
    public String currency;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (value == null ? 0 : value.hashCode());
        result = prime * result + (currency == null ? 0 : currency.hashCode());
        return result;
    }
}
