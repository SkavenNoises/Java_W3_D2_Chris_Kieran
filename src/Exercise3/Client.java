package Exercise3;

import java.util.ArrayList;

public class Client {
	private String name;
	private ArrayList<Invoice> invoices;

	public Client(String name) {
		this.invoices = new ArrayList<>();
		this.name = name;
	}

	public void addInvoice(Invoice invoice) {
		if (this.invoices.size() > 3) {
			System.out.println("Client can have no more than three invoices");
		} else {
			this.invoices.add(invoice);
		}
	}

	public void clearInvoices() {
		this.invoices.clear();
	}

	public double getInvoiceTotal() {
		double tempVal = 0;
		for (Invoice invoice : invoices) {
			tempVal += invoice.getInvoiceAfterTax();
		}
		return tempVal;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Invoice> getInvoices() {
		return invoices;
	}
}
