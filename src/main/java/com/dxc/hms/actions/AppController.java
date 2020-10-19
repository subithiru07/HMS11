package com.dxc.hms.actions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.hms.dao.Pharmacistdao;
import com.dxc.hms.model.Pharmacist;

@Controller
public class AppController implements AppCtrl {
 @RequestMapping(value="/pharmacist/add")
 public ModelAndView addPharmacist(@RequestParam(value="name")String name,@RequestParam(value="phonenumber")String phonenumber,@RequestParam(value="emailid")String emailid,@RequestParam(value="password")String password) {
	Pharmacistdao pd = new Pharmacistdao();
	Pharmacist p = new Pharmacist();
	p.setName(name);
	p.setPhonenumber(phonenumber);
	p.setEmailid(emailid);
	p.setPassword(password);
	pd.AddPharmacist(p);
	
	 return new ModelAndView("","","") ;
 }

@Override
@RequestMapping(value="/pharmacist/login", method=RequestMethod.POST)
public ModelAndView Login(@RequestParam(value="name")String user,@RequestParam(value="password")String password) {
	// TODO Auto-generated method stub
	Pharmacistdao pd=new Pharmacistdao();
	boolean b=pd.LoginValidate(user, password);
	if(b) {
		return new ModelAndView("pharmacisthome","data",user);
	}
	else
	{
	return new ModelAndView("loginagain");
}
}
}
