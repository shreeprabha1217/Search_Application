package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class SearchController {

	
	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String Home() {
		return "home1";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		RedirectView redirectView=new RedirectView();
		String url="https://www.google.com/search?q=" + query;
		redirectView.setUrl(url);
		return redirectView;
	}
	
	@RequestMapping("/form")
	public String form2() {
		return "complex";
	}
	
	@RequestMapping(path="complex",method=RequestMethod.POST)
	public String handleComplex(@ModelAttribute("student") Student student) {
		System.out.println(student);
		return "success";
	}
}