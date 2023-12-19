package AST;

public class AtomicExpr extends AtomAbstract implements ASTNode {
	Integer op;
	ASTNode t1;
	

	public AtomicExpr(Integer op, ASTNode t1) {
		super();
		this.op = op;
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new OpExp( ");
		switch(op)
		{
		case 1: System.out.println("STRING_LITERAL, ");
				break;
		case 2: System.out.println("BYTES_LITERAL, ");
				break;
		}
		t1.print();
		System.out.println(")");

	}

}
