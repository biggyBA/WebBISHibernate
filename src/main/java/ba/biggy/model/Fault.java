package ba.biggy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name = "serviceaddnewfaults")
public class Fault {
	
	@Id
	@Column (name = "ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "datefault")
	private String date;
	
	@Column (name = "timefault")
	private String time;
	
	@Column (name = "ProductType")
	private String productType;
	
	@Column (name = "serialnumber")
	private String serialNumber;
	
	@Column (name = "ident")
	private String ident;
	
	@Column (name = "Buyer")
	private String client;
	
	@Column (name = "address")
	private String street;
	
	@Column (name = "Placefault")
	private String place;
	
	@Column (name = "PhoneNumber")
	private String phoneOne;
	
	@Column (name = "Phonenumber1")
	private String phoneTwo;
	
	@Column (name = "DescFaults")
	private String faultDescription;
	
	@Column (name = "NotesInfo")
	private String note;
	
	@Column (name = "Responsibleforfailure")
	private String serviceman;
	
	@Column (name = "OrderIssued")
	private String orderBy;
	
	@Column (name = "TypeOfService")
	private String typeOfService;
	
	@Column (name = "Status")
	private String status;
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getIdent() {
		return ident;
	}
	public void setIdent(String ident) {
		this.ident = ident;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPhoneOne() {
		return phoneOne;
	}
	public void setPhoneOne(String phoneOne) {
		this.phoneOne = phoneOne;
	}
	public String getPhoneTwo() {
		return phoneTwo;
	}
	public void setPhoneTwo(String phoneTwo) {
		this.phoneTwo = phoneTwo;
	}
	public String getFaultDescription() {
		return faultDescription;
	}
	public void setFaultDescription(String faultDescription) {
		this.faultDescription = faultDescription;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getServiceman() {
		return serviceman;
	}
	public void setServiceman(String serviceman) {
		this.serviceman = serviceman;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getTypeOfService() {
		return typeOfService;
	}
	public void setTypeOfService(String typeOfService) {
		this.typeOfService = typeOfService;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
