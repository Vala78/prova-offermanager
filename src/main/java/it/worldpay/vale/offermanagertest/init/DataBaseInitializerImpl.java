package it.worldpay.vale.offermanagertest.init;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import it.worldpay.vale.offermanagertest.model.offer.Offer;
import it.worldpay.vale.offermanagertest.model.product.Product;
import it.worldpay.vale.offermanagertest.model.product.book.Book;

@Component
public class DataBaseInitializerImpl implements DataBaseInitializer {

	public Book getBook() throws ParseException {
		Book book = new Book();
		book.setProductId(new Long(2));
		book.setCoverType("Soft");
		book.setAuthor("Camilleri");
		book.setDaysValidityPeriod(10);
		book.setNumberOfPages(400);
		book.setOfferDescription("A fun and ingenious reading");
		try {
			book.setOfferStartingDate(new SimpleDateFormat("yyyy-MM-dd").parse("2019-08-18 11:00"));
			book.setOfferExpiringDate(new SimpleDateFormat("yyyy-MM-dd").parse("2019-08-28 11:00"));
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}
		book.setOfferPrice(15.00);
		book.setOffer(getGenericOffer());
		book.setProductName("Gli arancini di Montalbano");
		
		
		return book;
	}

	
	public Offer getGenericOffer() {
		return new Offer(new Long(15), new ArrayList<Product>());
	}

}
