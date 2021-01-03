package com.mygdx.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.OyunNesnesi.Oyuncu;
import com.mygdx.girisHandle.OyunDurumInput;
import com.mygdx.imageloader.ResimEkleme;

public class OyunDurum extends durum {
	
	
	
	private Oyuncu oyuncu;
	public OyunDurum(){
		oyuncu= new Oyuncu(100,100,50,50);
		Gdx.input.setInputProcessor(new OyunDurumInput());
		
	}

	
	public void render(SpriteBatch sb) {
		
		sb.setProjectionMatrix(camera.combined);
		oyuncu.render(sb);
		
	}

	
	public void update(float delta) {
		oyuncu.update(delta);
		
		
	}


	
	public void handleGiris() {
		
		}
		
	}


