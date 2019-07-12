package it.worldpay.vale.offermanagertest.errors.exception;

import it.worldpay.vale.offermanagertest.model.product.Product;

public class ProductExpiredException extends RuntimeException {
	
	private Long productId;
	private Product expiredProduct;
	
	public ProductExpiredException(String message,Product expiredProduct){
		super(message);
		this.productId = expiredProduct.getProductId();
		this.expiredProduct = expiredProduct;
}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Product getExpiredProduct() {
		return expiredProduct;
	}

	public void setExpiredProduct(Product expiredProduct) {
		this.expiredProduct = expiredProduct;
	}
	
}
