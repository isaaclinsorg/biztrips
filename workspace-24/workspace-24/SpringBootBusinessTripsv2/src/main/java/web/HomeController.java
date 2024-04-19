package web;

import ch.clip.trips.repo.BusinessTripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.annotation.PostConstruct;
import java.io.Serializable;
import java.util.logging.Logger;

@Controller
public class HomeController implements Serializable {
	private static Logger log = Logger.getLogger(HomeController.class.getSimpleName());
	private static final long serialVersionUID = 1L;

	@Autowired
	private BusinessTripRepository businessTripRepository;

	@PostConstruct
	public void init() {
//		customerDao = new CustomerDao();
		log.info("im init CustomerController");

	}

	//@RequestMapping(method = RequestMethod.GET, value = "/")
		@GetMapping("/home")
		public String home(Model model) {
//			ModelAndView modelAndView = new ModelAndView();
//			modelAndView.setViewName("index");

			return "index";
		}


		@GetMapping("/")
		public String getHome(Model model) {
			log.info("im Home");
			model.addAttribute("trips", businessTripRepository.findAll());
			return "simple";
		}




	/**
	 * Method that sets up and serves the initial page of the app
	 *
	 * @param model Object from Spring MVC
	 * @return ModelAndView object
	 */
//	@RequestMapping(method = RequestMethod.GET, value = "/")
//	public ModelAndView index(Model model) {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("index");
//
//		return modelAndView;
//	}




}
