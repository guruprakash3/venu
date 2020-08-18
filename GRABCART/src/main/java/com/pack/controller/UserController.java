package com.pack.controller;

import java.util.List;




import java.util.Random;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.bean.Product;
import com.pack.bean.User;
import com.pack.bean.logIn;
import com.pack.service.UserService;
@Controller
public class UserController {

	@Autowired
	private UserService userService;


	@RequestMapping(value="/addUser",method=RequestMethod.GET)
	public String loadForm(ModelMap map){
		User user=new User();
		map.addAttribute("userForm",user);
		return "userregn";
	}
	@RequestMapping(value="/userLogin",method=RequestMethod.GET)
	public String loadForm1(ModelMap map){
		logIn log = new logIn();
		map.addAttribute("userForm1",log);
		return "login";
	}
	@RequestMapping(value="/saveUser",method=RequestMethod.POST)
	public String saveUser(@Validated @ModelAttribute("userForm")User user,BindingResult result,ModelMap map){
		if(result.hasErrors()){
			return "userregn";
		}
		else
		{
			System.out.println("Inside controller");
			userService.saveUser(user);
			return "registered";
		}
	}

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String saveUser1(@Validated @ModelAttribute("userForm1")logIn log,BindingResult result,ModelMap map){
		String s = "login";
		String msg ="Invalid username and password";
		if(result.hasErrors()){
			return s;
		}
		else
		{
			System.out.println("Inside controller");
			boolean b =userService.fetchUser(log);
			if(b==true)
			{
				map.addAttribute("userList1",log.getUserName());
				s="loginsucess";
				msg=null;
			}
			map.addAttribute("msg1",msg);
			return s;
		}

	}
	@RequestMapping(value="/addProduct",method=RequestMethod.GET)
	public String loadForm2(ModelMap map){
		Product p = new Product();
		map.addAttribute("productaddcommand",p);
		return "productadd";
	}
	
	@RequestMapping(value="/saveproduct",method=RequestMethod.POST)
	public String petDetails(@Validated @ModelAttribute("petaddcommand") Pet pd,BindingResult br,ModelMap mp){
		String s="petadd";
		if(br.hasErrors()){
			return s;
		}
		else{
			System.out.println("inside petDetails");
			userService.savePet(pd);
			/*mp.addAttribute("Details", pd);*/
			return "petForm1";
		}
		
	}
	
	
	@RequestMapping(value="/viewPet")
	public String viewPet1(ModelMap mp1){
		Pet pd1=new Pet();
		List<Pet> list=userService.viewPet();
		mp1.addAttribute("pet", list);
		return "fetchPet";
	
	}
	
   
	 @RequestMapping(value="/sell")
	 public String sell() {
		return "sellpet";
	 }
	 
	 
	 @RequestMapping(value="/buy")
	 public String buy() {
		 return "buypet";
	 }

	
	



}






