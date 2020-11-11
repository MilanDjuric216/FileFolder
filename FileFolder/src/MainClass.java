
public class MainClass {

	public static void main(String[] args) {

		Folder root = new Folder("root");
		Folder f1 = new Folder("r1");
		
		
		root.addFolder(f1);
		root.addFolder("Marko");
		
		
		File file1 = new File("Java", 12000, FileType.DOC);
		
		f1.addFile(file1);
		f1.addFile("php", 12000, FileType.DOC);
		
		
		System.out.println(root.contains("f1"));
		System.out.println(root.get("Java"));
		
	}

}
