package AST;

public class Decoratorclassb extends DecoratorAbstractClass implements ASTNode {
    ASTNode t1;
    
	public Decoratorclassb(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Decoratorclassb(");
		t1.print();
		System.out.println(")");

	}

}
