package springmvcsearch;

public class Student {

	private String email;
	private String  password;
	private String address;
	private String address2;
	private String city;
	private Long zip;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getZip() {
		return zip;
	}
	public void setZip(Long zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Student [email=" + email + ", password=" + password + ", address=" + address + ", address2=" + address2
				+ ", city=" + city + ", zip=" + zip + "]";
	}
}
