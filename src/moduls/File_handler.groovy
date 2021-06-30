package moduls

import exeptions.MissingFileTypException
import exeptions.UncompatibleFileTypException

class File_handler {
	
	String path;
	String filename;
	File source_file;

	
	/**
	 * This class can handle a existing file or it creates a new one.
	 * This class can neither handle .pdf .exe and .jar nor bin
	 * @param path Path to the directory where the file should be created
	 * @param filename Filename should contain the file type .md, .json, .txt, .log ....
	 * 
	 * 
	 * */
	public File_handler(String path, String filename)
	{
	
				this.filename = filename;
				this.path = path;
				this.source_file = new File(path + filename);
				
				if(this.source_file.exists()) {
					println "file exists"

				}
				else {
					println "file does  not exists"
					this.source_file.write("");
					println source_file.exists()
				}
	}
	
	/**
	 * This method takes a File and splits it lines into an ArrayList. 
	 * Each Line is one index at the ArrayList. Each Line will be trimmed
	 * @param source_file File wich should be 
	 * 
	 * */
	protected ArrayList<String> get_Lines_of_File()
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
	
	public String get_specific_line(int index_of_line) throws IndexOutOfBoundsException {
		try {
			ArrayList<String> lines = get_Lines_of_File();
			return lines.get(index_of_line);
		} catch (Exception e) {
			println "The given line does not exists in the File of " + this.getClass();
			e.printStackTrace()
			
		}
	}
	
	
	/**
	 * 
	 * This method appends a String to the given destination file. 
	 * If the File doesnt exists it creates a file at the given destination
	 * 
	 * @param destination_file The file where your String should be added
	 * @param input The String you want to add to the file. It will be appended at the last line of File
	 * 
	 * */
	public String file_writer(String input) 
	{
			source_file.append("\n" + input)
			return source_file.getText();
	}
	
	
	public String overwrite_file(String input) 
	{
		source_file.write(input);
		return source_file.getText();
	}
	
	/**
	 * This methods removes all content of a given File.
	 * @param destination_file 
	 * */
	public String clear_file()
	{
		source_file.write("");
		return source_file.getText();
		
	}
	
	
	/**
	 * If the file contains empty lines,  this method will remove them. 
	 * */
	public String remove_empty_lines() {
		ArrayList<String> file_content = get_Lines_of_File();
		println file_content.size();
		source_file.write("");
		for(int i =0; i < file_content.size; i++) {

			String buffer = file_content.get(i);
			if(!buffer.isEmpty()) 
			{
				source_file.append(buffer + "\n");
			}
		}
		return source_file.getText();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public File getSource_file() {
		return source_file;
	}
	
	public String get_file_content() {
		return this.source_file.getText();
	}

	public void setSource_file(File source_file) {
		this.source_file = source_file;
	}
	
	
	
}

