package com.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Shop;

@Controller
@RequestMapping("/ecomm/myshop")
public class ShopController {
	
	Shop shop;
	
	@RequestMapping(value="{name}", method=RequestMethod.GET)
	@ResponseBody
	public ArrayList<Shop> getShopInJSON(@PathVariable String name) {
		
		ArrayList<Shop> list = new ArrayList<Shop>();
		
		shop = new Shop();
		shop.setName(name);
		shop.setStaffNames(new String[] {"John", "James"});
		shop.setSize(totalProducts());
		
		list.add(shop);
		
		Shop shop2 = new Shop();
		shop2.setName("DEFAULT");
		shop2.setStaffNames(new String[] {"staff1","staff2"});
		shop2.setSize(10);
		
		list.add(shop2);
		
		return list;
	}
	
	private int totalProducts() {
		return shop.getProducts().size();
	}

}
