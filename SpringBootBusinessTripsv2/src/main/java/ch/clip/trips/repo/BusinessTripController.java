package ch.clip.trips.repo;

import ch.clip.trips.ex.TriptNotFoundException;
import ch.clip.trips.repo.BusinessTrip;
import ch.clip.trips.repo.BusinessTripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class BusinessTripController {

	@Autowired
	private BusinessTripRepository tripRepository;

//	ProductController(ProductRepository productRepository) {
//		this.productRepository = productRepository;
//	}



	// Aggregate root
	@CrossOrigin(origins = "*")
	@GetMapping("/trips")
	// @RequestMapping(value = "/trips", method = RequestMethod.GET, produces =
	// "application/json")
	List<BusinessTrip> all() {
		return tripRepository.findAll();
	}

	@PostMapping("/trips")
	// @RequestMapping(value = "/trips", method = RequestMethod.POST, produces =
	// "application/json", consumes = "appication/json")
	BusinessTrip newProduct(@RequestBody BusinessTrip newTrip) {
		return tripRepository.save(newTrip);
	}

	// single Item
	@GetMapping("/trips/{id}")
	BusinessTrip one(@PathVariable Long id) {
		return tripRepository.findById(id)
				.orElseThrow(() -> new TriptNotFoundException(id));
	}

	// with HATEOAS
//	@GetMapping("/products/{id}")
//	Resource<Product> one(@PathVariable Long id) {
//		Product product = productRepository.findById(id)
//				.orElseThrow(() -> new ProductNotFoundException(id));
//		return new Resource<>(product,
//				linkTo(methodOn(ProductController.class).one(id)).withSelfRel(),
//				linkTo(methodOn(ProductController.class).all()).withRel("products"));
//	}


//	@PutMapping("/products/{id}")
//	BusinessTrip replaceProduct(@RequestBody BusinessTrip newProduct, @PathVariable Long id) {
//		return productRepository.findById(id).map(product -> {
//			product.setName(newProduct.getName());
//			product.setPrice(newProduct.getPrice());
//			product.setQuantity(newProduct.getQuantity());
//			return productRepository.save(product);
//
//		}).orElseGet(() -> {
//			newProduct.setId(id);
//			return productRepository.save(newProduct);
//		});
//	}

	@DeleteMapping("/products/{id}")
	void deleteProduct(@PathVariable Long id) {
		tripRepository.deleteById(id);
	}

}
