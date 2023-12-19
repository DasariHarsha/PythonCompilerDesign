package AST;

public class FuncDefc implements ASTNode {
	ASTNode t1;
	
	public FuncDefc(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("FuncDefc(");
		t1.print();
		System.out.println(")");

	}

}
