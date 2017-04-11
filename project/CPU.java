package project;

public class CPU {
	private int accum;
	private int pCounter;
	private int memBase;
	
	public int getAccum() {
		return accum;
	}
	
	public int getPCounter() {
		return pCounter;
	}
	
	public int getMemBase() {
		return memBase;
	}
	
	public void setAccum(int a) {
		accum = a;
	}
	
	public void setPCounter(int pc) {
		pCounter = pc;
	}
	
	public void setMemBase(int mb) {
		memBase = mb;
	}
	
	public void incPC() {
		pCounter++;
	}
}
