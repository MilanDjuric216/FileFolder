import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class FFclass {
	
	protected String name;
	protected Date date;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStringDate() {
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
		
		return format.format(date);
	}
	
	public Date  getDate() {
		return date;
	}
	
	public abstract int getSize();
	
	public abstract boolean contains(String name);
	
	@Override
	public boolean equals(Object obj) {

		FFclass tempFF = (FFclass) obj;
		
		return this.name.equalsIgnoreCase(tempFF.name);
	}

}
