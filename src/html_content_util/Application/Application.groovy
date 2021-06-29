package html_content_util.Application

import moduls.File_handler

class Application {
	
	public static void main(String[] args) {
		println "C:/Users/taalaal4/LAB/"+"test.txt"
		File_handler f1 = new File_handler("C:/Users/taalaal4/LAB/", "bla.txt");
		f1.file_writer("test1\ntest2")
		f1.overwrite_file("alejandro")
		f1.clear_file()
	}
}
