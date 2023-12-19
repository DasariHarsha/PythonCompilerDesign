package AST;

public class PrintFloat implements ASTNode {
	String text;
	
	public PrintFloat(String text) {
		super();
		this.text = text;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("PrintFloat( "+text+")");

	}

}
