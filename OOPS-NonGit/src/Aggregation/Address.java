package Aggregation;

public class Address {
private String street;
private String city;
private long pincode;

public Address(String street, String city, long pincode) {
	
	this.street = street;
	this.city = city;
	this.pincode = pincode;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public long getPincode() {
	return pincode;
}
public void setPincode(long pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
}


}
