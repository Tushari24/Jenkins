package com.siemens.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String language;
	private String[] favoriteLanguages;
	private List<String> countryOptions;

	// no argument constructor
	public Student() {
		countryOptions = new ArrayList<String>();

		countryOptions.add("brazil");
		countryOptions.add("spain");
		countryOptions.add("India");
		countryOptions.add("Italy");
		countryOptions.add("germany");
	}

	// define getter and setter for fields
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String[] getFavoriteLanguages() {
		return favoriteLanguages;
	}

	public void setFavoriteLanguages(String[] favoriteLanguages) {
		this.favoriteLanguages = favoriteLanguages;
	}

	public List<String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(List<String> countryOptions) {
		this.countryOptions = countryOptions;
	}

}
