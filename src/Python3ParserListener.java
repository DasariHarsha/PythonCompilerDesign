// Generated from Python3Parser.g4 by ANTLR 4.10.1

	import AST.*;
	import java.util.Hashtable;
 	import java.util.Enumeration;
 	import java.io.*;
 	import AST.File;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Python3Parser}.
 */
public interface Python3ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Python3Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Python3Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Python3Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(Python3Parser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(Python3Parser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(Python3Parser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(Python3Parser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(Python3Parser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(Python3Parser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(Python3Parser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(Python3Parser.BContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#eval_input}.
	 * @param ctx the parse tree
	 */
	void enterEval_input(Python3Parser.Eval_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#eval_input}.
	 * @param ctx the parse tree
	 */
	void exitEval_input(Python3Parser.Eval_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(Python3Parser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(Python3Parser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#decoratora}.
	 * @param ctx the parse tree
	 */
	void enterDecoratora(Python3Parser.DecoratoraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#decoratora}.
	 * @param ctx the parse tree
	 */
	void exitDecoratora(Python3Parser.DecoratoraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#decoratorb}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorb(Python3Parser.DecoratorbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#decoratorb}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorb(Python3Parser.DecoratorbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(Python3Parser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(Python3Parser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#decoratorc}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorc(Python3Parser.DecoratorcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#decoratorc}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorc(Python3Parser.DecoratorcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecorated(Python3Parser.DecoratedContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecorated(Python3Parser.DecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#decoratord}.
	 * @param ctx the parse tree
	 */
	void enterDecoratord(Python3Parser.DecoratordContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#decoratord}.
	 * @param ctx the parse tree
	 */
	void exitDecoratord(Python3Parser.DecoratordContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(Python3Parser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(Python3Parser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#funcdefrc}.
	 * @param ctx the parse tree
	 */
	void enterFuncdefrc(Python3Parser.FuncdefrcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#funcdefrc}.
	 * @param ctx the parse tree
	 */
	void exitFuncdefrc(Python3Parser.FuncdefrcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(Python3Parser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(Python3Parser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#typedargslistr}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslistr(Python3Parser.TypedargslistrContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#typedargslistr}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslistr(Python3Parser.TypedargslistrContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(Python3Parser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(Python3Parser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#typedargslistra}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslistra(Python3Parser.TypedargslistraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#typedargslistra}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslistra(Python3Parser.TypedargslistraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#typedargslistrb}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslistrb(Python3Parser.TypedargslistrbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#typedargslistrb}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslistrb(Python3Parser.TypedargslistrbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#typedargslistrc}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslistrc(Python3Parser.TypedargslistrcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#typedargslistrc}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslistrc(Python3Parser.TypedargslistrcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#typedargslistrd}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslistrd(Python3Parser.TypedargslistrdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#typedargslistrd}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslistrd(Python3Parser.TypedargslistrdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#typedargslistre}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslistre(Python3Parser.TypedargslistreContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#typedargslistre}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslistre(Python3Parser.TypedargslistreContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#typedargslistrf}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslistrf(Python3Parser.TypedargslistrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#typedargslistrf}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslistrf(Python3Parser.TypedargslistrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#typedargslistrg}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslistrg(Python3Parser.TypedargslistrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#typedargslistrg}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslistrg(Python3Parser.TypedargslistrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void enterTfpdef(Python3Parser.TfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void exitTfpdef(Python3Parser.TfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#tfpdefa}.
	 * @param ctx the parse tree
	 */
	void enterTfpdefa(Python3Parser.TfpdefaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#tfpdefa}.
	 * @param ctx the parse tree
	 */
	void exitTfpdefa(Python3Parser.TfpdefaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#varargslist}.
	 * @param ctx the parse tree
	 */
	void enterVarargslist(Python3Parser.VarargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#varargslist}.
	 * @param ctx the parse tree
	 */
	void exitVarargslist(Python3Parser.VarargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void enterVfpdef(Python3Parser.VfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void exitVfpdef(Python3Parser.VfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(Python3Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(Python3Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#stmta}.
	 * @param ctx the parse tree
	 */
	void enterStmta(Python3Parser.StmtaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#stmta}.
	 * @param ctx the parse tree
	 */
	void exitStmta(Python3Parser.StmtaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(Python3Parser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(Python3Parser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#simple_stmta}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmta(Python3Parser.Simple_stmtaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#simple_stmta}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmta(Python3Parser.Simple_stmtaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(Python3Parser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(Python3Parser.SemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(Python3Parser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(Python3Parser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(Python3Parser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(Python3Parser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#expr_stmta}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmta(Python3Parser.Expr_stmtaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#expr_stmta}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmta(Python3Parser.Expr_stmtaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#expr_stmtb}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmtb(Python3Parser.Expr_stmtbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#expr_stmtb}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmtb(Python3Parser.Expr_stmtbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#expr_stmtc}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmtc(Python3Parser.Expr_stmtcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#expr_stmtc}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmtc(Python3Parser.Expr_stmtcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#expr_stmtd}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmtd(Python3Parser.Expr_stmtdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#expr_stmtd}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmtd(Python3Parser.Expr_stmtdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(Python3Parser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(Python3Parser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#testlist_star_expra}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expra(Python3Parser.Testlist_star_expraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#testlist_star_expra}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expra(Python3Parser.Testlist_star_expraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#testlist_star_exprb}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_exprb(Python3Parser.Testlist_star_exprbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#testlist_star_exprb}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_exprb(Python3Parser.Testlist_star_exprbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#com}.
	 * @param ctx the parse tree
	 */
	void enterCom(Python3Parser.ComContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#com}.
	 * @param ctx the parse tree
	 */
	void exitCom(Python3Parser.ComContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(Python3Parser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(Python3Parser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(Python3Parser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(Python3Parser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(Python3Parser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(Python3Parser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(Python3Parser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(Python3Parser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(Python3Parser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(Python3Parser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(Python3Parser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(Python3Parser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(Python3Parser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(Python3Parser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#return_stmta}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmta(Python3Parser.Return_stmtaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#return_stmta}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmta(Python3Parser.Return_stmtaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYield_stmt(Python3Parser.Yield_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYield_stmt(Python3Parser.Yield_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(Python3Parser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(Python3Parser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#raise_stmtb}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmtb(Python3Parser.Raise_stmtbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#raise_stmtb}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmtb(Python3Parser.Raise_stmtbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#raise_stmtc}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmtc(Python3Parser.Raise_stmtcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#raise_stmtc}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmtc(Python3Parser.Raise_stmtcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(Python3Parser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(Python3Parser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(Python3Parser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(Python3Parser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(Python3Parser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(Python3Parser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_frome}.
	 * @param ctx the parse tree
	 */
	void enterImport_frome(Python3Parser.Import_fromeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_frome}.
	 * @param ctx the parse tree
	 */
	void exitImport_frome(Python3Parser.Import_fromeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#starra}.
	 * @param ctx the parse tree
	 */
	void enterStarra(Python3Parser.StarraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#starra}.
	 * @param ctx the parse tree
	 */
	void exitStarra(Python3Parser.StarraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_froma}.
	 * @param ctx the parse tree
	 */
	void enterImport_froma(Python3Parser.Import_fromaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_froma}.
	 * @param ctx the parse tree
	 */
	void exitImport_froma(Python3Parser.Import_fromaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_fromb}.
	 * @param ctx the parse tree
	 */
	void enterImport_fromb(Python3Parser.Import_frombContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_fromb}.
	 * @param ctx the parse tree
	 */
	void exitImport_fromb(Python3Parser.Import_frombContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_fromc}.
	 * @param ctx the parse tree
	 */
	void enterImport_fromc(Python3Parser.Import_fromcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_fromc}.
	 * @param ctx the parse tree
	 */
	void exitImport_fromc(Python3Parser.Import_fromcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_fromd}.
	 * @param ctx the parse tree
	 */
	void enterImport_fromd(Python3Parser.Import_fromdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_fromd}.
	 * @param ctx the parse tree
	 */
	void exitImport_fromd(Python3Parser.Import_fromdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(Python3Parser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(Python3Parser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_as_namea}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_namea(Python3Parser.Import_as_nameaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_as_namea}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_namea(Python3Parser.Import_as_nameaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(Python3Parser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(Python3Parser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(Python3Parser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(Python3Parser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_as_namesa}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_namesa(Python3Parser.Import_as_namesaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_as_namesa}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_namesa(Python3Parser.Import_as_namesaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(Python3Parser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(Python3Parser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dotted_as_namesa}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_namesa(Python3Parser.Dotted_as_namesaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dotted_as_namesa}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_namesa(Python3Parser.Dotted_as_namesaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(Python3Parser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(Python3Parser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dotted_namea}.
	 * @param ctx the parse tree
	 */
	void enterDotted_namea(Python3Parser.Dotted_nameaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dotted_namea}.
	 * @param ctx the parse tree
	 */
	void exitDotted_namea(Python3Parser.Dotted_nameaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(Python3Parser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(Python3Parser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#global_stmta}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmta(Python3Parser.Global_stmtaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#global_stmta}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmta(Python3Parser.Global_stmtaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(Python3Parser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(Python3Parser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(Python3Parser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(Python3Parser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#assert_stmta}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmta(Python3Parser.Assert_stmtaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#assert_stmta}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmta(Python3Parser.Assert_stmtaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(Python3Parser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(Python3Parser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(Python3Parser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(Python3Parser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#if_stmta}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmta(Python3Parser.If_stmtaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#if_stmta}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmta(Python3Parser.If_stmtaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(Python3Parser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(Python3Parser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(Python3Parser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(Python3Parser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#for_stmta}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmta(Python3Parser.For_stmtaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#for_stmta}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmta(Python3Parser.For_stmtaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(Python3Parser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(Python3Parser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#try_stmta}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmta(Python3Parser.Try_stmtaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#try_stmta}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmta(Python3Parser.Try_stmtaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#try_stmtb}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmtb(Python3Parser.Try_stmtbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#try_stmtb}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmtb(Python3Parser.Try_stmtbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(Python3Parser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(Python3Parser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#with_stmta}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmta(Python3Parser.With_stmtaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#with_stmta}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmta(Python3Parser.With_stmtaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(Python3Parser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(Python3Parser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#with_itema}.
	 * @param ctx the parse tree
	 */
	void enterWith_itema(Python3Parser.With_itemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#with_itema}.
	 * @param ctx the parse tree
	 */
	void exitWith_itema(Python3Parser.With_itemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(Python3Parser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(Python3Parser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#except_clausea}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clausea(Python3Parser.Except_clauseaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#except_clausea}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clausea(Python3Parser.Except_clauseaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#except_clauseb}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clauseb(Python3Parser.Except_clausebContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#except_clauseb}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clauseb(Python3Parser.Except_clausebContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(Python3Parser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(Python3Parser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#newy}.
	 * @param ctx the parse tree
	 */
	void enterNewy(Python3Parser.NewyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#newy}.
	 * @param ctx the parse tree
	 */
	void exitNewy(Python3Parser.NewyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#suitea}.
	 * @param ctx the parse tree
	 */
	void enterSuitea(Python3Parser.SuiteaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#suitea}.
	 * @param ctx the parse tree
	 */
	void exitSuitea(Python3Parser.SuiteaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#indenta}.
	 * @param ctx the parse tree
	 */
	void enterIndenta(Python3Parser.IndentaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#indenta}.
	 * @param ctx the parse tree
	 */
	void exitIndenta(Python3Parser.IndentaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dedenta}.
	 * @param ctx the parse tree
	 */
	void enterDedenta(Python3Parser.DedentaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dedenta}.
	 * @param ctx the parse tree
	 */
	void exitDedenta(Python3Parser.DedentaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(Python3Parser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(Python3Parser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#testa}.
	 * @param ctx the parse tree
	 */
	void enterTesta(Python3Parser.TestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#testa}.
	 * @param ctx the parse tree
	 */
	void exitTesta(Python3Parser.TestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void enterTest_nocond(Python3Parser.Test_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void exitTest_nocond(Python3Parser.Test_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#lambdef}.
	 * @param ctx the parse tree
	 */
	void enterLambdef(Python3Parser.LambdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#lambdef}.
	 * @param ctx the parse tree
	 */
	void exitLambdef(Python3Parser.LambdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#lambdefa}.
	 * @param ctx the parse tree
	 */
	void enterLambdefa(Python3Parser.LambdefaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#lambdefa}.
	 * @param ctx the parse tree
	 */
	void exitLambdefa(Python3Parser.LambdefaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void enterLambdef_nocond(Python3Parser.Lambdef_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void exitLambdef_nocond(Python3Parser.Lambdef_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(Python3Parser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(Python3Parser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#or_testa}.
	 * @param ctx the parse tree
	 */
	void enterOr_testa(Python3Parser.Or_testaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#or_testa}.
	 * @param ctx the parse tree
	 */
	void exitOr_testa(Python3Parser.Or_testaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(Python3Parser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(Python3Parser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#and_testa}.
	 * @param ctx the parse tree
	 */
	void enterAnd_testa(Python3Parser.And_testaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#and_testa}.
	 * @param ctx the parse tree
	 */
	void exitAnd_testa(Python3Parser.And_testaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(Python3Parser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(Python3Parser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(Python3Parser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(Python3Parser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comparisona}.
	 * @param ctx the parse tree
	 */
	void enterComparisona(Python3Parser.ComparisonaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comparisona}.
	 * @param ctx the parse tree
	 */
	void exitComparisona(Python3Parser.ComparisonaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(Python3Parser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(Python3Parser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(Python3Parser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(Python3Parser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#star_expra}.
	 * @param ctx the parse tree
	 */
	void enterStar_expra(Python3Parser.Star_expraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#star_expra}.
	 * @param ctx the parse tree
	 */
	void exitStar_expra(Python3Parser.Star_expraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Python3Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Python3Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#expra}.
	 * @param ctx the parse tree
	 */
	void enterExpra(Python3Parser.ExpraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#expra}.
	 * @param ctx the parse tree
	 */
	void exitExpra(Python3Parser.ExpraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(Python3Parser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(Python3Parser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#xor_expra}.
	 * @param ctx the parse tree
	 */
	void enterXor_expra(Python3Parser.Xor_expraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#xor_expra}.
	 * @param ctx the parse tree
	 */
	void exitXor_expra(Python3Parser.Xor_expraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(Python3Parser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(Python3Parser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#and_expra}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expra(Python3Parser.And_expraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#and_expra}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expra(Python3Parser.And_expraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(Python3Parser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(Python3Parser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#shift_expra}.
	 * @param ctx the parse tree
	 */
	void enterShift_expra(Python3Parser.Shift_expraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#shift_expra}.
	 * @param ctx the parse tree
	 */
	void exitShift_expra(Python3Parser.Shift_expraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#shift_exprb}.
	 * @param ctx the parse tree
	 */
	void enterShift_exprb(Python3Parser.Shift_exprbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#shift_exprb}.
	 * @param ctx the parse tree
	 */
	void exitShift_exprb(Python3Parser.Shift_exprbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(Python3Parser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(Python3Parser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#arith_expra}.
	 * @param ctx the parse tree
	 */
	void enterArith_expra(Python3Parser.Arith_expraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#arith_expra}.
	 * @param ctx the parse tree
	 */
	void exitArith_expra(Python3Parser.Arith_expraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#arith_exprb}.
	 * @param ctx the parse tree
	 */
	void enterArith_exprb(Python3Parser.Arith_exprbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#arith_exprb}.
	 * @param ctx the parse tree
	 */
	void exitArith_exprb(Python3Parser.Arith_exprbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Python3Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Python3Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#terma}.
	 * @param ctx the parse tree
	 */
	void enterTerma(Python3Parser.TermaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#terma}.
	 * @param ctx the parse tree
	 */
	void exitTerma(Python3Parser.TermaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#termb}.
	 * @param ctx the parse tree
	 */
	void enterTermb(Python3Parser.TermbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#termb}.
	 * @param ctx the parse tree
	 */
	void exitTermb(Python3Parser.TermbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(Python3Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(Python3Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(Python3Parser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(Python3Parser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#powera}.
	 * @param ctx the parse tree
	 */
	void enterPowera(Python3Parser.PoweraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#powera}.
	 * @param ctx the parse tree
	 */
	void exitPowera(Python3Parser.PoweraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#powerb}.
	 * @param ctx the parse tree
	 */
	void enterPowerb(Python3Parser.PowerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#powerb}.
	 * @param ctx the parse tree
	 */
	void exitPowerb(Python3Parser.PowerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(Python3Parser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(Python3Parser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#atoma}.
	 * @param ctx the parse tree
	 */
	void enterAtoma(Python3Parser.AtomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#atoma}.
	 * @param ctx the parse tree
	 */
	void exitAtoma(Python3Parser.AtomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#atomb}.
	 * @param ctx the parse tree
	 */
	void enterAtomb(Python3Parser.AtombContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#atomb}.
	 * @param ctx the parse tree
	 */
	void exitAtomb(Python3Parser.AtombContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#atomc}.
	 * @param ctx the parse tree
	 */
	void enterAtomc(Python3Parser.AtomcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#atomc}.
	 * @param ctx the parse tree
	 */
	void exitAtomc(Python3Parser.AtomcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#atomd}.
	 * @param ctx the parse tree
	 */
	void enterAtomd(Python3Parser.AtomdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#atomd}.
	 * @param ctx the parse tree
	 */
	void exitAtomd(Python3Parser.AtomdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(Python3Parser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(Python3Parser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#testlist_compa}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_compa(Python3Parser.Testlist_compaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#testlist_compa}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_compa(Python3Parser.Testlist_compaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#testlist_compb}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_compb(Python3Parser.Testlist_compbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#testlist_compb}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_compb(Python3Parser.Testlist_compbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(Python3Parser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(Python3Parser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#trailera}.
	 * @param ctx the parse tree
	 */
	void enterTrailera(Python3Parser.TraileraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#trailera}.
	 * @param ctx the parse tree
	 */
	void exitTrailera(Python3Parser.TraileraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(Python3Parser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(Python3Parser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#subscriptlista}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlista(Python3Parser.SubscriptlistaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#subscriptlista}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlista(Python3Parser.SubscriptlistaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(Python3Parser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(Python3Parser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#subscripta}.
	 * @param ctx the parse tree
	 */
	void enterSubscripta(Python3Parser.SubscriptaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#subscripta}.
	 * @param ctx the parse tree
	 */
	void exitSubscripta(Python3Parser.SubscriptaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#subscriptb}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptb(Python3Parser.SubscriptbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#subscriptb}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptb(Python3Parser.SubscriptbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#sliceop}.
	 * @param ctx the parse tree
	 */
	void enterSliceop(Python3Parser.SliceopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#sliceop}.
	 * @param ctx the parse tree
	 */
	void exitSliceop(Python3Parser.SliceopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(Python3Parser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(Python3Parser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#exprlista}.
	 * @param ctx the parse tree
	 */
	void enterExprlista(Python3Parser.ExprlistaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#exprlista}.
	 * @param ctx the parse tree
	 */
	void exitExprlista(Python3Parser.ExprlistaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(Python3Parser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(Python3Parser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#testlista}.
	 * @param ctx the parse tree
	 */
	void enterTestlista(Python3Parser.TestlistaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#testlista}.
	 * @param ctx the parse tree
	 */
	void exitTestlista(Python3Parser.TestlistaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmaker(Python3Parser.DictorsetmakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmaker(Python3Parser.DictorsetmakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dictorsetmakera}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmakera(Python3Parser.DictorsetmakeraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dictorsetmakera}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmakera(Python3Parser.DictorsetmakeraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dictorsetmakerb}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmakerb(Python3Parser.DictorsetmakerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dictorsetmakerb}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmakerb(Python3Parser.DictorsetmakerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dictorsetmakerc}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmakerc(Python3Parser.DictorsetmakercContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dictorsetmakerc}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmakerc(Python3Parser.DictorsetmakercContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(Python3Parser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(Python3Parser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#classdefa}.
	 * @param ctx the parse tree
	 */
	void enterClassdefa(Python3Parser.ClassdefaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#classdefa}.
	 * @param ctx the parse tree
	 */
	void exitClassdefa(Python3Parser.ClassdefaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#classdefb}.
	 * @param ctx the parse tree
	 */
	void enterClassdefb(Python3Parser.ClassdefbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#classdefb}.
	 * @param ctx the parse tree
	 */
	void exitClassdefb(Python3Parser.ClassdefbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(Python3Parser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(Python3Parser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#arglista}.
	 * @param ctx the parse tree
	 */
	void enterArglista(Python3Parser.ArglistaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#arglista}.
	 * @param ctx the parse tree
	 */
	void exitArglista(Python3Parser.ArglistaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#arglistb}.
	 * @param ctx the parse tree
	 */
	void enterArglistb(Python3Parser.ArglistbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#arglistb}.
	 * @param ctx the parse tree
	 */
	void exitArglistb(Python3Parser.ArglistbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#arglistc}.
	 * @param ctx the parse tree
	 */
	void enterArglistc(Python3Parser.ArglistcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#arglistc}.
	 * @param ctx the parse tree
	 */
	void exitArglistc(Python3Parser.ArglistcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#arglistd}.
	 * @param ctx the parse tree
	 */
	void enterArglistd(Python3Parser.ArglistdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#arglistd}.
	 * @param ctx the parse tree
	 */
	void exitArglistd(Python3Parser.ArglistdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(Python3Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(Python3Parser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#argumenta}.
	 * @param ctx the parse tree
	 */
	void enterArgumenta(Python3Parser.ArgumentaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#argumenta}.
	 * @param ctx the parse tree
	 */
	void exitArgumenta(Python3Parser.ArgumentaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterComp_iter(Python3Parser.Comp_iterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitComp_iter(Python3Parser.Comp_iterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(Python3Parser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(Python3Parser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comp_fora}.
	 * @param ctx the parse tree
	 */
	void enterComp_fora(Python3Parser.Comp_foraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comp_fora}.
	 * @param ctx the parse tree
	 */
	void exitComp_fora(Python3Parser.Comp_foraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comp_if}.
	 * @param ctx the parse tree
	 */
	void enterComp_if(Python3Parser.Comp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comp_if}.
	 * @param ctx the parse tree
	 */
	void exitComp_if(Python3Parser.Comp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield_expr(Python3Parser.Yield_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield_expr(Python3Parser.Yield_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#yield_expra}.
	 * @param ctx the parse tree
	 */
	void enterYield_expra(Python3Parser.Yield_expraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#yield_expra}.
	 * @param ctx the parse tree
	 */
	void exitYield_expra(Python3Parser.Yield_expraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void enterYield_arg(Python3Parser.Yield_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void exitYield_arg(Python3Parser.Yield_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(Python3Parser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(Python3Parser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Python3Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Python3Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(Python3Parser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(Python3Parser.IntegerContext ctx);
}