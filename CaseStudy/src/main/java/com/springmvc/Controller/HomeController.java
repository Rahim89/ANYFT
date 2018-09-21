package com.springmvc.Controller;



import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.Beans.PictureBySite;
import com.springmvc.Beans.Sites;
import com.springmvc.Beans.Tour;
import com.springmvc.Beans.TourPackage;
import com.springmvc.Beans.Users;
import com.springmvc.DAO.PictureBySiteDAO;
import com.springmvc.DAO.SitesDAO;
import com.springmvc.DAO.TourPackageDAO;
import com.springmvc.DAO.UsersDAO;
import com.springmvc.DAOImpl.PictureBySiteDAOImpl;
import com.springmvc.DAOImpl.SitesDAOImpl;
import com.springmvc.DAOImpl.TourPackageDAOImpl;
import com.springmvc.DAOImpl.UsersDAOImpl;
import com.springmvc.Encryption.HashingPassword;

@Controller
public class HomeController {
	
	/**
	 * show the home page
	 * @return
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView displayHomePage() {

		SitesDAO siteDAO = new SitesDAOImpl();
		List<Sites> list = siteDAO.getAllSites();
		
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("site", list);
		
		return mav;
	}
	
	@RequestMapping("/home")
	public ModelAndView showHome() {
		
		SitesDAO siteDAO = new SitesDAOImpl();
		List<Sites> list = siteDAO.getAllSites();
		
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("site", list);
		return mav;
	}
	
	
	@RequestMapping(value="/homeDetails", method=RequestMethod.GET)
	public ModelAndView displayHomeDetailsPage() {

		PictureBySiteDAO picture = new PictureBySiteDAOImpl();
		List<PictureBySite> list = picture.getAllBySite();
		ModelAndView mav = new ModelAndView("homeDetails");
		mav.addObject("picture", list);
		
		return mav;
	}
	
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	/**
	 * show the login form to allow the user to log in
	 * @return
	 */
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView displayForm() {
		
	    ModelAndView mav = new ModelAndView("login");
		return mav;
		
	}
	
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * verification of the login credentials
	 * @param log
	 * @return the home page if the login is successful or return the error page if the credentials does not match
	 */
	@RequestMapping(value="/userverification", method=RequestMethod.POST)
	public ModelAndView validateLogin(@ModelAttribute("login") Users user) {
		
	UsersDAO userDAO = new UsersDAOImpl();
	
	Users dbuser = new Users();
	
	dbuser = userDAO.getUsersByUsername(user.getUserName());

	if(dbuser.getPassword()!=null) {
        String[] mutableHash = new String[1];

        Function<String, Boolean> update = hash -> { mutableHash[0] = hash; return true; };
		
		if(HashingPassword.verifyAndUpdateHash(user.getPassword(), dbuser.getPassword(), update)) {
			
		      ModelAndView mav = new ModelAndView("home");
		
		      return mav;
		}
		
	}
	ModelAndView mav = new ModelAndView("errorPage");
	
	return mav;
		
	}
	
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * show the registration page to allow the user to register
	 * @return
	 */
	@RequestMapping("/register")
	public ModelAndView showRegistration() {
		ModelAndView mav= new ModelAndView("register");
		mav.addObject("userkey", new Users());
		
		return mav;
		
		 
	}
	
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	/**
	 * 
	 * @param user
	 * @param confirmPassword is to verify if the passwords match
	 * @param errors
	 * @param model
	 * @return
	 */
	
	
	@RequestMapping(value="/User_info", method=RequestMethod.POST)
	public ModelAndView submitRegistration( @ModelAttribute("userkey") Users user ) {
		
		
		UsersDAO userDAO = new UsersDAOImpl();
		
		
		if(userDAO.getUsersByUsername(user.getUserName()) ==null) {
			
			userDAO.addUser(user);
			return new ModelAndView("login");
			
		}
		else {
			
			
			ModelAndView mav = new ModelAndView("register");
			mav.addObject("UserNameMsg", "Username already exists!");
			return mav;
			
			
		}
			
	
		
	}
	
	
	

	
	

//-------------------------------------------------------------------------------------------------------	
	/**
	 * Display the tour package 
	 * @return
	 */
	@RequestMapping("/tourpackage")
	public ModelAndView displayTours() {
		ModelAndView mav = new ModelAndView("tourpackage");
		TourPackageDAO packageDAO = new TourPackageDAOImpl();
		List<TourPackage> packagelist = packageDAO.getAllTourPackage();
		mav.addObject("packageLsit", packagelist);
		
		return mav;
	}
	
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * Display the booking page for the user to book
	 * @return
	 */
	@RequestMapping("/booking")
	public ModelAndView displayBooking() {
		ModelAndView mav = new ModelAndView("booking");
		
		return mav;
	}
	/**
	 * to display the list of the tour packages
	 * @return the list of the packages
	 */
	@RequestMapping(value = { "/tourpackage" }, method = RequestMethod.GET)
	public ModelAndView listTourPackage() {

		TourPackageDAO tourpackageDAO = new TourPackageDAOImpl();
		List<TourPackage> listTourPackages = tourpackageDAO.getAllTourPackage();
	    ModelAndView map = new ModelAndView("tourpackage");
	    map.addObject("packages", listTourPackages);

	    return map;
	}
	
	
//	@RequestMapping(value="/userverification", method=RequestMethod.POST)
//	public ModelAndView validateBookin(@ModelAttribute("login") Tour tour) {
//		 
//	}
}
	


