package AST;

public class IntegerExp implements ASTNode {
	Integer op;
	

	public IntegerExp(Integer op) {
		super();
		this.op = op;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("IntegerExp( ");
		switch(op)
		{
		case 1: System.out.println("DECIMAL_INTEGER");
				break;
		case 2: System.out.println("OCT_INTEGER");
				break;
		case 3: System.out.println("HEX_INTEGER");
				break;
		case 4: System.out.println("BIN_INTEGER");
				break;
		}
		System.out.println(")");

	}

}
