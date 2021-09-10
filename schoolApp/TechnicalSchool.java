/**
 * Technical School class stores all Module Offerings into an array.
 * Has a method that checks if a student's transcript passes necessary conditions.
 * @author Ben Zhang 15904358
 **/

package schoolApp;

public class TechnicalSchool {
	
	private Module[] offerings;
	
	public TechnicalSchool() {
		this.offerings = semesterOneModuleOfferings();
	}
	public Module[] getSemesterOfferings() {
		return offerings;
	}
/**
 * @param code	input parameter to search for a Module with a corresponding code
 * @param i		loop through the offerings array
 * @param temp	stores the value of i when match found
 * @return		returns the matching module
 * @author 15904358
 */
	public Module lookup(String code)
	{
		int temp = 0;
		for(int i = 0; i < offerings.length;i++) {
		if(offerings[i].getCode().equals(code) == true) {
			temp = i;
			break;
		}
		else if(offerings[i].getCode().equals(code) == false){	
			}
		}
		return offerings[temp];
	}
	private static Module[] semesterOneModuleOfferings() {
		Module[] moduleOfferings = new Module[] {
		new Module(ModuleType.TAUGHT, "Programming", "PROG101", Level.ONE),
		new Module(ModuleType.TAUGHT, "Statistics", "STAT102", Level.ONE),
		new Module(ModuleType.TAUGHT, "Database Design", "DATA222", Level.TWO),
		new Module(ModuleType.TAUGHT, "Object-Oriented Programming", "PROG202", Level.TWO),
		new Module(ModuleType.TAUGHT, "Information Systems", "INSY313", Level.THREE),
		new Module(ModuleType.SELF_STUDY, "Web Services", "WEBS332", Level.THREE),
		new Module(ModuleType.SELF_STUDY, "Technology Applications", "TECH103", Level.ONE),
		new Module(ModuleType.SELF_STUDY, "Theory of Computation", "THEO111", Level.ONE),
		new Module(ModuleType.SELF_STUDY, "Model Checking", "MODC233", Level.TWO),
		new Module(ModuleType.SELF_STUDY, "Topology", "TOPG233", Level.TWO),
		new Module(ModuleType.SELF_STUDY, "Logic", "LOGI321", Level.THREE),
		new Module(ModuleType.PROJECT, "Wep App Dev", "PROJ399", Level.THREE),
		new Module(ModuleType.CLIENT_PROJECT, "Great Code Company", "EXTO396", Level.THREE),
		};
		return moduleOfferings;
	}
/**
 * Returns certified based on if the student's transcript has met all conditions.
 * @param certify_one,two,three		Holds the threshold numbers for certify to verify
 * @param c1,c2,c3 					Keeps track of how many modules at corresponding level have passed
 * @param taught,self_study,project Keeps track of module types that have passed
 * @param student					the student class which holds the transcript to be analysed
 * @return certify 					If conditionals are met then certify will return as true
 * @author 15904358
 */
	public boolean isCertified(Student student) {
		Module [] temp_module = new Module[20]; //allocate memory for 20 classes
		int certify_one = 3, certify_two = 3, certify_three = 4;
		boolean certify = false;
		int c1 = 0,c2 = 0,c3 = 0;
		int taught = 0;
		int self_study = 0;
		int project = 0;
	
		for(int i = 0;i < student.getNResults();i++) {									//for loop to go through student transcript
			temp_module[i] = lookup(student.getTranscript()[i].getModule().toString());//calls look up method to match transcript code to offering code, place inside temp
			for(int j = 0;j < student.getNResults();j++) {								//for loop to compare the individual transcript modules to conditions
					if(temp_module[i].getLevel().compareTo(Level.ONE) == 0 && student.getTranscript()[i].getGrade().isPass() == true) {
						c1++;
						break;
					}
					if(temp_module[i].getType().compareTo(ModuleType.TAUGHT) == 0 && temp_module[i].getLevel().compareTo(Level.TWO) == 0 && student.getTranscript()[i].getGrade().isPass() == true) {
						taught++;
						c2++;
						break;
					}
					if(temp_module[i].getLevel().compareTo(Level.TWO) == 0 && student.getTranscript()[i].getGrade().isPass() == true) {
						c2++;
						break;
					}
					if(temp_module[i].getType().compareTo(ModuleType.SELF_STUDY) == 0 && temp_module[i].getLevel().compareTo(Level.THREE) == 0 && student.getTranscript()[i].getGrade().isPass() == true) {
						self_study++;
						c3++;
						break;
					}
					if(temp_module[i].getType().compareTo(ModuleType.CLIENT_PROJECT) == 0 || temp_module[i].getType().compareTo(ModuleType.PROJECT) == 0 && temp_module[i].getLevel().compareTo(Level.THREE) == 0 && student.getTranscript()[i].getGrade().isPass() == true) {
						project++;
						c3++;
						break;
					}
					if(temp_module[i].getLevel().compareTo(Level.THREE) == 0 && student.getTranscript()[i].getGrade().isPass() == true) {
						c3++;
						break;
					}
				}
			}
		if(c1 >= certify_one && c2 >= certify_two && taught >= 1 && c3 >= certify_three && self_study >= 2 && project >= 1) { //check conditions are met
			certify = true;
		}
		else {
			certify = false;
		}
		return certify;
	}
}
