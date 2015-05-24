package com.tla.service.inter;

import java.util.List;

import com.tla.domain.Messages;

public interface MessageServiceInter extends BaseInterface {
	
	public List<Messages> getMessageByTaId(String tid);

}
