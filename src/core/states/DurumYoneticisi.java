package com.mygdx.states;

import java.util.Stack;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class DurumYoneticisi {
	private Stack<durum> states;
	public DurumYoneticisi() 
	{
		states=new Stack<durum>();
		
		
	}
	public void render(SpriteBatch sb) {
		states.peek().render(sb);
		
	}
	public void update(float delta) {
		states.peek().update(delta);
		states.peek().handleGiris();
		
	}
	public void pushState(durum state) {
		states.push(state);
		
	}
	public void popState() {
		states.pop();
	}
}
