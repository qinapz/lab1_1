package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {
    private String cause;

    private Money value;

    public Discount(String cause, Money value) {
        this.cause = cause;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Discount discount = (Discount) o;

        if (cause != null ? !cause.equals(discount.cause) : discount.cause != null)
            return false;
        return value != null ? value.equals(discount.value) : discount.value == null;
    }

    @Override
    public int hashCode() {
        int result = cause != null ? cause.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Money getValue() {
        return value;
    }

    public void setValue(Money value) {
        this.value = value;
    }
}
