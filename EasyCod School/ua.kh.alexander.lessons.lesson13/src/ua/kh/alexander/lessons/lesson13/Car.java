package ua.kh.alexander.lessons.lesson13;

import java.sql.Date;

public class Car {
	private String name;
	private String Manufacturer;
	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAutor() {
		return Manufacturer;
	}

	public void setAutor(String autor) {
		this.Manufacturer = autor;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Car() {
		super();
	}

	public Car(String name, String manufacturer, Date date) {
		super();
		this.name = name;
		this.Manufacturer = manufacturer;
		this.date = date;
	}

	public String toString() {
		return "Car [name=" + name + ", autor=" + Manufacturer + ", date=" + date + "]";
	}
}
