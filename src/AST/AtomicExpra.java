package AST;

public class AtomicExpra extends AtomAbstract implements ASTNode {
	Integer op;
	

	public AtomicExpra(Integer op) {
		super();
		this.op = op;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new OpExp( ");
		switch(op)
		{
		case 1: System.out.println("STRING_LITERAL");
				break;
		case 2: System.out.println("BYTES_LITERAL");
				break;
		}
		
		System.out.println(")");

	}

}
