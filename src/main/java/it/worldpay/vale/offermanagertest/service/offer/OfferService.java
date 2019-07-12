package it.worldpay.vale.offermanagertest.service.offer;

import org.springframework.beans.factory.annotation.Autowired;

import it.worldpay.vale.offermanagertest.dao.offer.OfferDao;
import it.worldpay.vale.offermanagertest.model.offer.Offer;
import it.worldpay.vale.offermanagertest.model.product.book.Book;
import it.worldpay.vale.offermanagertest.service.BaseService;

public abstract class OfferService {
	
	@Autowired
	OfferDao offerDao;
	
	public abstract void saveOffer(Offer offer);
	public abstract void deleteOffer(Long idOffer);
	public abstract Offer getOffer(Long idOffer);
	
	

}
