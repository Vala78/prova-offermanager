package it.worldpay.vale.offermanagertest.dao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import it.worldpay.vale.offermanagertest.model.product.Product;

@NoRepositoryBean
public interface BaseRepository<T extends Product> extends CrudRepository<T,Long>{
	
	Product findByProductId(Long productId);
}
