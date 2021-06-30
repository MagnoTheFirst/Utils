package moduls;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import moduls.File_handler;
class File_handlerTest {

	File_handler f;
	File_handler f1;
	File_handler f2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		FileWriter file = new FileWriter("C:/Users/taalaal4/LAB/test_cases.txt");
		file.write("Test Cases\n<html>\n<head>\n</head>\n<body>\n<h1>test case</h1>\n\n\n<p>lorem ipsum</p>\n</body>\n</html>");
		file.close();
		
		FileWriter file1 = new FileWriter("C:/Users/taalaal4/LAB/test_cases1.txt");
		file1.write("Test Cases\n<html>\n<head>\n</head>\n<body>\n<h1>test case</h1>\n\n\n<p>lorem ipsum</p>\n</body>\n</html>");
		file1.close();
		
		FileWriter file2 = new FileWriter("C:/Users/taalaal4/LAB/test_cases2.txt");
		file2.write("Test Cases\n<html>\n<head>\n</head>\n<body>\n<h1>test case</h1>\n\n\n<p>lorem ipsum</p>\n</body>\n</html>");
		file2.close();
				
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		File file = new File("C:/Users/taalaal4/LAB/test_cases.txt");
		file.delete();
		
		File file1 = new File("C:/Users/taalaal4/LAB/test_cases1.txt");
		file1.delete();
		
		File file2 = new File("C:/Users/taalaal4/LAB/test_cases2.txt");
		file1.delete();
	}

	@BeforeEach
	void setUp() throws Exception {
		f = new File_handler("C:/Users/taalaal4/LAB/", "test_cases.txt");
		f1 = new File_handler("C:/Users/taalaal4/LAB/", "test_cases1.txt");
		f2 = new File_handler("C:/Users/taalaal4/LAB/", "test_cases2.txt");
	}

	@AfterEach
	void tearDown() throws Exception {

	}

	@Test
	@DisplayName("Constructor")
	void testFile_handler() {
		assertEquals("C:/Users/taalaal4/LAB/", f1.getPath());
		assertEquals("test_cases.txt", f1.getFilename());
		assertEquals(true, f1.getSource_file().exists());
	}

	@Test
	@DisplayName("Should return an ArrayList<String> each index equals a line from text_cas.txt")
	void testGet_Lines_of_File() {

		assertEquals("Test Cases",f1.get_Lines_of_File().get(0));
		assertEquals("<html>",f1.get_Lines_of_File().get(1));
		assertEquals("</html>",f1.get_Lines_of_File().get(f1.get_Lines_of_File().size()-1));
	}
	
	@Test
	void testReplace_line_content() {
		assertEquals("Test Cases\n111\n<head>\n</head>\n<body>\n<h1>test case</h1>\n\n\n<p>lorem ipsum</p>\n</body>\n</html>",f1.replace_line_content("<html>", "111"));
		assertEquals("Test Cases\n111\n222\n</head>\n<body>\n<h1>test case</h1>\n\n\n<p>lorem ipsum</p>\n</body>\n</html>",f1.replace_line_content("<head>", "222"));
		assertEquals("Test Cases\n111\n222\n333\n<body>\n<h1>test case</h1>\n\n\n<p>lorem ipsum</p>\n</body>\n</html>",f1.replace_line_content("</head>", "333"));
		
	}

	@Test
	void testGet_specific_line() {
		assertEquals("<html>", f1.get_specific_line(1));
		assertEquals("<head>", f1.get_specific_line(2));
		assertEquals("<h1>test case</h1>", f1.get_specific_line(5));
	}
	@Test
	void testFile_writer() {
		assertEquals("Test Cases\n<html>\n<head>\n</head>\n<body>\n<h1>test case</h1>\n\n\n<p>lorem ipsum</p>\n</body>\n</html>\nK: Hello There!",f2.file_writer("K: Hello There!"));
		assertEquals("Test Cases\n<html>\n<head>\n</head>\n<body>\n<h1>test case</h1>\n\n\n<p>lorem ipsum</p>\n</body>\n</html>\nK: Hello There!\nG: General Kenobiiii",f2.file_writer("G: General Kenobiiii"));
	}


	@Test
	void testOverwrite_file() {
		assertEquals("HelloWorld", );
//	}
//
//	@Test
//	void testClear_file() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testRemove_empty_lines() {
//		fail("Not yet implemented");
//	}
//	
//	@Test
//	void testGetPath() {
//
//	}
//	@Test
//	void testSetPath() {
//
//	}
//	@Test
//	void getFilename() {
//	
//	}
//	@Test
//	void setFilename() {
//
//	}
//	@Test
//	void getSource_file() {
//
//	}
//	@Test
//	void setSource_file() {
//
//	}
//	

}