parser grammar Python3Parser;
@header
{
	import AST.*;
	import java.util.Hashtable;
 	import java.util.Enumeration;
 	import java.io.*;
 	import AST.File;
}
options {
  tokenVocab=Python3Lexer;
}

@members
{
public class SymbolTable {
Hashtable<String, String[]> hashTable = new Hashtable<>();


public void addValuesForKey(String key, String value1, String value2) {
        hashTable.put(key, new String[]{value1, value2});
    }
public void updateValuesForKey(String key, String newValue1, String newValue2) {
        if (hashTable.containsKey(key)) {
            String[] values = hashTable.get(key);
            values[0] = newValue1;
            values[1] = newValue2;
            hashTable.put(key, values);
        } else {
            System.out.println("Key does not exist: " + key);
        }
    }


 public void printHT() {
        System.out.println("\nSymbolTable: ");
        Enumeration<String> names = hashTable.keys();
        while (names.hasMoreElements()) {
            String key = names.nextElement();
            String[] values = hashTable.get(key);
            System.out.println("Key: " + key + " & Values: [" + values[0] + ", " + values[1] + "]");
        }
        
        }
}
SymbolTable symbolTable = new SymbolTable();
public static int scope = 0;
public static void incrementscope() {
		//System.out.println("Incremented Scope"+scope);
        scope++;
    }

    public static void decrementscope() {
    	//System.out.println("Incremented Scope"+scope);
        scope--;
    }

    public static String getscope() {
        return Integer.toString(scope);
    }
}


/*
 * parser rules
 */
program returns [ASTNode node]
 : t1=single_input {$node=$t1.node;$node.print();symbolTable.printHT();}
 ;

single_input returns [ASTNode node]
 : NEWLINE {$node=new SingleNewline($NEWLINE.text);}
 | t1=simple_stmt {$node=new SimpleStm($t1.node);}
 | t2=compound_stmt{$node=new CompoundStm($t2.node);}
 ;


file_input returns[ASTNode node]
 : NEWLINE t1=a {$node=new File($t1.node);} EOF  
 | t2=stmt t3=b {$node=new FileStmt($t2.node,$t3.node);}EOF 
 ;

a returns[ASTNode node] :  NEWLINE t1=a {$node=new Classa($t1.node);}
	| {$node=new NullStmt();};

b returns[ASTNode node]: t1=stmt t2=b {$node=new Classb($t1.node,$t2.node);}
| {$node=new NullStmt();};


eval_input returns[ASTNode node] 
 : t1=testlist NEWLINE t2=a EOF {$node=new EvalInput($t1.node,$t2.node);}
 ;


decorator returns[ASTNode node]
 : AT t1=dotted_name  t2=decoratora  NEWLINE {$node=new Decorator($t1.node,$t2.node);}
 ;
decoratora returns[ASTNode node]:OPEN_PAREN t1=decoratorb CLOSE_PAREN {$node=new Decoratorclassa($t1.node);}
          | {$node=new NullStmt();};
decoratorb returns[ASTNode node]:t1=arglist {$node=new Decoratorclassb($t1.node);}
		  | {$node=new NullStmt();};



decorators returns[ASTNode node]
 : t1=decoratorc {$node=new Decorators($t1.node);}
 ;
decoratorc returns[ASTNode node]: t1=decorator t2=decoratorc{$node=new Decoratorclassc($t1.node,$t2.node);}
           |t3=decorator{$node=new Decoratorclassd($t3.node);};


decorated returns[ASTNode node]
 : t1=decorators t2=decoratord {$node=new Decoratorclasse($t1.node,$t2.node);}
 ;
 decoratord returns[ASTNode node]:t1=classdef {$node=new Decoratorclassf($t1.node);}
 		   |t2=funcdef {$node=new Decoratorclassg($t2.node);}
 		   ;


funcdef returns[ASTNode node]
 : DEF NEWLINE NAME t1=parameters t2=funcdefrc COLON t3=suite {$node=new FuncDef($t1.node,$t2.node,$t3.node,$NAME.text);}
 ;
 funcdefrc returns[ASTNode node]:'->' t1=test {$node=new FuncDefc($t1.node);}
        | {$node=new NullStmt();};
 

parameters returns[ASTNode node]
 : OPEN_PAREN t1=typedargslistr CLOSE_PAREN {$node=new Parameters($t1.node);}
 ;
typedargslistr returns[ASTNode node]:t1=typedargslist {$node=new Typedargslistr($t1.node);}
									| {$node=new NullStmt();};

typedargslist returns[ASTNode node]
 : t1=tfpdef t2=typedargslistra t3=typedargslistrb t4=typedargslistrg {$node=new Typedargslist($t1.node,$t2.node,$t3.node,$t4.node);}
 | STAR t5=typedargslistrc t6=typedargslistrb t7=typedargslistrd {$node=new Typedargslista($t5.node,$t6.node,$t7.node);}
 | POWER t8=tfpdef {$node=new Typedargslistb($t8.node);}
 ;
