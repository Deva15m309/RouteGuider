package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Emp_details",uniqueConstraints={
		@UniqueConstraint(columnNames="E_mobile_no",name="Emp_mob_unq_cons")
})
public class Employee_details {
	@Column(name="Emp_name",nullable=false)
	private String E_Name;
	@Id
	@Column(name="Emp_Id",nullable=false)
	private String E_id;
	@Column(name="Bus_No",nullable=false)
	private String bus_no;
	@Column(name="Emp_mob_num",nullable=false)
	private String E_mob_no;
	public Employee_details(String e_name, String e_id, String bus_no, String e_mob_no) {
		super();
		E_Name = e_name;
		E_id = e_id;
		this.bus_no = bus_no;
		E_mob_no = e_mob_no;
	}
	public String getE_mob_no() {
		return E_mob_no;
	}
	public void setE_mob_no(String e_mob_no) {
		E_mob_no = e_mob_no;
	}
	public String getE_name() {
		return E_Name;
	}
	public void setE_name(String e_name) {
		E_Name = e_name;
	}
	public String getE_id() {
		return E_id;
	}
	public void setE_id(String e_id) {
		E_id = e_id;
	}
	public String getBus_no() {
		return bus_no;
	}
	public void setBus_no(String bus_no) {
		this.bus_no = bus_no;
	}

}
