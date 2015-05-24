package com.tla.service.inter;

import java.util.List;

import com.tla.domain.Teachingassistant;

public interface TaServiceInter extends BaseInterface {
	
	public Teachingassistant getUniqueTaByName(String name);
	
	public List<Teachingassistant> getTas();
	
	public List<String> getTasNameList();
	
	public boolean deleteTa(String id);
	
	public boolean resetTa(String id);
	
	public boolean checkAccount(String account);
	
	public Teachingassistant getUniqueTaById(String id);

}
