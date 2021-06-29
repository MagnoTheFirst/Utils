package moduls;

import java.io.File;
import java.util.ArrayList;

public class Html_file_util extends File_handler{

	String path;
	String file;
	File source_file;
	
	public Html_file_util(String path, String filename) {
		super(path, filename);
		String pth = path+filename;
		this.path = path;
		this.filename = filename;
		// TODO Auto-generated constructor stub
		this.source_file = new File(pth);
		
	}
	
	public String get_value_by_id(String id) {
		String value; 
		ArrayList<String> lines = get_Lines_of_File();
		
		
		return id;
	}
	
	public void remove_tag(String opening_tag, String closing_tag) {
		
		String file_content = source_file.getText().toString();
		
		file_content = file_content.replaceAll(opening_tag, "");
		file_content = file_content.replaceAll(closing_tag, "");
		
		source_file.write(file_content);
	}

}
