package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {
    private String discountCause;

    private Money discount;


    public Discount(BigDecimal discount, String currency, String discountCause){
        this.discount = new Money(discount,currency);
        this.discountCause = discountCause;


    }


}
