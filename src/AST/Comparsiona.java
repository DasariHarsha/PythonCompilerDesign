package AST;

public class Comparsiona extends ComparsionAbstractClass implements ASTNode {
	
	Integer op;
	ASTNode t1,t2;
	

	
	
	

	public Comparsiona(Integer op, ASTNode t1, ASTNode t2) {
		super();
		this.op = op;
		this.t1 = t1;
		this.t2 = t2;
	}






	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Comparsiona( ");
		
		switch(op)
		{
		case 1: System.out.println("<, ");
				break;
		case 2: System.out.println(">, ");
				break;
		case 3: System.out.println("=, ");
				break;
		case 4: System.out.println(">=, ");
				break;
		case 5: System.out.println("<=, ");
				break;
		case 6: System.out.println("<>, ");
				break;
		case 7: System.out.println("!=, ");
				break;
		case 8: System.out.println("in, ");
				break;
		case 9: System.out.println("not in, ");
				break;
		case 10: System.out.println("is, ");
				break;
		case 11: System.out.println("is not, ");
				break;
		}
		t1.print();
		System.out.println(", ");
		t2.print();
		System.out.println(")");

	}

}
