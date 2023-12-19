package AST;

public class ClassdefStmt extends DefinitionAbstractClases implements ASTNode {
	ASTNode t1;
	

	public ClassdefStmt(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ClassdefStmt(");
		t1.print();
		System.out.println(")");

	}

}
