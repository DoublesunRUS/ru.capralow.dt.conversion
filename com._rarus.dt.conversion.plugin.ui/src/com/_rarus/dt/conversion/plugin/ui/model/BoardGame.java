package com._rarus.dt.conversion.plugin.ui.model;
public class BoardGame extends Model {
	
	public BoardGame(String title, String authorGivenName, String authorSirName) {
		super(title, authorGivenName, authorSirName);
	}
	
	
	
	
	
	
	/*
	 * @see Model#accept(ModelVisitorI, Object)
	 */
	public void accept(IModelVisitor visitor, Object passAlongArgument) {
		visitor.visitBoardgame(this, passAlongArgument);
	}

}
