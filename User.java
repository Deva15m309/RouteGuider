package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="User_details",uniqueConstraints={
		@UniqueConstraint(columnNames="Email",name="email_unq_cons"),
		@UniqueConstraint(columnNames="Mobile_no",name="mob_unq_cons")
})
public class User {
	@Column(name="UserName",nullable=false)
	private String username;
	@Id
	@Column(name="UserId",nullable=false)
	private int userid;
	@Column(name="Password",nullable=false)
	private String password;
	@Column(name="Status",nullable=false)
	private static final int status=0;
	@Column(name="Email",nullable=false)
	private String email;
	@Column(name="Mobile_no",nullable=false)
	private String mob_no;
	public String getEmail() {
		return email;
	}
	public User(String username, int userid, String password, String email, String mob_no) {
		super();
		this.username = username;
		this.userid = userid;
		this.password = password;
		this.email = email;
		this.mob_no = mob_no;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMob_no() {
		return mob_no;
	}
	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static int getStatus() {
		return status;
	}
	
}
