package AST;

public class FuncDef implements ASTNode {
	ASTNode t1,t2,t3;
	String txt;
	
	

	public FuncDef(ASTNode t1, ASTNode t2, ASTNode t3, String txt) {
		super();
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.txt = txt;
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new FuncDef(def "+txt+" ");
		
		t1.print();
		System.out.println(",");
		t2.print();
		System.out.println(",");
		t3.print();
		System.out.println(")");

	}

}
