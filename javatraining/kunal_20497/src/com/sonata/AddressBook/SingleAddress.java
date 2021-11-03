package com.sonata.AddressBook;

public class SingleAddress {
	
	@Override
	public String toString() {
		return "SingleAddress [lastname=" + lastname + ", firstname=" + firstname + ", address=" + address + ", city="
				+ city + ", getLastname()=" + getLastname() + ", getFirstname()=" + getFirstname() + ", getAddress()="
				+ getAddress() + ", getCity()=" + getCity() + ", getCountry()=" + getCountry() + ", getZipcode()="
				+ getZipcode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	private String lastname;
	private String firstname;
    private String address;
    private String city;
    private String country;
    private int zipcode;
    
    public SingleAddress(String lastname, String firstname, String address, String city, String country, int zipcode ){
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
    }
	
	 public SingleAddress() { 	//constructor
	
	}
//Getter Setter Methods
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int i) {

		
	}
	





	
     
	
}
