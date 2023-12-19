package AST;

public class TestListCompc implements ASTNode {
	ASTNode t1;
	Integer op;
	

	public TestListCompc(ASTNode t1, Integer op) {
		super();
		this.t1 = t1;
		this.op = op;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("TestListCompc( ");
		t1.print();
		System.out.println(", ");
		switch(op)
		{
		case 1: System.out.println("COMMA");
				break;
		case 2: System.out.println(" ");
				break;
		}
		System.out.println(")");

	}

}
