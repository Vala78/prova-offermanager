package it.worldpay.vale.offermanagertest.init;

import org.springframework.stereotype.Component;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import it.worldpay.vale.offermanagertest.model.offer.Offer;
import it.worldpay.vale.offermanagertest.model.product.book.Book;

@Component
public interface DataBaseInitializer {
	
	Book getBook()throws ParseException;
	Offer getGenericOffer();

}
