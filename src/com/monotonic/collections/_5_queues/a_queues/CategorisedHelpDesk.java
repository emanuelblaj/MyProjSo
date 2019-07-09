package com.monotonic.collections._5_queues.a_queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

import com.monotonic.collections._5_queues.Category;
import com.monotonic.collections._5_queues.Customer;
import com.monotonic.collections._5_queues.Enquiry;

public class CategorisedHelpDesk {
	private final Queue<Enquiry> enquiries = new ArrayDeque<>();
	
	public boolean enquire(final Customer customer, final Category type) {
		return enquiries.offer(new Enquiry(customer,type));
	}
	
	public void processPrinterEnquiry() {
		final Predicate<Enquiry> predicate = enq ->enq.getCategory() == Category.PRINTER;
		final String message = "Is it out of paper?";
		final Enquiry enquiry = enquiries.peek();
		if(enquiry != null && predicate.test(enquiry)) {
			
			enquiries.remove();
			enquiry.getCustomer().reply(message);
		} else {
			System.out.println("No work to do, let's have some coffe!");
			
		}
	}
	
	public void processGeneralEnquiry() {
		final Predicate<Enquiry> predicate = enq ->enq.getCategory() != Category.PRINTER;
		final String message = "Have you tried turning it off and on again?";
		final Enquiry enquiry = enquiries.peek();
		if(enquiry != null && predicate.test(enquiry)) {
			
			enquiries.remove();
			enquiry.getCustomer().reply(message);
			
		} else {
			System.out.println("No work to do, let's have some coffe!");
			
		}
		
	}
	
	public static void main(String[] args) {
		CategorisedHelpDesk helpDesk = new CategorisedHelpDesk();
		
		helpDesk.enquire(Customer.JACK, Category.PHONE);
		helpDesk.enquire(Customer.JILL, Category.PRINTER);
		
		helpDesk.processPrinterEnquiry();
		helpDesk.processGeneralEnquiry();
		helpDesk.processPrinterEnquiry();
	}
}
