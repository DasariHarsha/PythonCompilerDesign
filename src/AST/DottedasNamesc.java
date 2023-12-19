package AST;

public class DottedasNamesc extends DecoratorAbstractClass implements ASTNode {
	ASTNode t1;
	

	public DottedasNamesc(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("DottedasNamesc(DOT NAME");
		t1.print();
		System.out.println(")");


	}

}
