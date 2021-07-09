package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employers")
public class Employer extends User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int employerId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="company_email")
	private String companyEmail;
	
	@Column(name="website_address")
	private String websiteAddress;
	
	@Column(name="phone_number")
	private int phoneNumber;


	
}