typedargslistra returns[ASTNode node]: ASSIGN t1=test {$node=new Typedargslistc($t1.node);}| {$node=new NullStmt();};
typedargslistrb returns[ASTNode node]: COMMA t1=tfpdef t2=typedargslistra t3=typedargslistrb {$node=new Typedargslistd($t1.node,$t2.node,$t3.node );}| COMMA t4=vfpdef t5=typedargslistra t6=typedargslistrb {$node=new Typedargsliste($t4.val,$t5.node,$t6.node);}| {$node=new NullStmt();};
typedargslistrc returns[ASTNode node]:t1=tfpdef {$node=new Tfpdef($t1.node);}|t2=vfpdef {$node=new Vfpdef($t2.val);}| {$node=new NullStmt();};
typedargslistrd returns[ASTNode node]:COMMA POWER t1=tfpdef {$node=new Tfpdef($t1.node);} |COMMA POWER t2=vfpdef {$node=new Vfpdef($t2.val);}| {$node=new NullStmt();};
typedargslistre returns[ASTNode node]: STAR t1=typedargslistrc t2=typedargslistrb t3=typedargslistrd {$node=new Typedargslistrf($t1.node,$t2.node,$t3.node);}| POWER t4=tfpdef {$node=new Typedargslistrg($t4.node);} |POWER t5=vfpdef {$node=new Typedargslistrh($t5.val);}| {$node=new NullStmt();};
typedargslistrf returns[ASTNode node]: t1=typedargslistre {$node=new Typedargslistri($t1.node);}| {$node=new NullStmt();};
typedargslistrg returns[ASTNode node]:COMMA t1=typedargslistrf {$node=new Typedargslistrj($t1.node);}| {$node=new NullStmt();};




tfpdef returns[ASTNode node]
 : NAME t1=tfpdefa {$node=new Tfpdefa($NAME.text,$t1.node);}
 ;
 tfpdefa returns[ASTNode node]:COLON t1=test {$node=new Tfpdefb($t1.node);} | {$node=new NullStmt();};
 
varargslist returns[ASTNode node]
 : t1=vfpdef t2=typedargslistra t3=typedargslistrb t4=typedargslistrg {$node=new Varargslist($t1.val,$t2.node,$t3.node,$t4.node);}
 | STAR t5=typedargslistrc t6=typedargslistrb t7=typedargslistrd {$node=new Varargslistclassa($t5.node,$t6.node,$t7.node);}
 | POWER t8=vfpdef {$node=new Typedargslistrh($t8.val);}
 ;


vfpdef returns[Integer val]
 : NAME {$val=1;}
 ;


stmt returns[ASTNode node]
 : t1=stmta t2=simple_stmt {$node=new Stmt($t1.val,$t2.node);}
 | t3=compound_stmt {$node=new CompoundStm($t3.node);}
 ;
stmta returns[Integer val]:NEWLINE {$val=1;}| {$val=2;};

simple_stmt returns [ASTNode node]
 : t4=newy t1=small_stmt t2=simple_stmta t3=semi {$node=new SimpleStmta($t1.node,$t2.node,$t3.val,$t4.val);}
 ;
simple_stmta returns [ASTNode node]:t1=semi t2=small_stmt t3=simple_stmta {$node=new SimpleStmtb($t1.val,$t2.node,$t3.node);}| {$node=new NullStmt();};
semi returns [Integer val]:SEMI_COLON {$val=1;} | {$val=2;};


small_stmt returns [ASTNode node]
 : t1=expr_stmt {$node=new ExprStmt($t1.node);}
 | t2=del_stmt {$node=new DelStmt($t2.node);}
 | t3=pass_stmt {$node=new PassStmt($t3.val);}
 | t4=flow_stmt {$node=new FlowStmt($t4.node);}
 | t5=import_stmt {$node=new ImportStmt($t5.node);}
 | t6=global_stmt {$node=new GlobalStmt($t6.node);}
 | t7=nonlocal_stmt {$node=new NonLocalStmt($t7.node);}
 | t8=assert_stmt   {$node=new AssertStmt($t8.node);}
 ;


expr_stmt returns [ASTNode node]
 : t1=testlist_star_expr t2=expr_stmtd {$node=new ExprStmtMul($t1.node,$t2.node);if($t1.name.equals("INDENT")){incrementscope();} else if($t1.name.equals("DEDENT")){decrementscope();} if($t2.name != null) {System.out.println("in t2");symbolTable.addValuesForKey($t1.name, $t2.name,getscope());}}
 ;  
 
expr_stmta returns [ASTNode node]: t1=yield_expr {$node=new YieldExpr($t1.node);} | t2=testlist {$node=new TestList($t2.node);}; 
expr_stmtb returns [ASTNode node,String name]:t1=yield_expr {$node=new YieldExpr($t1.node);} | t2=testlist_star_expr {$node=new TestListStar($t2.node);$name=$t2.name;};
expr_stmtc returns [ASTNode node,String name]: ASSIGN t1=expr_stmtb t2=expr_stmtc {$node=new ExprStmta($t1.node,$t2.node);$name=$t1.name;}|NEWLINE{$node=new SingleNewline($NEWLINE.text);}| {$node=new NullStmt();};
expr_stmtd returns [ASTNode node,String name]: t1=augassign t2=expr_stmta {$node = new AugAssign($t1.val, $t2.node);}
| t3=expr_stmtc {$node=new ExprStmtb($t3.node);$name=$t3.name;};


testlist_star_expr returns [ASTNode node,String name]
 : t1=testlist_star_expra t2=testlist_star_exprb t3=com {$node=new TestListStarMul($t1.node,$t2.node,$t3.val);$name=$t1.name;}
 ;
 
testlist_star_expra returns [ASTNode node,String name]: t1=test {$node=new Test($t1.node);$name=$t1.name;} |  t2=star_expr {$node=new StarExp($t2.node);}; 
testlist_star_exprb returns [ASTNode node]: COMMA t1=testlist_star_expra t2=testlist_star_exprb {$node=new TestListStara($t1.node,$t2.node);}| {$node=new NullStmt();};
com returns [Integer val]:COMMA {$val = 1;}| {$val = 2;};


