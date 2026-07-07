import java.util.Arrays;

interface CouponValidator {
    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        if (code == null) return false;
        return code.length() >= 5 && code.length() <= 10;
    }
}

class ShoppingCart implements CouponValidator {
    private final String[] validPromos = {"SUMMER", "WINTER", "SAVE20", "FREESHIP"};

    @Override
    public boolean validateCoupon(String code) {
        if (!CouponValidator.isLengthValid(code)) {
            return false;
        }
        return Arrays.stream(validPromos)
                     .anyMatch(promo -> promo.equalsIgnoreCase(code));
    }
}

public class CouponSystem {
    public static void main(String[] args) {
        String[] couponsToCheck = {"SUMMER", "HI", "WINTER", "INVALIDCODE123", "SAVE20", "FALL"};

        ShoppingCart cart = new ShoppingCart();

        System.out.println("--- Coupon Validation Results ---");
        for (String code : couponsToCheck) {
            if (cart.validateCoupon(code)) {
                System.out.printf("Coupon '%s' is VALID\n", code);
            } else {
                System.out.printf("Coupon '%s' is INVALID\n", code);
            }
        }
    }
}