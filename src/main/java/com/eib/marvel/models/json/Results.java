package com.eib.marvel.models.json;

import java.util.List;

public class Results {
	private Long id;
	private String name;
	private String description;
	private String modified;
	private Thumbnail thumbnail;
	private List<Urls> urls;

	public Results() {

	}

	public Long getId() {
		return id;
	}

	public List<Urls> getUrls() {
		return urls;
	}

	public void setUrls(List<Urls> urls) {
		this.urls = urls;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public Thumbnail getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(Thumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}

}
