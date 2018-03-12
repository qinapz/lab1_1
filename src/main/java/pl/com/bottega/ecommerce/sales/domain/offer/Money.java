package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money {
    public static final String DEFAULT_CURRENCY = "PLN";

    private String currency;

    private BigDecimal value;

    public Money(BigDecimal value) {
        this(value, DEFAULT_CURRENCY);
    }

    public Money(BigDecimal value, String currency) {
        this.currency = currency;
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (currency == null ? 0 : currency.hashCode());
        result = prime * result + (value == null ? 0 : value.hashCode());
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
        Money newMoney = (Money) obj;
        return currency.equals(newMoney.getCurrency()) && value.equals(newMoney.getValue());
    }
}
