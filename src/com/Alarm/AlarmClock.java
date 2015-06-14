package com.Alarm;

public class AlarmClock {

	private AlarmListener alarm;
	private int nrings;
	
	public AlarmClock() {
		
	}

	public AlarmClock(AlarmListener alarm) {
		this.alarm = alarm;
		nrings = 10;
	}

	public void onAlarm(AlarmEvent e) {
		if (alarm != null) {
			// Invoke the event handler.
			System.out.println(e.getNrings() + " e");
			//onAlarm(e);
		}
	}

	public void start() {
		for (;;) {
			nrings--;
			if (nrings < 0) {
				break;
			}

			else {
				AlarmEvent e = new AlarmEvent(nrings);
				onAlarm(e);
			}
		}
	}

}
