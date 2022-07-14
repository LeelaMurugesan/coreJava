package com.chainsys.classandmethods;

public class Hospital  {
			private final int patientId;
			private String name;
			private  String city;
			private int rate;
			private int days;
			//construct
		    public Hospital(int id) {
		    	this.patientId=id;

		}
			public int getpatientId() {
				return patientId;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getName() {
				return name;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public String getcity() {
				return city;
			}
			public void setRate(int rate) {
				this.rate = rate;
			}
			public int getRate() {
				return rate;
			}
			public void setdays(int days) {
				this.days = days;
			}
			public int getdays() {
				return days;
			}
}

