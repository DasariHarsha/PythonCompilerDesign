package AST;

public class ImportASImport implements ASTNode {
	ASTNode t1,t2;
	Integer op;
	

	public ImportASImport(ASTNode t1, ASTNode t2, Integer op) {
		super();
		this.t1 = t1;
		this.t2 = t2;
		this.op = op;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new ImportASImport( ");
		t1.print();
		System.out.println(", ");
		t2.print();
		System.out.println(", ");
		switch(op)
		{
		case 1: System.out.println("COMMA ");
				break;
		
		}
		
		System.out.println(")");

	}

}
