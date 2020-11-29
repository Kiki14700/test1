package zadatak3;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Paket pck = new Paket();
	   	Scanner sca = new Scanner(System.in);
	   	System.out.println("Input payment method: ");
	   	String payM = "";

	   	pck.setCustomerID(12354);
	   	pck.setDestination("Zadar");
	   	pck.setIdPack(11);
	   	pck.setPaymentMeth("CPA");
	   	pck.setSellCompany("BestCompany");
	   	
	   
	   	
	   	
	  
	   	while(pck.checkPaymentPackage() == false) {
	   		pck.setPaymentMeth(sca.nextLine());
	   		if(pck.checkPaymentPackage() == true) {
	   			pck.sentPackage();
	   			pck.putContent();
	   		}
	   		
	   		
	   		
	   		
	   			
	   		}
   		
	   		
	   	}
	}
	


