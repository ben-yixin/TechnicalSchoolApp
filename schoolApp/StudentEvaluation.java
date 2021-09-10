/**
 * Runs the main method and prints student transcripts.
 * Allows input for student transcripts.
 * @author Ben Zhang 15904358
 */
package schoolApp;

public class StudentEvaluation {
	static TechnicalSchool technicalSchool = new TechnicalSchool();
/**
 *  Calls printTranscript which prints each individual's transcripts
 *  @author 15904358
 */
	public static void main(String[]args) {	
		printTranscript(robin());
		printTranscript(kate());
		printTranscript(axel());
		printTranscript(jim());
		printTranscript(karen());
		printTranscript(josh());
		printTranscript(chris());
	}
/**
 * Allows for ease of printing all necessary information on student transcript
 * @param student	Takes student object as a parameter to get information
 * @author 15904358
 */
	static void printTranscript(Student student) {
		System.out.println("Transcript for "+student.getName());
		for(int i = 0;i < student.getNResults();i++) {
		System.out.println(student.getTranscript()[i]);
		}
		System.out.println(technicalSchool.isCertified(student));
		System.out.println("========="); //spacing
	}	
	public static Student robin() {	
		Student robin = new Student("Robin");
		robin.addResultToTranscript(technicalSchool.getSemesterOfferings()[0], Grade.C);
		robin.addResultToTranscript(technicalSchool.getSemesterOfferings()[2], Grade.C);
		robin.addResultToTranscript(technicalSchool.getSemesterOfferings()[4], Grade.CPLUS);
		robin.addResultToTranscript(technicalSchool.getSemesterOfferings()[5], Grade.CPLUS);
		robin.addResultToTranscript(technicalSchool.getSemesterOfferings()[6], Grade.CPLUS);
		robin.addResultToTranscript(technicalSchool.getSemesterOfferings()[8], Grade.CMINUS);
		robin.addResultToTranscript(technicalSchool.getSemesterOfferings()[9], Grade.CMINUS);
		robin.addResultToTranscript(technicalSchool.getSemesterOfferings()[11], Grade.APLUS);
		return robin;	
	}	
	public static Student kate() {	
		Student kate = new Student("Kate");
		kate.addResultToTranscript(technicalSchool.getSemesterOfferings()[0], Grade.APLUS);
		kate.addResultToTranscript(technicalSchool.getSemesterOfferings()[1], Grade.AMINUS);
		kate.addResultToTranscript(technicalSchool.getSemesterOfferings()[6], Grade.BPLUS);
		kate.addResultToTranscript(technicalSchool.getSemesterOfferings()[8], Grade.A);
		kate.addResultToTranscript(technicalSchool.getSemesterOfferings()[9], Grade.C);
		kate.addResultToTranscript(technicalSchool.getSemesterOfferings()[2], Grade.A);
		kate.addResultToTranscript(technicalSchool.getSemesterOfferings()[4], Grade.BPLUS);
		kate.addResultToTranscript(technicalSchool.getSemesterOfferings()[5], Grade.AMINUS);
		kate.addResultToTranscript(technicalSchool.getSemesterOfferings()[11], Grade.B);
		kate.addResultToTranscript(technicalSchool.getSemesterOfferings()[12], Grade.B);
		return kate;	
	}	
	public static Student axel() {	
		Student axel = new Student("Axel");
		axel.addResultToTranscript(technicalSchool.getSemesterOfferings()[0], Grade.BPLUS);
		axel.addResultToTranscript(technicalSchool.getSemesterOfferings()[1], Grade.C);
		axel.addResultToTranscript(technicalSchool.getSemesterOfferings()[2], Grade.A);
		axel.addResultToTranscript(technicalSchool.getSemesterOfferings()[3], Grade.C);
		axel.addResultToTranscript(technicalSchool.getSemesterOfferings()[4], Grade.AMINUS);
		axel.addResultToTranscript(technicalSchool.getSemesterOfferings()[5], Grade.A);
		axel.addResultToTranscript(technicalSchool.getSemesterOfferings()[6], Grade.D);
		axel.addResultToTranscript(technicalSchool.getSemesterOfferings()[8], Grade.B);
		axel.addResultToTranscript(technicalSchool.getSemesterOfferings()[9], Grade.B);
		axel.addResultToTranscript(technicalSchool.getSemesterOfferings()[11], Grade.CMINUS);
		axel.addResultToTranscript(technicalSchool.getSemesterOfferings()[12], Grade.C);
		return axel;	
	}
	public static Student jim() {
		Student jim = new Student("Jim");
		jim.addResultToTranscript(technicalSchool.getSemesterOfferings()[0], Grade.A);
		jim.addResultToTranscript(technicalSchool.getSemesterOfferings()[1], Grade.BPLUS);
		jim.addResultToTranscript(technicalSchool.getSemesterOfferings()[2], Grade.CPLUS);
		jim.addResultToTranscript(technicalSchool.getSemesterOfferings()[3], Grade.C);
		jim.addResultToTranscript(technicalSchool.getSemesterOfferings()[4], Grade.C);
		jim.addResultToTranscript(technicalSchool.getSemesterOfferings()[5], Grade.CPLUS);
		jim.addResultToTranscript(technicalSchool.getSemesterOfferings()[6], Grade.CMINUS);
		jim.addResultToTranscript(technicalSchool.getSemesterOfferings()[7], Grade.D);
		jim.addResultToTranscript(technicalSchool.getSemesterOfferings()[8], Grade.APLUS);
		jim.addResultToTranscript(technicalSchool.getSemesterOfferings()[9], Grade.A);
		jim.addResultToTranscript(technicalSchool.getSemesterOfferings()[10], Grade.B);
		jim.addResultToTranscript(technicalSchool.getSemesterOfferings()[11], Grade.BMINUS);
		jim.addResultToTranscript(technicalSchool.getSemesterOfferings()[12], Grade.APLUS);
		return jim;
	}
	public static Student karen() {
		Student karen = new Student("Karen");
		karen.addResultToTranscript(technicalSchool.getSemesterOfferings()[0], Grade.A);
		karen.addResultToTranscript(technicalSchool.getSemesterOfferings()[1], Grade.A);
		karen.addResultToTranscript(technicalSchool.getSemesterOfferings()[2], Grade.B);
		karen.addResultToTranscript(technicalSchool.getSemesterOfferings()[3], Grade.A);
		karen.addResultToTranscript(technicalSchool.getSemesterOfferings()[4], Grade.C);
		karen.addResultToTranscript(technicalSchool.getSemesterOfferings()[5], Grade.BPLUS);
		karen.addResultToTranscript(technicalSchool.getSemesterOfferings()[6], Grade.B);
		karen.addResultToTranscript(technicalSchool.getSemesterOfferings()[7], Grade.A);
		karen.addResultToTranscript(technicalSchool.getSemesterOfferings()[8], Grade.APLUS);
		karen.addResultToTranscript(technicalSchool.getSemesterOfferings()[9], Grade.A);
		karen.addResultToTranscript(technicalSchool.getSemesterOfferings()[10], Grade.B);
		karen.addResultToTranscript(technicalSchool.getSemesterOfferings()[11], Grade.BMINUS);
		karen.addResultToTranscript(technicalSchool.getSemesterOfferings()[12], Grade.APLUS);
		return karen;
	}
	public static Student josh() {	
		Student josh = new Student("Josh");
		josh.addResultToTranscript(technicalSchool.getSemesterOfferings()[0], Grade.A);
		josh.addResultToTranscript(technicalSchool.getSemesterOfferings()[1], Grade.C);
		josh.addResultToTranscript(technicalSchool.getSemesterOfferings()[2], Grade.CPLUS);
		josh.addResultToTranscript(technicalSchool.getSemesterOfferings()[3], Grade.C);
		josh.addResultToTranscript(technicalSchool.getSemesterOfferings()[4], Grade.B);
		josh.addResultToTranscript(technicalSchool.getSemesterOfferings()[5], Grade.CMINUS);
		josh.addResultToTranscript(technicalSchool.getSemesterOfferings()[6], Grade.BPLUS);
		josh.addResultToTranscript(technicalSchool.getSemesterOfferings()[8], Grade.BMINUS);
		josh.addResultToTranscript(technicalSchool.getSemesterOfferings()[9], Grade.B);
		josh.addResultToTranscript(technicalSchool.getSemesterOfferings()[10], Grade.C);
		josh.addResultToTranscript(technicalSchool.getSemesterOfferings()[11], Grade.CMINUS);
		josh.addResultToTranscript(technicalSchool.getSemesterOfferings()[12], Grade.AMINUS);
		return josh;	
	}
	public static Student chris() {	
		Student chris = new Student("Chris");
		chris.addResultToTranscript(technicalSchool.getSemesterOfferings()[0], Grade.B);
		chris.addResultToTranscript(technicalSchool.getSemesterOfferings()[2], Grade.A);
		chris.addResultToTranscript(technicalSchool.getSemesterOfferings()[1], Grade.CMINUS);
		chris.addResultToTranscript(technicalSchool.getSemesterOfferings()[5], Grade.CPLUS);
		chris.addResultToTranscript(technicalSchool.getSemesterOfferings()[6], Grade.CPLUS);
		chris.addResultToTranscript(technicalSchool.getSemesterOfferings()[8], Grade.A);
		chris.addResultToTranscript(technicalSchool.getSemesterOfferings()[9], Grade.B);
		chris.addResultToTranscript(technicalSchool.getSemesterOfferings()[11], Grade.APLUS);
		return chris;	
	}	
}
