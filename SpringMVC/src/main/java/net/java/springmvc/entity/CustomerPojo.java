package net.java.springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class CustomerPojo {
	
	@Entity
	@Table(name = "customer")
	public class Customer {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "email")
	    private int email;

	    @Column(name = "first_name")
	    private String firstName;

	    @Column(name = "last_name")
	    private String lastName;

	    @Column(name = "mobile")
	    private String mobile;

	    public Customer() {

	    }

	    

	    public String getMobile() {
			return mobile;
		}



		public void setMobile(String mobile) {
			this.mobile = mobile;
		}



		public void setEmail(int email) {
			this.email = email;
		}



		public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	   

	    @Override
	    public String toString() {
	        return "Customer [Mobile=" + mobile + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	    }
	}

}
