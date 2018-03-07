package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {
    private String discountCause;

    private Money discountValue;

    public Discount(String discountCause, Money discountValue) {
        this.discountCause = discountCause;
        this.discountValue = discountValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Discount discount = (Discount) o;

        if (discountCause != null ? !discountCause.equals(discount.discountCause) : discount.discountCause != null)
            return false;
        return discountValue != null ? discountValue.equals(discount.discountValue) : discount.discountValue == null;
    }

    @Override
    public int hashCode() {
        int result = discountCause != null ? discountCause.hashCode() : 0;
        result = 31 * result + (discountValue != null ? discountValue.hashCode() : 0);
        return result;
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
