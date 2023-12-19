package AST;

public class ExprList extends ElifExpressionAbstract implements ASTNode {
	ASTNode t1;
	
	public ExprList(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ExprList( DEL ");
		t1.print();
		System.out.println(")");
		

	}

}
