package com.togetine.blelocation_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.togetine.blelocation_api.model.User;
import com.togetine.blelocation_api.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		List<User> allUsers = new ArrayList<>();
		userRepository.findAll().forEach(allUsers::add);
		
		return allUsers;
	}
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	
	
//	@Autowired
//	private ItemRepository itemRepository;
//	
////	private List<Item> allItems = new ArrayList<> (Arrays.asList(
////			new Item("10001", "ネックレス", "ジュエリー"),
////			new Item("10002", "パーカー", "ファッション"),
////			new Item("10003", "フェイスクリーム", "ビューティ"),
////			new Item("10004", "サプリメント", "ヘルス"),
////			new Item("10005", "ブルーベリー", "フード")
////			));
//	
//	public List<Item> getAllItems(){
//		List<Item> allItems = new ArrayList<>();
//		itemRepository.findAll().forEach(allItems::add);;
//		return allItems;
//	}
//	
//	public Optional<Item> getItem(Long itemId) {
//		
//		return itemRepository.findById(itemId);
//	}
//	
//	public void addItem(Item item) {
//		itemRepository.save(item);
//	}
//	
//	public void updateItem(Long itemId, Item item) {
//		// 該当の商品がある場合更新
//		if(itemRepository.findById(itemId).get() != null) {
//			itemRepository.save(item);
//		}
//	}
//	
//	public void deleteItem(Long itemId) {
//		itemRepository.deleteById(itemId);
//	}
}
