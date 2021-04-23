package com.mygdx.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.OyunNesnesi.OyunDunya;
import com.mygdx.OyunNesnesi.Oyuncu;
import com.mygdx.girisHandle.OyunDurumInput;
import com.mygdx.imageloader.ResimEkleme;

public class OyunDurum extends durum {
	
	
	
	private OyunDunya od;
	
	
	public OyunDurum(){
		od=new OyunDunya();
		Gdx.input.setInputProcessor(new OyunDurumInput(this));
		
		
	}

	
	public void render(SpriteBatch sb) {
		
		sb.setProjectionMatrix(camera.combined);
		od.render(sb);
		
	}

	
	public void update(float delta) {
	
		od.update(delta);
		
	}


	
	public void handleGiris() {
		
		}
	public OyunDunya getOyunDunya() {
		return od;
		
	}
		
	}


