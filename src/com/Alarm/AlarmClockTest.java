package com.Alarm;

public class AlarmClockTest implements AlarmListener{

	private AlarmClock clock;
	
	
	public AlarmClockTest() {
		clock = new AlarmClock(this);
		
	}

	@Override
	public void alarmActionPerformed(AlarmEvent args) {
		
	}

	public AlarmClock getClock() {
		return clock;
	}

	public void setClock(AlarmClock clock) {
		this.clock = clock;
	}
	
	

}
