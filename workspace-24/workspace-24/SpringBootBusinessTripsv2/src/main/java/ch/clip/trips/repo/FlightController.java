package ch.clip.trips.repo;

import ch.clip.trips.ex.TriptNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class FlightController {
	private static final Logger log = LoggerFactory.getLogger(FlightController.class);

//	@Autowired
	private FlightRepository flightRepository;

	FlightController(FlightRepository flightRepository) {
		this.flightRepository = flightRepository;
	}

	/**
	 * Method that returns the list of flights in the current trips
	 *
	 * @return List of products
	 */
	//@CrossOrigin(origins ="http://localhost:3000")
	// @RequestMapping(value = "/flights", method = RequestMethod.GET, produces =
	// "application/json")
	@GetMapping("/flights")
	List<Flight> allItems() {
		return (List<Flight>) flightRepository.findAll();
	}

	/**
	 * add a new Item to the cart
	 *
	 * @param newItem Request object
	 * @return true/false
	 */
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/flights")
	Flight newItem(@RequestBody Flight newItem) {
		return flightRepository.save(newItem);
	}

	// single Item

	@GetMapping("/flights/{id}")
	Flight one(@PathVariable Long id) {
		return flightRepository.findById(id).orElseThrow(() -> new TriptNotFoundException(id));
	}

	@PutMapping("/flights/{id}")
	Flight replaceItem(@RequestBody Flight newItem, @PathVariable Long id) {
		return flightRepository.findById(id).map(item -> {
			item.setNumber(newItem.getNumber());
			item.setFrom(newItem.getFrom());
			item.setTo(newItem.getTo());
			return flightRepository.save(item);

		}).orElseGet(() -> {
			newItem.setId(id);
			return flightRepository.save(newItem);
		});
	}

	/**
	 * Method that deletes an item from the trip
	 *
	 * @param request Request object
	 * @return Status boolean
	 */
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/flights/{id}")
	void deleteItem(@PathVariable Long id) {
		flightRepository.deleteById(id);
	}

	/**
	 * Method that empties the trip
	 *
	 * @return Status string
	 */
	@CrossOrigin(origins = "http://localhost:3001")
	@DeleteMapping("/flights")
	void emptyFlights() {
		flightRepository.deleteAll();
	}

}
