package ch.clip.trips.ex;

public class TriptNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 7334815941308526816L;

	public TriptNotFoundException(Long id ) {
		super("could not find trip "+id);
	}

}
