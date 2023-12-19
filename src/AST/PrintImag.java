package AST;

public class PrintImag implements ASTNode {
	String text;
	

	public PrintImag(String text) {
		super();
		this.text = text;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("PrintImag( "+text+")");

	}

}
