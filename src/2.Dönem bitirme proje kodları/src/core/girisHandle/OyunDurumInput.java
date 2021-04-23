package com.mygdx.girisHandle;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.mygdx.states.OyunDurum;

public class OyunDurumInput implements  InputProcessor{
 private OyunDurum oyundurum;
	public OyunDurumInput(OyunDurum oyundurum) {
		this.oyundurum=oyundurum;
		
	}
	public boolean keyDown(int keycode) {
		switch(keycode) {
		case Keys.A:
			oyundurum.getOyunDunya().getOyuncu().setLeft(true);
			break;
		case Keys.S:
			oyundurum.getOyunDunya().getOyuncu().setDown(true);
			break;
		case Keys.D:
			oyundurum.getOyunDunya().getOyuncu().setRight(true);
			break;
		case Keys.W:
		oyundurum.getOyunDunya().getOyuncu().setUp(true);
			break;
		default:
			break;
		}
		return false;
	
		
	}

	@Override
	public boolean keyUp(int keycode) {
		switch(keycode) {
		case Keys.A:
			oyundurum.getOyunDunya().getOyuncu().setLeft(false);
			break;
		case Keys.S:
			oyundurum.getOyunDunya().getOyuncu().setDown(false);
			break;
		case Keys.D:
			oyundurum.getOyunDunya().getOyuncu().setRight(false);
			break;
		case Keys.W:
		oyundurum.getOyunDunya().getOyuncu().setUp(false);
			break;
		default:
			break;
		}
		return false;
		
	}

	@Override
	public boolean keyTyped(char character) {
		
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		// TODO Auto-generated method stub
		return false;
	}

}
