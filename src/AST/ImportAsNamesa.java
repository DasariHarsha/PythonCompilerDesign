package AST;

public class ImportAsNamesa implements ASTNode {
	Integer op;
	

	public ImportAsNamesa(Integer op) {
		super();
		this.op = op;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
System.out.println("new ImportAsNamesa(NAME ");
		
		switch(op)
		{
		case 1: System.out.println("AS NAME, ");
		break;
		case 2: System.out.println(" ");
		break;
		
		}
		

	}

}
