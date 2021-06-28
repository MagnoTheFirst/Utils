package moduls

class File_handler {
	
	
	File source_file;

	public File_handler(String path) {
		// TODO Auto-generated constructor stub
		this.source_file = new File(path);
	}
	
	private ArrayList<String> get_Lines_of_File(File source_file)
	{
		ArrayList<String> lines = new  ArrayList<String>()
		source_file.eachLine
		{
			line -> lines.add(line.trim());
		}
		return lines;
	}
	
	/**
	 * This method replaces the content of a line with a string of your choice
	 * @param input
	 * @param replace = String that replace the original String of the Line in the File
	 * */
	public String replace_line_content(String input, String replace)
	{
		String file_content = this.source_file.getText().toString();
		file_content = file_content.replaceAll(input, replace);
		println(file_content);
		this.source_file.write(file_content);
		
		return file_content;
	}
	
	private String get_specific_line(int index_of_line) {
		int counter = 0;
		String specific_line;
		source_file.eachLine{ line -> counter++;}
		for(int i = 0; i < index_of_line ; i++) {
			if(i == index_of_line) {


			}
		}
		
	}
}

