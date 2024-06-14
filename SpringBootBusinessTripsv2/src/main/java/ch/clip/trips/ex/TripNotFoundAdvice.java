package ch.clip.trips.ex;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class TripNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(TriptNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String productNotFoundHandler(TriptNotFoundException ex) {
		return ex.getMessage();
	}
}
