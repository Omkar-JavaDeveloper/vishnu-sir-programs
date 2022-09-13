package com.csi.core2;

import java.util.Scanner;

/*  If cost price and selling price of an item are input through the keyboard,
 *  write a program to determine whether the seller has made profit or incurred loss.
 *   Also determine how much profit he made or loss he incurred.
 */

public class ProfitLOss {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int costprice = scanner.nextInt();
		int sellingprice = scanner.nextInt();

		if (costprice > sellingprice) {
			System.out.println("Bro you got loss ! total loss is :" + (costprice - sellingprice));

		} else if (sellingprice > costprice) {
			System.out.println(" bro you got profit , total profit is:" + (sellingprice - costprice));
		}
		else if (sellingprice== costprice) {
			System.out.println(" NO PROFIT NO LOSS");
		}

	}

}
