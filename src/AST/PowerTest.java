package AST;

public class PowerTest implements ASTNode {
	ASTNode t1;


	public PowerTest(ASTNode t1) {
		super();
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("PowerTest(POWER,");
		t1.print();
		System.out.println(")");

	}

}
