/**
 * Module class stores module data used in technical school class semester offerings
 * @author Ben Zhang 15904358
 **/

package schoolApp;

public class Module {
	private String title;
	private String code;
	private Level level;
	private ModuleType type;

	public String toString() {
		return  //"Type: "+type+
				//" Title: "+title+
				code;
				//" Level: "+level;
	}
	public Module(ModuleType type, String title, String code, Level level) {
		setType(type);
		setTitle(title);
		setCode(code);
		setLevel(level);
	}
	public ModuleType getType() {
		return type;
	}
	public void setType(ModuleType type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
}