package AST;

public class SimpleSuiteStmt implements ASTNode {
	Integer op,op1;
	ASTNode t1;
	Integer op2,op3;
	

	public SimpleSuiteStmt(Integer op, Integer op1, ASTNode t1, Integer op2, Integer op3) {
		super();
		this.op = op;
		this.op1 = op1;
		this.t1 = t1;
		this.op2 = op2;
		this.op3 = op3;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new SimpleSuiteStmt( ");
		t1.print();
		System.out.println(", ");
		switch(op)
		{
		case 1: System.out.println("NEWLINE, ");
				break;
		case 2: System.out.println(" ");
				break;
		}
		
		switch(op1)
		{
		case 1: System.out.println("INDENT, ");
				break;
		case 2: System.out.println(" ");
				break;
		}
		
		t1.print();
		System.out.println(", ");
		switch(op2)
		{
		case 1: System.out.println("NEWLINE, ");
				break;
		case 2: System.out.println(" ");
				break;
		}
		
		switch(op3)
		{
		case 1: System.out.println("DEDENT ");
				break;
		case 2: System.out.println(" ");
				break;
		}
		
		System.out.println(")");

	}

}
