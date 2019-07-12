package it.worldpay.vale.offermanagertest.dao.offer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.worldpay.vale.offermanagertest.model.offer.Offer;

@Repository
public interface OfferDao extends CrudRepository<Offer, Long> {
	

}
