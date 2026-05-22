package com.togetine.blelocation_api.controller;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.togetine.blelocation_api.exception.UserNotFoundException;
import com.togetine.blelocation_api.model.User;
import com.togetine.blelocation_api.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/users/{beaconUuid}")
	public User getUser(@PathVariable String beaconUuid) {
		return userService.getUserByBeaconUuid(beaconUuid).orElseThrow(() -> new UserNotFoundException(beaconUuid));
	}
//	@GetMapping("/items/{itemId}")
//	public Item getItem(@PathVariable("itemId") Long itemId) {
//		// 結果がNullの場合自作例外を出すようにする
//		return itemService.getItem(itemId).orElseThrow(() -> new ItemNotFoundException(itemId));
//	}
	
	@PostMapping("/users")
	public void addUser(@Valid @RequestBody User user) {
		userService.addUser(user);
	}

}
