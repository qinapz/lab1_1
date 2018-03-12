package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {

    private String cause;

    private Money discountValue; // "value" would conflict with Money's value

    public Discount(Money discountValue) {
        this("", discountValue);
    }

    public Discount(String cause, Money discountValue) {
        this.cause = cause;
        this.discountValue = discountValue;
    }

    public Money getDiscountValue() {
        return discountValue;
    }
}
