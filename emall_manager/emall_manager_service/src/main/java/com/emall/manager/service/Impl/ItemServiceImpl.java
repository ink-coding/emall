package com.emall.manager.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emall.manager.dao.TbItemMapper;
import com.emall.manager.pojo.TbItem;
import com.emall.manager.service.ItemService;
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem findItemById(Long id) {
		return itemMapper.selectByPrimaryKey(id);
	}

}
