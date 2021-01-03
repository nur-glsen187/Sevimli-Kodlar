package com.mygdx.OyunNesnesi;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.imageloader.ResimEkleme;

public class Oyuncu implements OyunNesnesi {
	private float xKord;
	private float yKord;
	private float width;
	private float height;
	private float speed;
	private float acceleration;
	

	public Oyuncu(float xKord,float yKord,float width,float height){
		this.xKord=xKord;
		this.yKord=yKord;
		this.width=width;
		this.height=height;
		acceleration=1;
		speed=0;
		
		
		
	}
	public void render(SpriteBatch sb) {
		sb.begin();
		sb.draw(ResimEkleme.textReg, xKord, yKord, width, height);
		sb.end();
		
		
	}


	public void update(float delta) {
	speed+=acceleration;
	yKord+=speed;
		
	}

}
