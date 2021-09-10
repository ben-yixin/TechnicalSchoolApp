/**
 * Grade class carries boundaries for each mark and determines pass or fail
 * @author Ben Zhang 15904358
 **/

package schoolApp;

public enum Grade {
	APLUS(100,90,true),A(90,85,true),AMINUS(85,80,true),BPLUS(80,75,true),B(75,70,true),BMINUS(70,65,true),CPLUS(65,60,true),C(60,55,true),CMINUS(55,50,true),D(49,0,false);
	
	private int high;
	private int low;
	private boolean pass;
	
	private Grade(int high,int low,boolean pass) {
	this.high = high;
	this.low = low;
	this.pass = pass;
	}
	public String toString() {
		return "Pass: "+pass;
	}
/**
* If the high value is less than 50, the grade is a fail
*/
	public boolean isPass() {
		if(high < 50)
		{
			this.pass = false;
		} else {
			this.pass = true;
		}
		return this.pass;
	}
	
	public int getHigh() {
		return this.high;
	}
	public int getLow() {
		return this.low;
	}
}