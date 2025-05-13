package com.ibm.spring;

public class TextEditor {
	private SpellChecker spellChecker;
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside Text Box");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
