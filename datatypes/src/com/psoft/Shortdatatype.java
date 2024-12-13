package com.psoft;

public class Shortdatatype {

	 String carBrand = "Lamborgini";
	static String carModel = "Lamborgini Urus";

	void cardata() {
		short CarNumber = 99;

		long chassiesNumber = 98845551;
		int carPrice = 20000000;

		float fuelCapacity = 15.5f;
		char ownerName = 'J';
		double carWeight = 2000.00;
		System.out.println("carnumber=" + CarNumber);
		System.out.println("chassiesNumber=" + chassiesNumber);

		System.out.println("carPrice=" + carPrice);
		System.out.println("fuelCapacity=" + fuelCapacity);

		System.out.println("ownerName=" + ownerName);
		System.out.println("carWeight=" + carWeight);

	}

	public static void main(String[] args) {

		byte numofcarsinstreettwo = 5;
		byte numofcarsinstreetone = 2;
		Shortdatatype sh = new Shortdatatype();
		System.out.println("carBrandName=" + sh.carBrand);
		System.out.println("carModelName=" + carModel);
		System.out.println(numofcarsinstreettwo > numofcarsinstreetone);
		
		sh.cardata();

	}

}
