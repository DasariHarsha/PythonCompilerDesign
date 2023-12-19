package AST;

public class Decoratorclassa extends DecoratorAbstractClass implements ASTNode {
	ASTNode t1;
	
	public Decoratorclassa(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Decoratorclassa(");
		t1.print();
		System.out.println(")");

	}

}