augassign returns [Integer val]
 : ADD_ASSIGN {$val = 1;}
 | SUB_ASSIGN {$val = 2;}
 | MULT_ASSIGN {$val = 3;}
 | AT_ASSIGN   {$val = 4;}
 | DIV_ASSIGN  {$val = 5;}
 | MOD_ASSIGN  {$val = 6;}
 | AND_ASSIGN  {$val = 7;}
 | OR_ASSIGN   {$val = 8;}
 | XOR_ASSIGN  {$val = 9;}
 | LEFT_SHIFT_ASSIGN  {$val = 10;}
 | RIGHT_SHIFT_ASSIGN {$val = 11;}
 | POWER_ASSIGN {$val = 12;}
 | IDIV_ASSIGN {$val = 13;}
 ;


del_stmt returns [ASTNode node]
 : DEL t1=exprlist {$node=new ExprList($t1.node);} 
 ;

pass_stmt returns [Integer val]
 : PASS {$val=1;}
 ;


flow_stmt returns [ASTNode node]
 : t1=break_stmt {$node=new BreakStmt($t1.val);} 
 | t2=continue_stmt {$node=new ContinueStmt($t2.val);} 
 | t3=return_stmt  {$node=new ReturnStmt($t3.node);} 
 | t4=raise_stmt  {$node=new RaiseStmt($t4.node);} 
 | t5=yield_stmt  {$node=new YieldStmt($t5.node);} 
 ;


break_stmt returns [Integer val]
 : BREAK {$val=1;}
 ;


continue_stmt returns [Integer val]
 : CONTINUE {$val=1;}
 ;


return_stmt returns [ASTNode node]
 : RETURN t1=return_stmta {$node=new ReturnStmta($t1.node);}
 ;
return_stmta returns [ASTNode node]:t1=testlist {$node=new TestLista($t1.node);}| {$node=new NullStmt();};

yield_stmt returns [ASTNode node]
 : t1=yield_expr {$node=new YieldExpr($t1.node);}
 ;


raise_stmt returns [ASTNode node]
 : RAISE t1=raise_stmtc {$node=new RaiseStmta($t1.node);}
 ;
 
 raise_stmtb returns [ASTNode node]:FROM t1=test {$node=new Testa($t1.node);}| {$node=new NullStmt();};
 raise_stmtc returns [ASTNode node]: t1=test t2=raise_stmtb {$node=new TestRaise($t1.node,$t2.node);}| {$node=new NullStmt();};


import_stmt returns [ASTNode node]
 : t1=import_name {$node=new ImportName($t1.node);}
 | t2=import_from {$node=new ImportFrom($t2.node);}
 ;


import_name returns [ASTNode node]
 : IMPORT t1=dotted_as_names {$node=new DottedasNames($t1.node);}
 ;


import_from returns [ASTNode node]
 : FROM t1=import_fromd IMPORT t2=dotted_as_names t3=starra {$node=new ImportDottedStar($t1.node,$t2.node,$t3.val);}
          | OPEN_PAREN t4=import_as_names CLOSE_PAREN {$node=new ImportAsNames($t4.node);}
          | t5=import_as_names {$node=new ImportAsNames($t5.node);}
                   
 ;
 import_frome returns [ASTNode node]:t1=dotted_as_names {$node=new DottedasNamesa($t1.node);}| {$node=new NullStmt();};
 starra returns [Integer val]:STAR {$val=1;}| {$val=2;};
 import_froma returns [Integer val]:DOT {$val=1;} | ELLIPSIS {$val=2;}; 
 import_fromb returns [ASTNode node]:t1=import_froma t2=import_fromb {$node=new ImportFroma($t1.val,$t2.node);} | {$node=new NullStmt();};
 import_fromc returns [ASTNode node]:t1=import_froma t2=import_fromc {$node=new ImportFromb($t1.val,$t2.node);} |t3=import_froma {$node=new ImportFromc($t3.val);};
 import_fromd returns [ASTNode node]:t1=import_fromb t2=dotted_name {$node=new ImportFromd($t1.node,$t2.node);} | t3=import_fromc {$node=new ImportFrome($t3.node);} ;
 

import_as_name returns [ASTNode node]
 : NAME t1=import_as_namea {$node=new ImportAsNamesa($t1.val);}
 ;

import_as_namea returns [Integer val]:AS NAME{$val=1;} | {$val=2;};


dotted_as_name returns [ASTNode node]
 : t1=dotted_name t2=import_as_namea {$node=new DottedImport($t1.node,$t2.val);}
 ;


import_as_names returns [ASTNode node]
 : t1=import_as_name t2=import_as_namesa t3=com {$node=new ImportASImport($t1.node,$t2.node,$t3.val);}
 ;
import_as_namesa returns [ASTNode node]:COMMA t1=import_as_name t2=import_as_namesa {$node=new ImportAsImporta($t1.node,$t2.node);} | {$node=new NullStmt();};

dotted_as_names returns [ASTNode node]
 : t1=dotted_as_name t2=dotted_as_namesa {$node=new DottedAsDotted($t1.node,$t2.node);}
 ;
dotted_as_namesa returns [ASTNode node]:COMMA t1=dotted_as_name t2=dotted_as_namesa {$node=new DottedAsDotteda($t1.node,$t2.node);}| {$node=new NullStmt();};

