package com.togetine.blelocation_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "名前は必須です")
	private String name;
	private String beaconUuid;
	
	// コンストラクタ
	public User() {}
	
	public User(String name, String beaconUuid) {
		this.name = name;
		this.beaconUuid = beaconUuid;
	}
	
	// getter setter
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBeaconUuid() {
		return beaconUuid;
	}
	public void setBeaconUuid(String beaconUuid) {
		this.beaconUuid = beaconUuid;
	}
	
	
}