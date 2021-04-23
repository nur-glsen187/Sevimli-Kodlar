package com.mygdx.OyunNesnesi;

import java.awt.geom.Arc2D.Float;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.imageloader.ResimEkleme;

public class Oyuncu implements OyunNesnesi {
	private float xKord;
	private float yKord;
	private float width;
	private float height;
	private float speed;
	private float acceleration;
	private int maxSpeed,minSpeed;
	private boolean left=false,right=false,down=false,up=false;
	

	public Oyuncu(float xKord,float yKord,float width,float height){
		this.xKord=xKord;
		this.yKord=yKord;
		this.width=width;
		this.height=height;
		speed=3;
		maxSpeed=12;
		minSpeed=0;
		
		
	}
	public void render(SpriteBatch sb) {
		sb.begin();
		sb.draw(ResimEkleme.textReg, xKord, yKord, width, height);
		sb.end();
		
		
	}


	public void update(float delta) {
	
		move();
	}
	public void move() {
		if(left) {
			xKord-=speed;
		}
		if(right) {
			xKord+=speed;
		}
		if(down) {
			yKord+=speed;
		}
		if(up) {
			yKord-=speed;
		}
	}
	public void stop(){
		left=false;
		right=false;
		up=false;
		down=false;
	}
	
	public boolean isLeft() {
		return left;
	}
	public void setLeft(boolean left) {
		this.left = left;
	}
	public boolean isRight() {
		return right;
	}
	public void setRight(boolean right) {
		this.right = right;
	}
	public boolean isDown() {
		return down;
	}
	public void setDown(boolean down) {
		this.down = down;
	}
	public boolean isUp() {
		return up;
	}
	public void setUp(boolean up) {
		this.up = up;
	}
    
}
