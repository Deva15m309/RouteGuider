package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Bus_Details",uniqueConstraints={
		@UniqueConstraint(columnNames="Bus_No",name="Bno_unq_cons"),
		@UniqueConstraint(columnNames="Bus_Id",name="Bid_unq_cons")		
})
public class Busdetails {
	@Column(name="Bus_No",nullable=false)
	private String bus_no;
	@Column(name="Bus_Id",nullable=false)
	private String bus_id;
	@Column(name="From",nullable=false)
	private String from;
	@Column(name="To",nullable=false)
	private String to;
	@Column(name="Start_Timings",nullable=false)
	private String s_timing;
	@Column(name="Ending_Timings",nullable=false)
	private String e_timing;
	
	public Busdetails(String bus_no, String bus_id, String from, String to, String s_timing, String e_timing) {
		super();
		this.bus_no = bus_no;
		this.bus_id = bus_id;
		this.from = from;
		this.to = to;
		this.s_timing = s_timing;
		this.e_timing = e_timing;
	}
	public String getBus_no() {
		return bus_no;
	}
	public void setBus_no(String bus_no) {
		this.bus_no = bus_no;
	}
	public String getBus_id() {
		return bus_id;
	}
	public void setBus_id(String bus_id) {
		this.bus_id = bus_id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getS_timing() {
		return s_timing;
	}
	public void setS_timing(String s_timing) {
		this.s_timing = s_timing;
	}
	public String getE_timing() {
		return e_timing;
	}
	public void setE_timing(String e_timing) {
		this.e_timing = e_timing;
	}


}
	