package AST;

public class Dictorsetmaker extends DecoratorAbstractClass implements ASTNode {
	ASTNode t1;
	

	public Dictorsetmaker(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Dictorsetmaker( ");
		t1.print();
		System.out.println(")");

	}

}
