package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class pausa extends ImputListener {
	
	Pausa pausar;
	boolean stop;
	pausa (Pausa p) {
		super ();
		pausar = p;
		stop =false;
	}
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
	stop = true;
	System.out.println("pausa precionada");
	return true;
}
}