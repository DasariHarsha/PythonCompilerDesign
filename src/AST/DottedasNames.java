package AST;

public class DottedasNames extends DecoratorAbstractClass implements ASTNode {
	ASTNode t1;
	

	public DottedasNames(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("DottedasNames( IMPORT ");
		t1.print();
		System.out.println(")");

	}

}
