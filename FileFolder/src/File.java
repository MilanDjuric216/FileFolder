
public class File extends FFclass {

	private int size;
	private FileType type;
	
	
	public File(String name, int size, FileType type) {
		this.name = name;
		this.size = size;
		this.type = type;
		this.date = date;
		
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}
	
	@Override
	public String toString() {
		
		return name+ ". "+type.name().toLowerCase()+"("+size+" kb) ";
	}

	@Override
	public boolean contains(String name) {

		return this.name.equalsIgnoreCase(name);
	}
}
