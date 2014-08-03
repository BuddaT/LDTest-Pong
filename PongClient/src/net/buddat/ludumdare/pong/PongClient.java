package net.buddat.ludumdare.pong;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import net.buddat.ludumdare.pong.shared.Constants;

public class PongClient extends BasicGame {

	public PongClient(String title) {
		super(title);
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		try {
            AppGameContainer app = new AppGameContainer(new PongClient(Constants.NAME));
            app.setShowFPS(true);
            app.setTargetFrameRate(120);
            app.setDisplayMode(800, 600, false);
            app.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
	}
}
