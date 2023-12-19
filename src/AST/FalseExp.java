package AST;

public class FalseExp implements ASTNode {
	String text;
	

	public FalseExp(String text) {
		super();
		this.text = text;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new FalseExp( "+text+")");

	}

}
