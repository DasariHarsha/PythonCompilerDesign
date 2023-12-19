package AST;

public class ImportDottedStar implements ASTNode {
	ASTNode t1,t2;
	Integer op;
	

	public ImportDottedStar(ASTNode t1, ASTNode t2, Integer op) {
		super();
		this.t1 = t1;
		this.t2 = t2;
		this.op = op;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new ImportDottedStar(FROM ");
		t1.print();
		System.out.println("IMPORT ");
		System.out.println(",");
		t2.print();
		switch(op)
		{
		case 1: System.out.println("Star ");
				break;
		case 2: System.out.println(" ");
		break;
		}
		
		System.out.println(")");

	}

}
