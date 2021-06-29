package html_content_util.Application

import moduls.File_handler
import moduls.Html_file_util

class Application {
	
	public static void main(String[] args) {
		println "C:/Users/taalaal4/LAB/"+"test.txt"

		Html_file_util test1 = new Html_file_util("C:/Users/taalaal4/LAB/", "bla.txt");
		test1.clear_file();
		test1.file_writer("<html>\n\nblablablablablbalblabla\n\n\n1111111111\n\n</html>")
		test1.remove_tag("<html>", "</html>");
		test1.remove_empty_lines();
	}
}
