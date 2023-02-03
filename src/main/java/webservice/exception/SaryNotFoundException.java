package webservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class SaryNotFoundException extends RuntimeException  {
    public SaryNotFoundException(String message) {
        super(message);
    }
}