dotted_name returns[ASTNode node]
 : NAME t1=dotted_namea {$node=new DottedasNamesb($t1.node);}
 ;

dotted_namea returns[ASTNode node]:DOT NAME t1=dotted_namea {$node=new DottedasNamesc($t1.node);}| {$node=new NullStmt();};

global_stmt returns [ASTNode node]
 : GLOBAL NAME t1=global_stmta {$node=new GlobalStmta($t1.node);}
 ;
global_stmta returns [ASTNode node]:COMMA NAME t1=global_stmta {$node=new GlobalStmtb($t1.node);}| ;

nonlocal_stmt returns [ASTNode node]
 : NONLOCAL NAME t1=global_stmta {$node=new NonLocalStmta($t1.node);}
 ;


assert_stmt returns [ASTNode node]
 : ASSERT t1=test assert_stmta {$node=new AssertStmta($t1.node);}
 ;
assert_stmta returns [ASTNode node]:COMMA t1=test {$node=new AssertStmtb($t1.node);} | {$node=new NullStmt();};

compound_stmt returns [ASTNode node]
 : t1=if_stmt {$node=new IfStmt($t1.node);}
 | t2=while_stmt {$node=new WhileStmt($t2.node);}
 | t3=for_stmt {$node=new ForStmt($t3.node);}
 | t4=try_stmt {$node=new TryStmt($t4.node);}
 | t5=with_stmt {$node=new WithStmt($t5.node);}
 | t6=funcdef   {$node=new FuncdefStmt($t6.node);}
 | t7=classdef  {$node=new ClassdefStmt($t7.node);}
 | t8=decorated {$node=new DecoratedStmt($t8.node);}
 ;


if_stmt returns [ASTNode node]
 : IF t1=test COLON t2=suite t3=if_stmta t4=if_stmta {$node=new IfStmta($t1.node,$t2.node,$t3.node,$t4.node);}
 ;
 if_stmta returns [ASTNode node]:ELIF t1=test COLON t2=suite t3=if_stmta {$node=new ElifStmt($t1.node,$t2.node,$t3.node);} |ELSE COLON t4=suite {$node=new ElifStmta($t4.node);}| {$node=new NullStmt();};


while_stmt returns [ASTNode node]
 : WHILE t1=test t2=for_stmta COLON t3=suite t4=if_stmta {$node=new WhileStmta($t1.node,$t2.node,$t3.node,$t4.node);}
 ;


for_stmt returns [ASTNode node]
 : FOR t1=exprlist IN t2=testlist t3=for_stmta t4=expr COLON t5=suite t6=if_stmta {$node=new ForStmta($t1.node,$t2.node,$t3.node,$t4.node,$t5.node,$t6.node);}
 ;
 for_stmta returns [ASTNode node]:OPEN_PAREN t1=simple_stmt CLOSE_PAREN {$node=new SimpleStm($t1.node);} | ;


try_stmt returns [ASTNode node]
 : TRY COLON suite try_stmta if_stmta try_stmtb
                 | try_stmtb
                 
 ;
 
 try_stmta:except_clause COLON suite try_stmta |except_clause COLON suite;
 try_stmtb:FINALLY COLON suite try_stmtb |FINALLY COLON suite;
 

with_stmt returns [ASTNode node]
 : WITH with_item with_stmta COLON suite
 ;

with_stmta: COMMA with_item  with_stmta| ;


with_item
 : test with_itema
 ;
 with_itema:AS expr| ;


except_clause
 : EXCEPT except_clauseb
 ;
except_clausea:AS NAME | ;
except_clauseb: test except_clausea | ;

suite returns[ASTNode node]
 : t1=simple_stmt {$node=new SimpleStm($t1.node);}
 | t2=newy t3=indenta t4=suitea t5=newy t6=dedenta {$node=new SimpleSuiteStmt($t2.val,$t3.val,$t4.node,$t5.val,$t6.val);}
 ;
 newy returns   [Integer val]:NEWLINE{$val=1;}| {$val=2;};
suitea returns  [ASTNode node]:t1=stmt t2=suitea {$node=new Suit($t1.node,$t2.node);}| t3=stmt {$node=new Stmta($t3.node);};
indenta returns [Integer val]:INDENT {$val=1;} | {$val=2;};
dedenta returns [Integer val]:DEDENT {$val=1;} | {$val=2;};


test returns[ASTNode node,String name]
 : t1=or_test t2=testa {$node=new TestOr($t1.node,$t2.node);$name=$t1.name;} 
 | t3=lambdef {$node=new LambDef($t3.node);} 
 ;
 
testa returns[ASTNode node]: IF t1=or_test ELSE t2=test {$node=new TestaIfElse($t1.node,$t2.node);}| {$node=new NullStmt();};


test_nocond returns[ASTNode node]
 : t1=or_test   {$node=new TestnoCond($t1.node);}
 | t2=lambdef_nocond {$node=new TestnoConda($t2.node);}
 ;


lambdef returns[ASTNode node]
 : LAMBDA t1=lambdefa COLON t2=test {$node=new Lambda($t1.node,$t2.node);}
 ;
 
 lambdefa returns[ASTNode node]: t1=varargslist {$node=new LambdaDefFunc($t1.node);}| {$node=new NullStmt();};


lambdef_nocond returns[ASTNode node]
 : LAMBDA t1=lambdefa COLON t2=test_nocond {$node=new Lambda($t1.node,$t2.node);}
 ;


