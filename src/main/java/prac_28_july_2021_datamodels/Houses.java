package prac_28_july_2021_datamodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HOUSES")
public class Houses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "OWNER_NAME")
	private String landlord;
	
	@Column(name = "DATE_ADDED")
	private String date_added;
	
	@Column(name = "PROPERTY_TYPE")
	private String property_type;
	
	@Column(name = "CONTACT")
	private String contact;
	
	@Column(name = "PRICE")
	private Integer price;

	
	// default constructor without parameters --------------------
	public Houses() {
		super();
	}

	// default parameterized constructor ------------------------ 
	public Houses(String title, String landlord, String date_added, String property_type, String contact,
			Integer price) {
		super();
		this.title = title;
		this.landlord = landlord;
		this.date_added = date_added;
		this.property_type = property_type;
		this.contact = contact;
		this.price = price;
	}

	// getters and setters for all attributes -----------------------
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLandlord() {
		return landlord;
	}

	public void setLandlord(String landlord) {
		this.landlord = landlord;
	}

	public String getDate_added() {
		return date_added;
	}

	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

	public String getProperty_type() {
		return property_type;
	}

	public void setProperty_type(String property_type) {
		this.property_type = property_type;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	// toString method -----------------------------------------------
	@Override
	public String toString() {
		return "Houses [id=" + id + ", title=" + title + ", landlord=" + landlord + ", date_added=" + date_added
				+ ", property_type=" + property_type + ", contact=" + contact + ", price=" + price + "]";
	}
	
	// will add more if needed in future
}
