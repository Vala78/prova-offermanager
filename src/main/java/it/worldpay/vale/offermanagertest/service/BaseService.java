package it.worldpay.vale.offermanagertest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.worldpay.vale.offermanagertest.dao.product.ProductDao;
import it.worldpay.vale.offermanagertest.model.product.Product;

@Service
public abstract class BaseService <T extends Product> {
	
	
	@Autowired
	ProductDao<Product> productDao;
	
	public abstract void saveProduct(T product);
	
	public Product getProduct(Long id) {
		
		Product productFound = productDao.findOne(id);
		
		return productFound;
	}
	
	public void deleteProduct(Long productId) {
		
		Product productNotFound =  (Product)productDao.findByProductId(productId);
		
		productDao.delete(productId);
	}
	
	//inserire i metodi per il controllo delle date
}