or_test returns[ASTNode node,String name]
 : t1=and_test t2=or_testa {$node=new OrTest($t1.node,$t2.node);$name=$t1.name;}
 ;
or_testa returns[ASTNode node]:OR t1=and_test t2=or_testa {$node=new OrAndTest($t1.node,$t2.node);}| {$node=new NullStmt();};

and_test returns[ASTNode node,String name]
 : t1=not_test t2=and_testa{$node=new AndNot($t1.node,$t2.node);$name=$t1.name;}
 ;
and_testa returns[ASTNode node]: AND t1=not_test t2=and_testa {$node=new AndNota($t1.node,$t2.node);}| {$node=new NullStmt();};

not_test returns[ASTNode node,String name]
 :  NOT t1=not_test {$node=new NotTest($t1.node);}
 | t2=comparison {$node=new Comparsion($t2.node);$name=$t2.name;}
 ;


comparison returns[ASTNode node,String name]
 : t1=star_expr t2=comparisona{$node=new ComparsionStarExpr($t1.node,$t2.node);
 	$name=$t1.name;
 	//System.out.println($t2.name);
 	String[] lType={"null","null"};
 	String[] rType={"null","null"};
 	lType[0]="null";
 	lType[1]="null";
 	rType[0]="null";
 	rType[1]="null";
 	
 	if($t1.name=="Integer"||$t1.name=="Float"||$t1.name=="Imaginary"||$t1.name=="String"||$t1.name=="Bool"||$t1.name=="Tuple"||$t1.name=="dict"||$t1.name=="List"){
 		lType[0]=$t1.name;
 	}
 	else if($t1.name==null){
 		lType[0]="null";
 	}
 	else{
 		String[] lTypeFromTable=symbolTable.hashTable.get($t1.name);
 		if (lTypeFromTable != null) {
        lType[0] = lTypeFromTable[0];
        lType[1] = lTypeFromTable[1];
    }
 	}
 	if($t2.name=="Integer"||$t2.name=="Float"||$t2.name=="Imaginary"||$t2.name=="String"||$t2.name=="Bool"||$t2.name=="Tuple"||$t2.name=="dict"||$t2.name=="List"){
 		rType[0]=$t2.name;
 	}
 	else if($t2.name==null){
 		rType[0]="null";
 	}
 	else{
 		String[] rTypeFromTable=symbolTable.hashTable.get($t2.name);
 		if (rTypeFromTable != null) {
        rType[0] = rTypeFromTable[0];
        rType[1] = rTypeFromTable[1];}
        else{
 		lType[0]=null;
 		rType[0]=null;
 	}
 	}
 	symbolTable.printHT();
 	if(lType[0] == null){
	 System.out.println("left Variable "  + " not declared");
	}
    if(rType[0] == null){
	 System.out.println("right Variable " + " not declared");
		}
																
	if((lType[0]!=null && rType[0]!=null) && (lType[0]!="null" && rType[0]!="null") && (lType[0] == rType[0] || (lType[0]=="Float" && rType[0]=="Integer")||(rType[0]=="Float" && lType[0]=="Integer"))){
		
		
		System.out.println("Type matched");
		}
	else{
		System.out.println("Type mismatch between " + lType[0] + " and " + rType[0] +" for comparsion operator");
	}
 }
 ;

comparisona returns[ASTNode node,String name]:t1=comp_op t2=star_expr t3=comparisona {$node=new Comparsiona($t1.val,$t2.node,$t3.node);$name=$t2.name;}| {$node=new NullStmt();};

comp_op returns[Integer val]
 : LESS_THAN {$val=1;}
 | GREATER_THAN {$val=2;}
 | EQUALS {$val=3;}
 | GT_EQ {$val=4;}
 | LT_EQ {$val=5;}
 | NOT_EQ_1 {$val=6;}
 | NOT_EQ_2 {$val=7;}
 | IN       {$val=8;}
 | NOT IN   {$val=9;}
 | IS       {$val=10;}
 | IS NOT   {$val=11;}
 ;


star_expr returns[ASTNode node,String name]
 : t1=star_expra t2=expr {$node=new StarExpa($t1.val,$t2.node);$name=$t2.name;}
 ;
 star_expra returns[Integer val]:STAR {$val=1;}| {$val=2;};


expr returns [ASTNode node,String name]
 : t1=xor_expr  t2=expra {$node=new Expr($t1.node,$t2.node);$name=$t1.name;}
 ;
 expra returns [ASTNode node]: OR_OP t1=xor_expr t2=expra {$node=new Expra($t1.node,$t2.node);} | {$node=new NullStmt();};


xor_expr returns [ASTNode node,String name]
 : t1=and_expr t2=xor_expra {$node=new XORExpr($t1.node,$t2.node);$name=$t1.name;}
 ;
 xor_expra returns [ASTNode node]:XOR t1=and_expr t2=xor_expra {$node=new XORExpra($t1.node,$t2.node);}| {$node=new NullStmt();};


and_expr returns [ASTNode node,String name]
 : t1=shift_expr t2=and_expra {$node=new AndExpr($t1.node,$t2.node);$name=$t1.name;}
 ;
and_expra returns [ASTNode node]:AND_OP t1=shift_expr t2=and_expra {$node=new AndExpra($t1.node,$t2.node);} | {$node=new NullStmt();};


