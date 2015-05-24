package com.tla.service.imp;

import java.util.List;

import com.tla.domain.Teachingassistant;
import com.tla.service.inter.DefaultSettings;
import com.tla.service.inter.TaServiceInter;
import com.tla.util.HibernateUtil;

public class TaServiceImp extends BaseServiceImp implements TaServiceInter{

	@Override
	public Teachingassistant getUniqueTaByName(String name) {
		String hql="from Teachingassistant where name=?";
		String[] parameters={name};
		try {
			Teachingassistant ta=(Teachingassistant) getUniqueObject(hql, parameters);
			return ta;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<Teachingassistant> getTas() {
		String hql = "from Teachingassistant";
		try{
			List<Teachingassistant> list = getListObject(hql, null);
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteTa(String id) {
		String hql = "delete Teachingassistant where id=?";
		String[] parameters={id};
		try {
			HibernateUtil.executeUpdateOpenInView(hql, parameters);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean resetTa(String id) {
		String hql = "update Teachingassistant set password=? where id=?";
		String[] parameters={DefaultSettings.defaultPassword,id};
		try {
			HibernateUtil.executeUpdateOpenInView(hql, parameters);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean checkAccount(String account) {
		boolean flag = false;
		String hql = "from Teachingassistant where account=?";
		String[] parameters={account};
		try {
			Object obj = getUniqueObject(hql, parameters);
			if(obj==null){
				flag = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public Teachingassistant getUniqueTaById(String id) {
		String hql="from Teachingassistant where id=?";
		String[] parameters={id};
		try {
			Teachingassistant ta=(Teachingassistant) getUniqueObject(hql, parameters);
			return ta;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<String> getTasNameList() {
		String hql = "select name from Teachingassistant";
		try{
			List<String> list = getListObject(hql, null);
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
