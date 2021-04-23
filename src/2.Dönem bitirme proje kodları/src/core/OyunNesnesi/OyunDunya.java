package com.mygdx.OyunNesnesi;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.MapLayer;

public class OyunDunya implements OyunNesnesi{
	
	private Oyuncu  player;
	public OyunDunya() {
		player=new Oyuncu(100,100,50,50);
	}
	
	

	@Override
	public void render(SpriteBatch sb) {
		
		player.render(sb);
		
	}

	@Override
	public void update(float delta) {
		player.update(delta);
		
	}
	
public Oyuncu getOyuncu()
 {
	return player;
	
	
}
	

}
