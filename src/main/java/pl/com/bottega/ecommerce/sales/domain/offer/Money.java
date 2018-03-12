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
}
