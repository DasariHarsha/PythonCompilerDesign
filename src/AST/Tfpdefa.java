package AST;

public class Tfpdefa implements ASTNode {
	String name;
	ASTNode t1;
	
	


	public Tfpdefa(String name, ASTNode t1) {
		super();
		this.name = name;
		this.t1 = t1;
	}




	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new Tfpdefa("+name+",");
		t1.print();
		System.out.println(")");

	}

}
