package it.worldpay.vale.offermanagertest.service.product.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.worldpay.vale.offermanagertest.dao.product.book.BookDao;
import it.worldpay.vale.offermanagertest.model.product.book.Book;
import it.worldpay.vale.offermanagertest.service.BaseService;

@Service
public class BookService extends BaseService<Book> {
	
	@Autowired
	BookDao bookDao;

	@Override
	public void saveProduct(Book product) {
		
		bookDao.save(product);
		
	}
	
	

}
