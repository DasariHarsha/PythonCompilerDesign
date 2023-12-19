package AST;

public class DottedasNamesb extends DecoratorAbstractClass implements ASTNode {
	ASTNode t1;
	

	public DottedasNamesb(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("DottedasNamesb(NAME");
		t1.print();
		System.out.println(")");

	}

}
