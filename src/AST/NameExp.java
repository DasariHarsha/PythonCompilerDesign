package AST;

public class NameExp implements ASTNode {
	String text;
	
	public NameExp(String text) {
		super();
		this.text = text;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new NameExp( "+text+")");

	}

}
