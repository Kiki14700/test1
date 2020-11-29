package zadatak3;

public class Paket {
	
	private  int idPack;
	private String destination;
	private int customerID;
	private String sellCompany;
	private String paymentMeth;
	private float pricePackage;
	private int kom;
	private int cnt = 0;
	
	
	
	
	public class Helmet{
		float price;
		int kom;
		
		public Helmet(float price, int kom) {
			this.price = price;
			this.kom = kom;
		}
		
		int getKomHlemet(){
			return kom;
		}
		
		float priceHlemet() {
			return price;
		}
	}
	
	public class Pants{
		float price;
		int kom;
		
		public Pants(float price, int kom) {
			this.price = price;
			this.kom = kom;
			
		}
		
		float pricePant() {
			return price;
		}
		
	}
	
	public class Sneakers {
		float price;
		int kom;
		
		public Sneakers(float price, int kom) {
			this. price = price;
			this.kom = kom; 
		}
		
		float priceSneakeres() {
			return price;
		}
		
	}
	
	public class Tshirt{
		float price;
		int kom;
		
		public Tshirt(float price, int kom) {
			this.price = price;
			this.kom = kom;
			
		}
		
		float priceTshirt() {
			return price;
		}
	}
	
	
	public boolean  checkPaymentPackage(){
		
		boolean result = true;
		
		class PaymentMedia{
			
			private final String POU = "POU";
			private final String CP = "CP";
			private final String OPS = "OPS";

			
			
			boolean payPackage(){
				
				switch (paymentMeth) {

				case POU:
					System.out.println("Payment will be made to a courier service ... ");
					System.out.println("Package with id: " + idPack + ", payed by customer with id: " + customerID);
					System.out.println("\n");
					return true;
				case CP:
					System.out.println("Payment is done with credit card ...");
					System.out.println("Package with id: " + idPack + ", payed by customer with id: " + customerID);
					System.out.println("\n");
					return true;
				case OPS:
					System.out.println("Payment is done by online payment service ...");
					System.out.println("Package with id: " + idPack + ", payed by customer with id: " + customerID);
					System.out.println("\n");
					return true;
				default:
					System.out.println("Please choose a valid payment method ...");
					System.out.println("\n");
					cnt++;
					return false;
				}
			}

			void paymentPossible() {

				System.out.println("Possible payment methods:");
				System.out.println("POU");
				System.out.println("CP");
				System.out.println("OPS");
				System.out.println("This is attempt: " + cnt);
				
			}
		}
		PaymentMedia pm = new PaymentMedia();
		result = pm.payPackage();
		if(result == false) {
			pm.paymentPossible();
		}
		return result;
		
		
	}
	
	
	public float  putContent() {
		
		Helmet hlm = new Helmet(122 , 3 );
		
		Pants pnts = new Pants(20, 2);
		
		Sneakers snkrs = new Sneakers(22 , 2);
		
		Tshirt tshrt = new Tshirt(12, 2);
		
		float pricePackage = 122*3 + 20*2 + 22*2 + 12*2;
		
		return pricePackage;
		
	}
	
	
	
	
	public int getIdPack() {
		return idPack;
	}


	public void setIdPack(int idPack) {
		this.idPack = idPack;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getSellCompany() {
		return sellCompany;
	}


	public void setSellCompany(String sellCompany) {
		this.sellCompany = sellCompany;
	}


	public String getPaymentMeth() {
		return paymentMeth;
	}


	public void setPaymentMeth(String paymentMeth) {
		this.paymentMeth = paymentMeth;
	}


	public float getPricePackage() {
		return pricePackage;
	}


	public void setPricePackage(float pricePackage) {
		this.pricePackage = pricePackage;
	}


	public int getCom() {
		return kom;
	}


	public void setCom(int kom) {
		this.kom = kom;
	}


	public void info() {
		
		checkPaymentPackage();
		
		System.out.println("Customer place: " + destination );
		System.out.println("Package price: " + putContent() );
		
		
		
	}
	
	public void sentPackage() {
		
		System.out.println("Package: " + idPack + " sent to customer with ID: " + customerID);
		System.out.println("Cutomer destination: "+ destination);
		
	}

	
	
	
	
	
	
	
	

	
	
	
	
	
}

