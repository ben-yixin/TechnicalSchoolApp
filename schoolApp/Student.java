/**
 * Student class stores the result class as an array called transcript.
 * Has a method that inputs individual modules and grades which updates the transcript
 * @author Ben Zhang 15904358
 **/
package schoolApp;

public class Student {
	private String name;
	private int MAX_TRANSCRIPT_LENGTH = 20;
	private int nResults = 0;
	private Result[] transcript = new Result[20];

	public Student(String name) {
		this.setName(name);
	}
	public Student(String name, Result[] transcript) {
		this.setName(name);
		this.setTranscript(transcript);
	}
/**
 * @param nResults Number of results, updated each time method is called
 * @author 15904358
 */
	public void addResultToTranscript(Module module,Grade grade) {	
		//Result result = new Result(module,grade);
		if(nResults < MAX_TRANSCRIPT_LENGTH) {
			transcript[nResults] = new Result(module,grade);
			nResults++;
			setTranscript(transcript);
		}
	}
	public Result[] getTranscript() {	
		return transcript;
	}
	
	public int getNResults() {
		return nResults;
	}
	public String getName() {
		return name;
	}
	public void setTranscript(Result[] transcript) {
		this.transcript = transcript;
	}
	public void setNResults(int nResults) {
		this.nResults = nResults;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return transcript + "";
	}
}
