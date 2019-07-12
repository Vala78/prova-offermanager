package it.worldpay.vale.offermanagertest.service.offer;

import org.springframework.stereotype.Service;

import it.worldpay.vale.offermanagertest.model.offer.Offer;

@Service
public class OfferServiceDefault extends OfferService {

	@Override
	public void saveOffer(Offer offer) {
		
		Offer offerDuplicated = offerDao.findOne(offer.getOfferId());
		
		offerDao.save(offer);
		
	}

	@Override
	public void deleteOffer(Long id) {
		
		Offer offerFound = offerDao.findOne(id);
		
		offerDao.delete(id);
		
	}

	@Override
	public Offer getOffer(Long idOffer) {
		
		Offer offerFound = offerDao.findOne(idOffer);
		
		return offerFound;
	}
	
	//inserire i metodi per il controllo delle date

}