shift_expr returns [ASTNode node,String name]
 :t1=arith_expr t2=shift_exprb {$node=new ShiftExpr($t1.node,$t2.node);
 	$name=$t1.name;
 	String[] lType={"null","null"};
 	String[] rType={"null","null"};
 	lType[0]="null";
 	lType[1]="null";
 	rType[0]="null";
 	rType[1]="null";
 	if($t1.name=="Integer"||$t1.name=="Float"||$t1.name=="Imaginary"||$t1.name=="String"||$t1.name=="Bool"||$t1.name=="Tuple"||$t1.name=="dict"||$t1.name=="List"){
 		lType[0]=$t1.name;
 	}
 	else if($t1.name==null){
 		lType[0]="null";
 	}
 	else{
 		String[] lTypeFromTable=symbolTable.hashTable.get($t1.name);
 		if (lTypeFromTable != null) {
        lType[0] = lTypeFromTable[0];
        lType[1] = lTypeFromTable[1];
    }
 	}
 	if($t2.name=="Integer"||$t2.name=="Float"||$t2.name=="Imaginary"||$t2.name=="String"||$t2.name=="Bool"||$t2.name=="Tuple"||$t2.name=="dict"||$t2.name=="List"){
 		rType[0]=$t2.name;
 	}
 	else if($t2.name==null){
 		rType[0]="null";
 	}
 	else{
 		String[] rTypeFromTable=symbolTable.hashTable.get($t2.name);
 		if (rTypeFromTable != null) {
        rType[0] = rTypeFromTable[0];
        rType[1] = rTypeFromTable[1];}
        else{
 		lType[0]=null;
 		rType[0]=null;
 	}
 	}
 	
 	symbolTable.printHT();
 	if(lType[0] == null){
	 System.out.println("left Variable "  + " not declared");
	}
    if(rType[0] == null){
	 System.out.println("right Variable " + " not declared");
		}
																
	if((lType[0]!=null && rType[0]!=null) && (lType[0]!="null" && rType[0]!="null") && (lType[0] == rType[0] || (lType[0]=="Float" && rType[0]=="Integer")||(rType[0]=="Float" && lType[0]=="Integer"))){
		
		
		System.out.println("Type matched");
		}
	else{
		System.out.println("Type mismatch between " + lType[0] + " and " + rType[0] +" for shift operations");
	}
 	
 }
 ;
 shift_expra returns [ASTNode node,String name]:LEFT_SHIFT t1=arith_expr {$node=new LeftShiftExpr($t1.node);$name=$t1.name;} | RIGHT_SHIFT t2=arith_expr {$node=new RightShiftExpr($t2.node);$name=$t2.name;};
 shift_exprb returns [ASTNode node,String name]:t1=shift_expra t2=shift_exprb {$node=new Shiftab($t1.node,$t2.node);$name=$t1.name;}| {$node=new NullStmt();};


arith_expr returns [ASTNode node,String name]
 : t1=term t2=arith_exprb 
 {
 	$node=new AirthExpr($t1.node,$t2.node);
 	$name=$t1.name;
 	String[] lType={"null","null"};
 	String[] rType={"null","null"};
 	lType[0]="null";
 	lType[1]="null";
 	rType[0]="null";
 	rType[1]="null";
 	if($t1.name=="Integer"||$t1.name=="Float"||$t1.name=="Imaginary"||$t1.name=="String"||$t1.name=="Bool"||$t1.name=="Tuple"||$t1.name=="dict"||$t1.name=="List"){
 		lType[0]=$t1.name;
 	}
 	else if($t1.name==null){
 		lType[0]="null";
 	}
 	else{
 		String[] lTypeFromTable=symbolTable.hashTable.get($t1.name);
 		if (lTypeFromTable != null) {
        lType[0] = lTypeFromTable[0];
        lType[1] = lTypeFromTable[1];
    }
 	}
 	if($t2.name=="Integer"||$t2.name=="Float"||$t2.name=="Imaginary"||$t2.name=="String"||$t2.name=="Bool"||$t2.name=="Tuple"||$t2.name=="dict"||$t2.name=="List"){
 		rType[0]=$t2.name;
 	}
 	else if($t2.name==null){
 		rType[0]="null";
 	}
 	else{
 		String[] rTypeFromTable=symbolTable.hashTable.get($t2.name);
 		if (rTypeFromTable != null) {
        rType[0] = rTypeFromTable[0];
        rType[1] = rTypeFromTable[1];}
        else{
 		lType[0]=null;
 		rType[0]=null;
 	}
 	}
 	symbolTable.printHT();
 	if(lType[0] == null){
	 System.out.println("left Variable "  + " not declared");
	}
    if(rType[0] == null){
	 System.out.println("right Variable " + " not declared");
		}
																
	if((lType[0]!=null && rType[0]!=null) && (lType[0]!="null" && rType[0]!="null") && (lType[0] == rType[0] || (lType[0]=="Float" && rType[0]=="Integer")||(rType[0]=="Float" && lType[0]=="Integer"))){
		
		
		System.out.println("Type matched");
		}
	else{
		System.out.println("Type mismatch between " + lType[0] + " and " + rType[0] +" for airthmetic operations");
	}
 }
 ;
 arith_expra returns [ASTNode node,String name]: ADD t1=term {$node=new AirthAdd($t1.node);$name=$t1.name;} | MINUS t2=term {$node=new AirthMinus($t2.node);$name=$t2.name;};
 arith_exprb returns [ASTNode node,String name]:t1=arith_expra t2=arith_exprb {$node=new AirthExprab($t1.node,$t2.node);$name=$t1.name;}| {$node=new NullStmt();};


