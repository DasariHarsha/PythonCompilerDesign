package AST;

public class ImportFrom implements ASTNode {
	ASTNode t1;
	

	public ImportFrom(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ImportFrom( ");
		t1.print();
		System.out.println(")");

	}

}
