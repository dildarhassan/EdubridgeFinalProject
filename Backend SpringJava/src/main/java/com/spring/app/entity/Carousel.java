package com.spring.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CarouselItem")
public class Carousel {
		
	@Override
	public String toString() {
		return "Carousel [id=" + id + ", imageurl=" + imageurl + ", title=" + title + ", description=" + description
				+ "]";
	}
	public Carousel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Carousel(int id, String imageurl, String title, String description) {
		super();
		this.id = id;
		this.imageurl = imageurl;
		this.title = title;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String imageurl,title,description;
}
