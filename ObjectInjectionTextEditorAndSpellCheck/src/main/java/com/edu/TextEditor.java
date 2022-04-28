package com.edu;

public class TextEditor {
	
	private SpellCheck scob;
	
	

	public TextEditor(SpellCheck scob) {
		
		super();
		System.out.println("Constructor calling");
		this.scob = scob;
	}

	public SpellCheck getScob() {
		
		return scob;
	}

	public void setScob(SpellCheck scob) {
		this.scob = scob;
	}
	
	public void textEditorFunction()
	{
		if(scob!=null)
		{
			scob.spellCheckDisplay();
		}
		else
		{
			System.out.println("Spell Check is Disabled");
			
		}
	}
	
	

}
