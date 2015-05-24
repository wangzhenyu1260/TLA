package com.tla.service.imp;

import java.util.List;

import com.tla.domain.Messages;
import com.tla.service.inter.MessageServiceInter;

public class MessageServiceImp extends BaseServiceImp implements MessageServiceInter{

	@Override
	public List<Messages> getMessageByTaId(String tid) {
		String hql = "from Messages where teachingassistant.id=? order by datetime desc";
		String[] parameters={tid};
		try{
			List<Messages> list = getListObject(hql, parameters);
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
