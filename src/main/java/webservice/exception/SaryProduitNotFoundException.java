package webservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class SaryProduitNotFoundException extends RuntimeException {
    public SaryProduitNotFoundException(String message) {
        super(message);
    }
}