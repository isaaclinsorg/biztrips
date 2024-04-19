package ch.clip.trips.repo;

import ch.clip.trips.ex.TriptNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class EmployeeController {
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeRepository employeeRepository;


	/**
	 * Method that returns the list of products in the current shopping cart
	 *
	 * @param shoppingCart List of products injected by Spring MVC from the session
	 * @return List of products
	 */
	//@CrossOrigin(origins ="http://localhost:3001")
	// @RequestMapping(value = "/cart/items", method = RequestMethod.GET, produces =
	// "application/json")
	@GetMapping("/employees")
	List<Employee> allItems() {
		System.out.println("hello employees");
		return (List<Employee>) employeeRepository.findAll();

	}

	/**
	 * add a new Item to the cart
	 *
	 * @param newItem Request object
	 * @return true/false
	 */
	@CrossOrigin(origins = "http://localhost:3001")
	@PostMapping("/employees")
	Employee newItem(@RequestBody Employee newItem) {
		return employeeRepository.save(newItem);
	}

	// single Item

	@GetMapping("/employees/{id}")
	Employee one(@PathVariable Long id) {
		return employeeRepository.findById(id).orElseThrow(() -> new TriptNotFoundException(id));
	}

	@PutMapping("/cart/items/{id}")
	Employee replaceItem(@RequestBody Employee newItem, @PathVariable Long id) {
		return employeeRepository.findById(id).map(item -> {
			item.setName(newItem.getName());
			item.setJobTitle(newItem.getJobTitle());

			return employeeRepository.save(item);

		}).orElseGet(() -> {
			newItem.setId(id);
			return employeeRepository.save(newItem);
		});
	}

	/**
	 * Method that deletes an item from the cart
	 *
	 * @param request Request object
	 * @return Status boolean
	 */
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/employees/{id}")
	void deleteItem(@PathVariable Long id) {
		employeeRepository.deleteById(id);
	}

	/**
	 * Method that empties the shopping cart
	 *
	 * @return Status string
	 */
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/employees")
	void emptyCart() {
		log.info("hello");
		employeeRepository.deleteAll();
	}

}
