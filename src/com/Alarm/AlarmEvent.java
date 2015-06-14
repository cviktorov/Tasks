package com.Alarm;

public class AlarmEvent {

	public int nrings;

	public AlarmEvent() {
		nrings = 0;
	}

	public AlarmEvent(int nrings) {
		this.nrings = nrings;
	}

	public int getNrings() {
		return nrings;
	}

	public void setNrings(int nrings) {
		this.nrings = nrings;
	}

}
