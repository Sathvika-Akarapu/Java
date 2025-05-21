package ExceptionalHandling;
import java.util.*;

public class Ques5 {

	public static void main(String[] args) {
		try {
			String coupon=args[0];
			String validCoupon="COUPON123";
			if(coupon.equals(validCoupon)) {
				System.out.println("coupon  applied successfully");
			}else {
				throw new Exception("Invalid coupon code");
			}
		}catch(Exception e) {
			System.out.println("Failed to apply the coupon: "+ e.getMessage());
		}finally {
			System.out.println("Thankyou for shopping with us");
		}

	}

}
