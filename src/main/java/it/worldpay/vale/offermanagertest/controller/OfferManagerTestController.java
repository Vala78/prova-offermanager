package it.worldpay.vale.offermanagertest.controller;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.worldpay.vale.offermanagertest.model.offer.Offer;
import it.worldpay.vale.offermanagertest.model.product.Product;
import it.worldpay.vale.offermanagertest.model.product.book.Book;
import it.worldpay.vale.offermanagertest.model.product.foods.Food;
import it.worldpay.vale.offermanagertest.service.BaseServiceDefault;
import it.worldpay.vale.offermanagertest.service.offer.OfferServiceDefault;
import it.worldpay.vale.offermanagertest.service.product.book.BookService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/offersVale")
public class OfferManagerTestController {
	
	@Autowired
	BaseServiceDefault baseServiceDefault;
	
	@Autowired 
	BookService bookService;
	
	@Autowired
	OfferServiceDefault offerServiceDefault;
	
	
	@RequestMapping(value="/getProduct/{productId}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable("productId") Long productId) {
        return baseServiceDefault.getProduct(productId);
    }
	
	@RequestMapping(value="/deleteProduct/{productId}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("productId") Long  productId, HttpServletResponse response)
	{
		baseServiceDefault.deleteProduct(productId);
		 response.setStatus(HttpStatus.OK.value());
	}
	
	@RequestMapping(value="/saveBook", method = RequestMethod.POST)
	public void saveBook(@Valid @RequestBody Book book, HttpServletResponse response){
		bookService.saveProduct(book);
		response.setStatus(HttpStatus.CREATED.value());	
	}
	
	@RequestMapping(value="/saveOffer", method = RequestMethod.POST)
	public void saveOffer(@Valid @RequestBody Offer offer, HttpServletResponse response){
		offerServiceDefault.saveOffer(offer);
		response.setStatus(HttpStatus.CREATED.value());	
	}
	
	@RequestMapping(value="/getOffer/{offerId}", method = RequestMethod.GET)
	public Offer getOffer(@PathVariable("offerId") Long offerId) {
        return offerServiceDefault.getOffer(offerId);
    }
		
	
	@RequestMapping(value="/deleteOffer/{offerId}", method = RequestMethod.DELETE)
	public void deleteOffer(@PathVariable("offerId") Long  offerId, HttpServletResponse response)
	{
		offerServiceDefault.deleteOffer(offerId);
		 response.setStatus(HttpStatus.OK.value());
	}
	
	/*
	 * TODO somenthing
	 */

}
