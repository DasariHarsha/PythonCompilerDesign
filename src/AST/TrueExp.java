package AST;

public class TrueExp implements ASTNode {
	String text;
	

	public TrueExp(String text) {
		super();
		this.text = text;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new TrueExp( "+text+")");

	}

}