term returns [ASTNode node,String name]
 : t1=factor t2=termb {$node=new Term($t1.node,$t2.node);$name=$t1.name;}
 ;

terma returns [ASTNode node]:STAR t1=factor {$node=new FactorStar($t1.node);} | DIV t2=factor {$node=new FactorDiv($t2.node);if($t2.value==0){System.out.println("\n\nError dividing with 0");};} | MOD t3=factor {$node=new FactorMod($t3.node);}| IDIV t4=factor {$node=new FactorIdiv($t4.node);}| AT t5=factor {$node=new FactorAt($t5.node);};
termb returns [ASTNode node]:t1=terma t2=termb {$node=new TermaTermb($t1.node,$t2.node);}| {$node=new NullStmt();};

factor returns [ASTNode node,String name,Integer value]
 : ADD t1=factor {$node=new Factorc($t1.node);} 
 | MINUS t2=factor {$node=new Factora($t2.node);} 
 | NOT_OP t3=factor {$node=new Factorb($t3.node);}
 | t4=power {$node=new FactorPower($t4.node);$name=$t4.name;$value=$t4.value;}
 ;


power returns [ASTNode node,String name,Integer value]
 : t1=atom t2=powerb t3=powera {$node=new Power($t1.node,$t2.node,$t3.node);$name=$t1.name;$value=$t1.value;}
 ;
 powera returns [ASTNode node]: POWER t1=factor {$node=new Powera($t1.node);}| {$node=new NullStmt();};
 powerb returns [ASTNode node]:t1=trailer t2=powerb {$node=new Powerb($t1.node,$t2.node);}| {$node=new NullStmt();};


atom returns [ASTNode node,String name,Integer value]
 : OPEN_PAREN t1=atomb CLOSE_PAREN {$node=new Atom($t1.node);$name="Tuple";}
 | '[' t2=atomc  ']' {$node=new AtomSq($t2.node);$name="List";} 
 | '{' t3=atomd '}' {$node=new AtomFl($t3.node);$name="dict";}
 | NAME {$node= new NameExp($NAME.text); $name=$NAME.text;}
 | t4=number  {$node=new AtomNumber($t4.node);$name=$t4.litType;$value=$t4.value;}
 | t5=atoma   {$node=new AtomNumbera($t5.node);$name=$t5.litType;}
 | ELLIPSIS   {$node= new EllipsisExp($ELLIPSIS.text);}
 | NONE		  {$node= new NoneExp($NONE.text);}
 | TRUE		  {$node= new TrueExp($TRUE.text);$name="Bool";}
 | FALSE	  {$node= new FalseExp($FALSE.text);$name="Bool";}
 ;
atoma returns[ASTNode node,String litType]:t1=str t2=atoma {$node=new AtomicExpr($t1.val,$t2.node);} |t3=str {$node=new AtomicExpra($t3.val);$litType=$t3.litType;};
atomb returns[ASTNode node]: t1=yield_expr {$node=new AtomicExprb($t1.node);} | t2=testlist_comp {$node=new AtomicExprc($t2.node);} | {$node=new NullStmt();};
atomc returns[ASTNode node]:t1=testlist_comp {$node=new AtomicExprc($t1.node);} | {$node=new NullStmt();};
atomd returns[ASTNode node]:t1=dictorsetmaker {$node=new Dictorsetmaker($t1.node);} | {$node=new NullStmt();};


testlist_comp returns[ASTNode node]
 : t1=test t2=testlist_compb {$node=new TestListComp($t1.node,$t2.node);}
 ;
 
 testlist_compa returns[ASTNode node]: COMMA t1=test t2=testlist_compa {$node=new TestListCompa($t1.node,$t2.node);}| {$node=new NullStmt();};
 testlist_compb returns[ASTNode node]: t1=comp_for {$node=new TestListCompb($t1.node);} | t2=testlist_compa t3=com {$node=new TestListCompc($t2.node,$t3.val);};
        

trailer returns [ASTNode node]
 : OPEN_PAREN t1=trailera CLOSE_PAREN {$node=new Trailer($t1.node);}
 | '[' t2=subscriptlist ']' {$node=new Trailera($t2.node);}
 | DOT NAME {$node= new DotName($DOT.text,$NAME.text);}
 ;
 trailera returns [ASTNode node]:t1=arglist {$node=new Trailerb($t1.node);}| {$node=new NullStmt();};


subscriptlist returns [ASTNode node]
 : t1=subscript t2=subscriptlista t3=com {$node=new SubscriptList($t1.node,$t2.node,$t3.val);}
 ;
subscriptlista returns [ASTNode node]:COMMA t1=subscript t2=subscriptlista {$node=new SubscriptLista($t1.node,$t2.node);}| {$node=new NullStmt();};


subscript returns [ASTNode node]
 : t1=test {$node=new SubscriptListb($t1.node);} 
 | t2=subscripta COLON t3=subscripta t4=subscriptb {$node=new SubscriptListc($t2.node,$t3.node,$t4.node);}
 ;
 subscripta returns [ASTNode node]:t1=test {$node=new SubscriptListb($t1.node);}| {$node=new NullStmt();};
 subscriptb returns [ASTNode node]:t1=sliceop {$node=new SubscriptListSliceOp($t1.node);}| {$node=new NullStmt();};


sliceop returns [ASTNode node]
 : COLON t1=subscripta {$node=new SliceOP($t1.node);}
 ;


