package com.mygdx.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class durum {
	protected OrthographicCamera camera;
	
	public durum(){
		camera= new OrthographicCamera();
		camera.setToOrtho(true, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		
		
		
		
		
	}
	public abstract void render(SpriteBatch sb);
	public abstract void update(float delta);
	public abstract void handleGiris();
		
	
}
