package AST;

public class AirthMinus extends AirthmeticExpression implements ASTNode {
	ASTNode t1;
	

	public AirthMinus(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("AirthMinus(Minus,");
		t1.print();
		System.out.println(")");

	}

}
