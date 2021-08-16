package com.app.item.models.service;

import java.util.List;

import com.app.item.models.Item;

public interface ItemService {
	
	public List<Item> findAll();
	public Item findById(long id, Integer cantidad);

}
