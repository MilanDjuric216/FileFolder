import java.util.ArrayList;
import java.util.Date;

public class Folder extends FFclass {

	public ArrayList<FFclass> ffList;
	
	public Folder(String name) {
		this.name = name;
		this.ffList = new ArrayList<FFclass>();
		this.date = new Date();
	}
	
	public void addFolder(Folder folder) {
		this.ffList.add(folder);
	}
	
	public void addFolder(String name) {
		Folder folder = new Folder(name);
		this.ffList.add(folder);
	}
	
	public void addFile(File file) {
		this.ffList.add(file);
	}
	public void addFile(String name, int size,FileType type) {
		File file = new File(name, size, type);
		this.ffList.add(file);
		
	}
	public void add(FFclass ff) {
		this.ffList.add(ff);
	}
	public FFclass get(int index) {
		return this.ffList.get(index);
	}
	public FFclass get(String name) {
		
		int index = 0;
		
		index = this.ffList.indexOf(new Folder(name));
		
		if(index < 0) {
			return null;
		}
		
		
		return this.ffList.get(index);
	}
	
	@Override
	public int getSize() {
		int size = 0;
		
		for(FFclass ff : ffList) {
			size = size + ff.getSize();
		}
		return size;
	}
	@Override
	public String toString() {

	//	return name+"("+this.ffList.size()+ " items "+this.getSize()+"kb )";
		return name+"( "+this.ffList.size()+" items )";
	}

	@Override
	public boolean contains(String name) {

		boolean result = false;
		
		for(FFclass ff: this.ffList) {
			
			if(ff.name.equalsIgnoreCase(name)) {
				result = true;
				break;
			}
			else {
				result = ff.contains(name);
			}
				
		
		if(result) {
			break;
		}
	}
		return result;
	}

}
