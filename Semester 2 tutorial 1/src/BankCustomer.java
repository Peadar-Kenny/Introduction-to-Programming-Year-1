import java.util.Scanner;
public class BankCustomer {
	private int accountNumber;
	private String customerName;
	private String customerAddress;
	private int customerDOB;

	//Acc number
	public void setAccountNumber(int accountNumberSet) {
       	accountNumber = accountNumberSet;
    }
	public int getAccountNumber() {
	return accountNumber;
    }
	//cust Name
	public void setCustomerName(String customerNameSet) {
		customerName = customerNameSet;
	}
	public String getCustomerName() {
		return customerName;
	}
    //Cust Address
	public void setCustomerAddress(String customerAddressSet) {
		customerAddress = customerAddressSet;		
	}
	public String getCustomerAdress(){
		return customerAddress;
	}
}