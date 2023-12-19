package AST;

public class ImportFroma implements ASTNode {
	Integer op;
	ASTNode t1;
	

	public ImportFroma(Integer op, ASTNode t1) {
		super();
		this.op = op;
		this.t1 = t1;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new ImportFroma( ");
		
		
		switch(op)
		{
		case 1: System.out.println("DOT, ");
				break;
		case 2: System.out.println("ELLIPSIS, ");
				break;
		

	}
		System.out.println(", ");
		t1.print();
	}

}
