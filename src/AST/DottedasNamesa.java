package AST;

public class DottedasNamesa extends DecoratorAbstractClass implements ASTNode {
	ASTNode t1;
	
	public DottedasNamesa(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("DottedasNamesa(");
		t1.print();
		System.out.println(")");

	}

}
