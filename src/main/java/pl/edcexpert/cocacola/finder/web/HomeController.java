/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package pl.edcexpert.cocacola.finder.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import pl.edcexpert.cocacola.finder.dao.FakturaDao;
import pl.edcexpert.cocacola.finder.dao.PakietDao;
import pl.edcexpert.cocacola.finder.model.Faktura;
import pl.edcexpert.cocacola.finder.model.QueryResponseBody;


@Controller
public final class HomeController {
	
	@Autowired
    private FakturaDao fakturaDao;
	
	@Autowired
	private PakietDao pakietDao;
	
	 @RequestMapping(value="/find", method=RequestMethod.GET)
	 public ModelAndView home(){
		 ModelAndView mav = new ModelAndView("list");
		 
		 List<String> operators = pakietDao.getOperators();
		 mav.addObject("operatorList", operators);
		 mav.addObject("fakturaForm", new Faktura());
		 return mav;
	 }
	 
	 @RequestMapping(value="/find", method=RequestMethod.POST)
	 public ModelAndView findFaktury(@ModelAttribute("fakturaForm") Faktura faktura){		 
		 ModelAndView mav = new ModelAndView("list");
		 List<Faktura> faktury = fakturaDao.getByNrFaktury(faktura.getfNumerFaktury());
		 mav.addObject("SEARCH_PAKIET_RESULTS_KEY", faktury);		 
		 return mav;
	 }
	 
	 @RequestMapping(value="/waether", method=RequestMethod.GET)
	 public ModelAndView hello(){
		 ModelAndView mav = new ModelAndView("hello");
		 RestTemplate restTemplate = new RestTemplate();
		 QueryResponseBody query = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/3", QueryResponseBody.class);
		 System.out.println(query.getTitle());
		 mav.addObject("text", "Hello World!!");
		 return mav;
	 }
	 
	 
}
