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
        super();
        this.cost = cost;
        this.currency = currency;
    }
    

}
