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

    public String getCause() {
        return cause;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (cause == null ? 0 : cause.hashCode());
        result = prime * result + (discountValue == null ? 0 : discountValue.hashCode());
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
        Discount newDiscount = (Discount) obj;
        return discountValue.equals(newDiscount.getDiscountValue()) && cause.equals(newDiscount.getCause());
    }
}
