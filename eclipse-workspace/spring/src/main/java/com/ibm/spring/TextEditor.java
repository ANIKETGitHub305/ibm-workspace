package com.ibm.spring;

public class TextEditor {
	private SpellChecker spellChecker;
	

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public TextEditor() {
		
	}
	
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("inside TextEDitor construct");
		this.spellChecker = spellChecker;
	}
	
	
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
