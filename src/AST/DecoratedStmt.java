package AST;

public class DecoratedStmt extends DecoratorAbstractClass implements ASTNode {
	ASTNode t1;
	

	public DecoratedStmt(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("DecoratedStmt(");
		t1.print();
		System.out.println(")");

	}

}
