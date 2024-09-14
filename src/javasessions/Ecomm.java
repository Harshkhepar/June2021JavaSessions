package javasessions;

import java.util.ArrayList;

public class Ecomm {

	// WAF -- >
		// create a function
		// input: productName (String)
		// return: list of sellers --> ArrayList<String>

		public ArrayList<String> getSellerList(String productName) {
			System.out.println("product name is : " + productName);
			
			ArrayList<String> sellerList = new ArrayList<String>();
			
			if (productName.equals("MacBook Pro")) {
				sellerList.add("Neon Enterprise");
				sellerList.add("xyz Enterprise");
				sellerList.add("IT Enterprise");
			}
			else if (productName.equals("Tshirt")) {
				sellerList.add("Myntra Enterprise");
				sellerList.add("Ajio Enterprise");
			}
			else if (productName.equals("XBox")) {
				sellerList.add("xoom enterprise, new delhi");
				sellerList.add("maddy IT games, banaglore");
			} else {
				System.out.println(productName + " is not found.....");
			}

			return sellerList;

		}
		
		
		public static void main(String[] args) {
			Ecomm obj = new Ecomm();
			ArrayList<String> macSellerList = obj.getSellerList("MacBook Pro");
			System.out.println(macSellerList);
			
			ArrayList<String> nikeSellerList = obj.getSellerList("Nike shoes");
			System.out.println(nikeSellerList);
			
			ArrayList<String> countryList = obj.getContractAddress("IVM-SUB");
			System.out.println(countryList);
			
			ArrayList<String> countryList1 = obj.getContractAddress("IDR-SUB");
			System.out.println(countryList1);
			
			ArrayList<String> countryList2 = obj.getContractAddress("IMB-SUB");
			System.out.println(countryList2);
			
			
		} 
		
		public ArrayList<String> getContractAddress(String productName) {
			
			System.out.println("Address to get : " + productName);
			
			ArrayList<String> countryAddressList = new ArrayList<String>();
			
			if(productName.equals("IVM-SUB")) {
				countryAddressList.add("USA");
				countryAddressList.add("Autrailia");
				countryAddressList.add("India");
			}
			else if(productName.equals("IDR-SUB")) {
				countryAddressList.add("USA");
				countryAddressList.add("New Zealand");
				countryAddressList.add("Israel");
			}
			else {
				System.out.println(productName + " "+ "is not found --- please pass the correct " + productName);
			}
			return countryAddressList;
		}
				

}
