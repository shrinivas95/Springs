package com.xworkz.spring.entity;

import com.xworkz.spring.constant.HotelVendorType;

public class HotelVendorEntity {
	private String name;
	private String location;
	private int rating;
	private float phoneNo;
	private HotelVendorType hotelvendortype;
	
	public HotelVendorEntity() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}

	public HotelVendorEntity(String name, String location, int rating, float phoneNo, HotelVendorType hotelvendortype) {
		super();
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.phoneNo = phoneNo;
		this.hotelvendortype = hotelvendortype;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public int getRating() {
		return rating;
	}
	public HotelVendorType getHotelvendortype() {
		return hotelvendortype;
	}
	public float getPhoneNo() {
		return phoneNo;
	}

	@Override
	public String toString() {
		return "HotelVendorEntity [name=" + name + ", location=" + location + ", rating=" + rating + ", phoneNo="
				+ phoneNo + ", hotelvendortype=" + hotelvendortype + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hotelvendortype == null) ? 0 : hotelvendortype.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(phoneNo);
		result = prime * result + rating;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelVendorEntity other = (HotelVendorEntity) obj;
		if (hotelvendortype != other.hotelvendortype)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(phoneNo) != Float.floatToIntBits(other.phoneNo))
			return false;
		if (rating != other.rating)
			return false;
		return true;
	}
	
	

}
