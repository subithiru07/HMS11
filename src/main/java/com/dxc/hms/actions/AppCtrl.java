package com.dxc.hms.actions;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface AppCtrl {
   public ModelAndView addPharmacist(@RequestParam(value="name")String name,@RequestParam(value="phonenumber")String phonenumber,@RequestParam(value="emailid")String emailid,@RequestParam(value="password")String password);
   public ModelAndView Login(String user,String password);

}
