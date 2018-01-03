package main;

public class Controller {
	private CustomerRegister cReg = new CustomerRegister();
	
	public boolean addCustomer(String name, String adress) {
		cReg.addCustomer(new Customer(custNumbGen(), name, adress))
		
	}
	
	public String custNumbGen() {
		Random rand = new Random();
		String random = Integer.toString(rand.nextInt(maxNbr));
		boolean b = true;
		while (b) {
			if (idList.contains(random)) {
				random = Integer.toString(rand.nextInt(maxNbr));
			} else
				idList.add(random);
			b = false;
		}
		return random;
	}
	
	
}
