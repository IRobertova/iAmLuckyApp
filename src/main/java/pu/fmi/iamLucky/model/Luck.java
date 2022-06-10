package pu.fmi.iamLucky.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Luck {
	@Id
	@GeneratedValue
	private Long id;
	
	private String value;
	private String author;
	
	public Luck() {}
	
	public Luck(String value) {
		super();
		this.value = value;
	}
	public Luck(String value, String author) {
		super();
		this.value = value;
		this.author=author;
	}
	
	
	@Override
	public String toString() {
		return "Luck [id=" + id + ", value=" + value + "]";
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
}
