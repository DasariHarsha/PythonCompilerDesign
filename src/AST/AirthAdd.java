package AST;

public class AirthAdd extends AirthmeticExpression implements ASTNode {

	ASTNode t1;
	
	public AirthAdd(ASTNode t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("AirthAdd(ADD,");
		t1.print();
		System.out.println(")");
		

	}

}
