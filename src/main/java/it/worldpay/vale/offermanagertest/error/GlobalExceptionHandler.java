package it.worldpay.vale.offermanagertest.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import it.worldpay.vale.offermanagertest.errors.exception.DuplicateResourceException;
import it.worldpay.vale.offermanagertest.errors.exception.ExceptionResponse;
import it.worldpay.vale.offermanagertest.errors.exception.MissingParameterException;
import it.worldpay.vale.offermanagertest.errors.exception.ProductExpiredException;
import it.worldpay.vale.offermanagertest.errors.exception.ResourceNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler extends AbstractGlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ExceptionResponse> productNotFound(ResourceNotFoundException ex){
		return buildAndSendErrorResponse(ex, "not found", ex.getProductNotFound(), HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(DuplicateResourceException.class)
	public ResponseEntity<ExceptionResponse> productDuplicated(DuplicateResourceException ex) {
        return buildAndSendErrorResponse(ex, "duplicated",ex.getDuplicatedProduct(), HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(MissingParameterException.class)
    public ResponseEntity<ExceptionResponse> productIdDuplicated(MissingParameterException ex) {
        return buildAndSendErrorResponse(ex, "missing, or wrong, mandatory parameter",ex.getMissingParameterProduct(), HttpStatus.CONFLICT);
    }
	
	 @ExceptionHandler(ProductExpiredException.class)
	    public ResponseEntity<ExceptionResponse> productIdDuplicated(ProductExpiredException ex) {
	        return buildAndSendErrorResponse(ex, "offer on the specific product is expired",ex.getExpiredProduct(), HttpStatus.CONFLICT);
	    }
	
	
	
	

}
