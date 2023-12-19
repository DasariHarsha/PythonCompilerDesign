package AST;

public class SubscriptListb implements ASTNode {
	ASTNode t1;
	

	public SubscriptListb(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("SubscriptListb(");
		t1.print();
		System.out.println(")");
	}

}
