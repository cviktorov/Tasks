package com.Mutithreading.Synchronized;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedBuffer implements Buffer{
	
	private Lock locker = new ReentrantLock();
	
	private Condition canWrite = locker.newCondition();
	private Condition canRead = locker.newCondition();
	
	private int buffer = -1;
	
	private boolean occupied = false;
	
	public void set(int value){
		locker.lock();
		
		try {
			while(occupied){
				System.out.println("trying writing ");
				canWrite.await();
			}
			buffer = value;
			
			occupied = true;
			
			System.out.println("now writing");
			canRead.signal();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally{
			locker.unlock();
		}
	}
	
	public int get(){
		int readvalue = 0;
		locker.lock();
		
		try {
			while(!occupied){
				System.out.println("trying reading");
				canRead.await();
			}
			readvalue = buffer;
			occupied = false;
			
			System.out.println("now reading " + readvalue);
			canWrite.signal();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally{
			locker.unlock();
		}
		return readvalue;
	}
}
