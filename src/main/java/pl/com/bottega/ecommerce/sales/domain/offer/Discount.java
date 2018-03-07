package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {
    private String discountCause;

    private Money discountValue;

    public Discount(String discountCause, Money discountValue) {
        this.discountCause = discountCause;
        this.discountValue = discountValue;
    }

    public String getDiscountCause() {
        return discountCause;
    }

    public void setDiscountCause(String discountCause) {
        this.discountCause = discountCause;
    }

    public Money getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(Money discountValue) {
        this.discountValue = discountValue;
    }
}