exprlist returns [ASTNode node]
 : t1=star_expr t2=exprlista t3=com {$node=new ExprListStar($t1.node,$t2.node,$t3.val);};
 exprlista returns [ASTNode node]: COMMA t1=star_expr t2=exprlista {$node=new ExprListStara($t1.node,$t2.node);} | {$node=new NullStmt();};

testlist returns[ASTNode node]
 : t1=test t2=testlista t3=com {$node=new ExprListStarb($t1.node,$t2.node,$t3.val);}
 ;
testlista returns[ASTNode node]: COMMA t1=test t2=testlista {$node=new TestListStarb($t1.node,$t2.node);} | {$node=new NullStmt();};

dictorsetmaker returns[ASTNode node]
 : t1=test COLON t2=test t3=dictorsetmakerb {$node=new Dictorsetmakera($t1.node,$t2.node,$t3.node);}
 | t4=test t5=dictorsetmakerc {$node=new Dictorsetmakerb($t4.node,$t5.node);}
 ;
 
dictorsetmakera returns[ASTNode node]:COMMA t1=test COLON t2=test t3=dictorsetmakera {$node=new Dictorsetmakerc($t1.node,$t2.node,$t3.node);}| {$node=new NullStmt();};
dictorsetmakerb returns[ASTNode node]: t1=comp_for {$node=new CompFor($t1.node);} | t2=dictorsetmakera t3=com {$node=new DictorsetmakerCom($t2.node,$t3.val);};
dictorsetmakerc returns[ASTNode node]:t1=comp_for {$node=new CompFor($t1.node);}| t2=testlista t3=com {$node=new DictorsetmakerComa($t2.node,$t3.val);} ; 

classdef returns[ASTNode node]
 : CLASS NAME t1=classdefb COLON t2=suite {$node=new ClassDef($t1.node,$t2.node);}
 ;
 classdefa returns[ASTNode node]:t1=arglist {$node=new ArgList($t1.node);}| {$node=new NullStmt();};
  classdefb returns[ASTNode node]: OPEN_PAREN  t1=classdefa CLOSE_PAREN {$node=new ArgLista($t1.node);}| {$node=new NullStmt();};


arglist returns[ASTNode node]
 : t1=arglistc t2=arglistd {$node=new Arglistcd($t1.node,$t2.node);}
 ;
arglista returns[ASTNode node]:COMMA t1=argument t2=arglista {$node=new ArglistArgument($t1.node,$t2.node);} | {$node=new NullStmt();};
arglistb returns[ASTNode node]: COMMA POWER t1=test {$node=new ArgListCommaPower($t1.node);} | {$node=new NullStmt();};
arglistc returns[ASTNode node]:t1=argument COMMA  t2=arglistc {$node=new ArglistArgumenta($t1.node,$t2.node);}  | {$node=new NullStmt();};
arglistd returns[ASTNode node]: t1=argument t2=com {$node=new ArglistArgumentComma($t1.node,$t2.val);}| STAR t3=test t4=arglista t5=arglistb {$node=new ArglistStarComma($t3.node,$t4.node,$t5.node);} | POWER t6=test {$node=new PowerTest($t6.node);} ;

argument returns[ASTNode node]
 : t1=argumenta {$node=new ArgumentClass($t1.node);}
 | t2=test ASSIGN t3=test {$node=new ArgumentClassTest($t2.node,$t3.node);}
 ;
argumenta returns[ASTNode node]:t1=test t2=comp_for {$node=new ArgumentComp($t1.node,$t2.node);}| {$node=new NullStmt();};

comp_iter returns[ASTNode node]
 : t1=comp_for {$node=new CompIterFor($t1.node);}
 | t2=comp_if {$node=new CompIterIf($t2.node);}
 ;

comp_for returns[ASTNode node]
 : FOR t1=exprlist IN t2=or_test t3=comp_fora {$node=new ExprListTestComp($t1.node,$t2.node,$t3.node);}
 ;
comp_fora returns[ASTNode node]:t1=comp_iter {$node = new CompForExp($t1.node);}| {$node=new NullStmt();};

comp_if returns[ASTNode node]
 : IF t1=test_nocond t2=comp_fora {$node=new CompIfExp($t1.node,$t2.node);}
 ;

yield_expr returns [ASTNode node]
 : YIELD t1=yield_expra {$node=new YieldExprFunc($t1.node);}
 ;
yield_expra returns [ASTNode node]:t1=yield_arg {$node=new YieldArgFunc($t1.node);}| {$node=new NullStmt();};

yield_arg returns [ASTNode node]
 : FROM t1=test {$node=new YieldArgFunca($t1.node);}
 | t2=testlist  {$node=new YieldArgFuncb($t2.node);}
 ;

str returns[Integer val,String litType]
 : STRING_LITERAL {$val=1;$litType = "String";}
 | BYTES_LITERAL  {$val=2;$litType = "String";}
 ;

number returns[ASTNode node,String litType,Integer value]
 : t1=integer {$node=new IntegerExp($t1.val);$litType = "Integer";$value=$t1.value;}
 | FLOAT_NUMBER {$node= new PrintFloat($FLOAT_NUMBER.text);$litType = "Float";}
 | IMAG_NUMBER  {$node= new PrintImag($IMAG_NUMBER.text);$litType = "Imaginary";}
 ;


integer returns[Integer val, Integer value]
 : DECIMAL_INTEGER {$val=1;$value=Integer.parseInt($DECIMAL_INTEGER.text);}
 | OCT_INTEGER     {$val=2;}
 | HEX_INTEGER     {$val=3;}
 | BIN_INTEGER     {$val=4;}
 ;