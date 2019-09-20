package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class LeagueDto {
	
	
	public LeagueDto(String title, String season, int year) {
		super();
		this.title = title;
		this.season = season;
		this.year = year;
	}
	public LeagueDto() {
		super();
		// TODO Auto-generated constructor stub
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
	public void setId(String string) {
		// TODO Auto-generated method stub
		
	}
	




	

}
