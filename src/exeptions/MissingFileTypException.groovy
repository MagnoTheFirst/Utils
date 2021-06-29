package exeptions

class MissingFileTypException extends Exception{
	public MissingFileTypException(err) {
		super("The filename has to contain a filetype like your_file.txt");
		
	}
}
