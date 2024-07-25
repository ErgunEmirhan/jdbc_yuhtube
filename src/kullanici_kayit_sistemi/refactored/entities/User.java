package kullanici_kayit_sistemi.refactored.entities;


import java.time.LocalDate;

/*
1- Kullanıcı kayıt sistemi;
Kullanıcı;
id:
adı;
soyadı;
mail;
telNo;
şifre;
kullanıcıAdı;
tcKimlik;
kayıtTarihi;
doğumTarihi;
18 yasindan kucukler kayıt olamasın.
* */
public class User extends BaseEntity {
	//Sınıf değişkenleri:
	static int idIndex;
	//Nesne değişkenleri:
	private String name;
	private String surName;
	private String mail;
	private String phoneNumber;
	private String password;
	private String userName;
	private String tcNo;
	private LocalDate signUpDate;
	private LocalDate birthDay;
	
	
	//Constructor
	public User(){
		this.id = idIndex++;
		
		this.signUpDate = LocalDate.now();
	}
	
	//Getters
	public int getId() {
		return id;
	}
	public LocalDate getSignUpDate() {
		return signUpDate;
	}
	public String getTC(){
		return tcNo;
	}
	public String getMail() {
		return mail;
	}
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurName() {
		return surName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public LocalDate getBirthDay() {
		return birthDay;
	}
	
	//Setters
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setSurname(String surName) {
		this.surName = surName;
	}
	
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	@Override
	public String toString() {
		return "User{" + "birthDay=" + birthDay + ", userId=" + getId() + ", name='" + name + '\'' + ", surName='" + surName + '\'' + ", mail='" + mail + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", password='" + password + '\'' + ", userName='" + userName + '\'' + ", tcNo='" + tcNo + '\'' + ", signUpDate=" + getSignUpDate() + '}';
	}
}