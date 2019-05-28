package Michal.SimpleApplication.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import java.util.Locale;

@Controller
public class RegisterController {
	
	@Autowired
	private UserService userService;

	
	@Autowired
    MessageSource messageSource;
	
	@GET
	@RequestMapping(value = "/register")
	public String registerForm(Model model) {
		User u = new User();
		model.addAttribute("user", u);
		return "register";
	}
	
	@POST
	@RequestMapping(value = "/adduser")
	public String registerAction(User user, BindingResult result, Model model, Locale locale) {
				
		String returnPage = null;

		

				
		if (result.hasErrors()) {
			returnPage = "register";
		} else {
//			String content = "Wymagane potwierdzenie rejestracji. Kliknij w poniższy link aby aktywować konto: " +
//			"http://localhost:8080/activatelink/" + user.getActivationCode();
			userService.saveUser(user);
//			model.addAttribute("message", messageSource.getMessage("user.register.success.email", null, locale));
//			model.addAttribute("user", new User());
//			returnPage = "index";
		}
		
		return returnPage;
	}


}
