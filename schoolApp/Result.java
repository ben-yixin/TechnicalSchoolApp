/**
 * Result class stores module and grade data used by the student class
 * @author Ben Zhang 15904358
 **/

package schoolApp;

public class Result {
	private Module module;
	private Grade grade;
/**
 * Checks enum name for a PLUS or a MINUS string using name().
 * Replaces PLUS or MINUS with the corresponding symbol.
 * @author 15904358
 */
	public String toString() {	
		String grading = grade.name();
		if(grading.contains("PLUS")) {
		return module + " " + grading.charAt(0) + "+";
		}
		if(grading.contains("MINUS")) {
			return module + " " + grading.charAt(0) + "-";
		}
		return module + " " + grading;
	}
	public Result(Module module, Grade grade) {
		setModule(module);
		setGrade(grade);
	}
	public Module getModule() {
		return module;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
}
