package it.worldpay.vale.offermanagertest.model.offer;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import it.worldpay.vale.offermanagertest.model.product.Product;

@Entity
public class Offer implements Serializable {

	@Id
	@NotNull
	@Column(unique = true, updatable = false, name = "OFFER_ID")
	private Long offerId;

	// costructors
	public Offer() {
	}

	public Offer(Long offerId, List<Product> products) {
		this.offerId = offerId;
		this.products = products;
	}

	// one offer more products
	@OneToMany(mappedBy = "offer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Long getOfferId() {
		return offerId;
	}

	public void setOfferId(Long offerId) {
		this.offerId = offerId;
	}

}
