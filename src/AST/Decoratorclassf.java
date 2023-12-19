package AST;

public class Decoratorclassf extends DecoratorAbstractClass implements ASTNode {
	ASTNode t1;
	
	public Decoratorclassf(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Decoratorclassf(");
		t1.print();
		System.out.println(")");

	}

}
