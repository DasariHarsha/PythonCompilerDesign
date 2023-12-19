package AST;

public class File implements ASTNode {
	ASTNode t1;
	
	public File(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new File(");
		t1.print();
		System.out.println(")");

	}

}
