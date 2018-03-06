package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money {

    private BigDecimal cost;

    private String currency;

    public BigDecimal getCost() {
        return cost;
    }

    public String getCurrency() {
        return currency;
    }

    public Money(BigDecimal cost, String currency) {
        this.cost = cost;
        this.currency = currency;
    }

    public Money(BigDecimal cost) {
        this(cost, "Zloty");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (cost == null ? 0 : cost.hashCode());

        return result;
    }
}
