package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateLeagueRequestModel {
	public CreateLeagueRequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreateLeagueRequestModel(String title, String season, int year) {
		super();
		this.title = title;
		this.season = season;
		this.year = year;
	}
	private String title;
	private String season;
	private int year;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

	}