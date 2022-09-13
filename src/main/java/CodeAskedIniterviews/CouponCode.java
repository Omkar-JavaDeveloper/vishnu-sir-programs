package CodeAskedIniterviews;

public class CouponCode {
	
	static int noOfUniqueCoupons(int length) {
		
		int noOfcoupons= 1;
		
		for(int i=10;i>(10-length);i--) {
			
			noOfcoupons= noOfcoupons*i;
		}
		
		return noOfcoupons;
	}
	public static void main(String[] args) {
		
		 System.out.println(noOfUniqueCoupons(3));
	}

}
