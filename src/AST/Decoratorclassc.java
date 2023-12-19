package AST;

public class Decoratorclassc extends DecoratorAbstractClass implements ASTNode {
	ASTNode t1,t2;
	
	public Decoratorclassc(ASTNode t1, ASTNode t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}

	@Override
	public void print() {
		System.out.println("new Decoratorclassc(");
		t1.print();
		System.out.println(",");
		t2.print();
		System.out.println(")");
		

	}

}
