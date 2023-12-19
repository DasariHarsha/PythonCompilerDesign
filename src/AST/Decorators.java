package AST;

public class Decorators extends DecoratorAbstractClass implements ASTNode {
	ASTNode t1;
	
	public Decorators(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Decorators(");
		t1.print();
		System.out.println(")");

	}

}
