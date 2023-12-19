package AST;

public class Decoratorclassd extends DecoratorAbstractClass implements ASTNode {
	ASTNode t1;
	
	public Decoratorclassd(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Decoratorclassd(");
		t1.print();
		System.out.println(")");

	}

}
