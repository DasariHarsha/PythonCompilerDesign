package AST;

public class SimpleStmtb implements ASTNode {
	Integer op;
	ASTNode t1,t2;
	

	public SimpleStmtb(Integer op, ASTNode t1, ASTNode t2) {
		super();
		this.op = op;
		this.t1 = t1;
		this.t2 = t2;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new SimpleStmtb( ");
		switch(op)
		{
		case 1: System.out.println(";, ");
				break;
				
		case 2: System.out.println(" ");
		break;
		
		}
		t1.print();
		System.out.println(", ");
		
		t2.print();
		
		System.out.println(")");

	}

}
