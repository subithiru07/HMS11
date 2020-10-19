package com.dxc.hms.dao.service;

import com.dxc.hms.model.Pharmacist;

public interface PharmacistService {
public void AddPharmacist(Pharmacist pharmacist);
public boolean LoginValidate(String user,String password);
}
