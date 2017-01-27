package com.rinzler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceBuilder {

	private double value;
	private String address;
	private Date dueDate;
	private String paymentResponsible;
	private List<InvoiceItem> invoiceItens = new ArrayList<>();
	
	public InvoiceBuilder withValue(double value){
		this.value = value;
		return this;
	}
	
	public InvoiceBuilder withAddress(String address){
		this.address = address;
		return this;
	}
	
	public InvoiceBuilder withDueDate(Date dueDate){
		this.dueDate = dueDate;
		return this;
	}
	
	public InvoiceBuilder withPaymentResponsible(String paymentResponsible){
		this.paymentResponsible = paymentResponsible;
		return this;
	}
	
	public InvoiceBuilder withInvoiceItens(InvoiceItem item){
		invoiceItens.add(item);
		return this;
	}
	
	public Invoice build (){
		return new Invoice(value, address, dueDate, paymentResponsible, invoiceItens);
	}	
}
