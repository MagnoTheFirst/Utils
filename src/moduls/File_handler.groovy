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
	
	
	public String replace_line_content(String input, String replace)
	{
		String file_content = this.source_file.getText().toString();
		file_content = file_content.replaceAll(input, replace);
		println(file_content);
		this.source_file.write(file_content);
		
		return file_content;
	}
	
	
}
