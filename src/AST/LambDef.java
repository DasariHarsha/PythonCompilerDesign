package AST;

public class LambDef implements ASTNode {
	ASTNode t1;
	

	public LambDef(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("LambDef(");
		t1.print();
		System.out.println(")");

	}

}
