package exeptions

class UncompatibleFileTypException extends Exception{
	
	public UncompatibleFileTypException() {
		super("The given Filetyp is uncompatible. Please try with one of the following filetyps:"+
				".txt\n.json\n.yml\n.log\n.md\n.prom");
		
	}
}
