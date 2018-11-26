package po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="T_STUDENT")
public class Student implements Serializable{
	private String stuno;
	private String stuname;
	private String stusex;
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	@Column(name="STUNAME")
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	@Column(name="STUSEX")
	public String getStusex() {
		return stusex;
	}
	public void setStusex(String stusex) {
		this.stusex = stusex;
	}
}
