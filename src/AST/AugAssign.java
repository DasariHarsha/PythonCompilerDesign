package AST;

public class AugAssign extends AtomAbstract implements ASTNode {
	
	Integer op;
	ASTNode t1;
	

	public AugAssign(Integer op, ASTNode t1) {
		super();
		this.op = op;
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new AugAssign( ");
		switch(op)
		{
		case 1: System.out.println("ADD_ASSIGN, ");
				break;
		case 2: System.out.println("SUB_ASSIGN, ");
				break;
		case 3: System.out.println("MULT_ASSIGN, ");
				break;
		case 4: System.out.println("AT_ASSIGN, ");
		break;
		case 5: System.out.println("DIV_ASSIGN, ");
				break;
		case 6: System.out.println("MOD_ASSIGN, ");
		break;
		
		case 7: System.out.println("AND_ASSIGN, ");
		break;
		
		case 8: System.out.println("OR_ASSIGN, ");
		break;
		
		case 9: System.out.println("XOR_ASSIGN, ");
		break;
		
		case 10: System.out.println("LEFT_SHIFT_ASSIGN, ");
		break;
		
		case 11: System.out.println("RIGHT_SHIFT_ASSIGN, ");
		break;
		
		case 12: System.out.println("POWER_ASSIGN, ");
		break;
		
		case 13: System.out.println("IDIV_ASSIGN, ");
		break;
		
		}
		
		t1.print();
		System.out.println(")");
		

	}

}
