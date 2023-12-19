package AST;

public class Decoratorclassg extends DecoratorAbstractClass implements ASTNode {
	ASTNode t1;
	
	public Decoratorclassg(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Decoratorclassg(");
		t1.print();
		System.out.println(")");

	}

}
