package it.worldpay.vale.offermanagertest.errors.exception;

import it.worldpay.vale.offermanagertest.model.offer.Offer;
import it.worldpay.vale.offermanagertest.model.product.Product;

public class DuplicateResourceException extends RuntimeException {
	
	private Long productId;
	private Product duplicatedProduct;
	private Offer duplicatedOffer;
	
	public DuplicateResourceException(String message,  Product duplicatedProduct){
		super(message+": "+ duplicatedProduct.getProductId());
		this.productId = duplicatedProduct.getProductId();
		this.duplicatedProduct = duplicatedProduct;
	}

	public DuplicateResourceException(String message, Offer duplicatedOffer){
		super(message+": "+ duplicatedOffer.getOfferId());
		this.productId = duplicatedOffer.getOfferId();
		this.duplicatedOffer = duplicatedOffer;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Product getDuplicatedProduct() {
		return duplicatedProduct;
	}

	public void setDuplicatedProduct(Product duplicatedProduct) {
		this.duplicatedProduct = duplicatedProduct;
	}

	public Offer getDuplicatedOffer() {
		return duplicatedOffer;
	}

	public void setDuplicatedOffer(Offer duplicatedOffer) {
		this.duplicatedOffer = duplicatedOffer;
	}
	

}
