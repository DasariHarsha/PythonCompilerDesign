package AST;

public class NoneExp implements ASTNode {
	
	String text;
	

	public NoneExp(String text) {
		super();
		this.text = text;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new NoneExp( "+text+")");

	}

}
