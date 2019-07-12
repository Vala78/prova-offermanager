package it.worldpay.vale.offermanagertest.model.product.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;

import it.worldpay.vale.offermanagertest.model.product.Product;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "bookId")
public class Book extends Product {
	
	public Book(){
		super();
		
	}
	
	@Column(name= "AUTHOR")
	private String author;
	
	@Column(name ="NUMBER_OF_PAGES")
	private int numberOfPages;
	
	@Column(name ="COVER_TYPE")
	private String coverType;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getCoverType() {
		return coverType;
	}

	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}

}
