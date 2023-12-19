package AST;

public class SimpleStmta implements ASTNode {
	
	ASTNode t1,t2;
	Integer op;
	Integer op1;







	public SimpleStmta(ASTNode t1, ASTNode t2, Integer op, Integer op1) {
		super();
		this.t1 = t1;
		this.t2 = t2;
		this.op = op;
		this.op1 = op1;
	}







	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new SimpleStmta( ");
		switch(op1)
		{
		case 1: System.out.println("NEWLINE");
				break;
		case 2: System.out.println(" ,");
				break;
		
		}
		t1.print();
		System.out.println(", ");
		
		t2.print();
		System.out.println(", ");
		switch(op)
		{
		case 1: System.out.println(";, ");
				break;
		case 2: System.out.println(" ");
				break;
		
		}
		System.out.println(")");

	}

}
