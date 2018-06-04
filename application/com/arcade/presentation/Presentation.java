package com.arcade.presentation;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import com.game.Game;
import com.game.ctrl.CtrlFactory;
import com.game.deprecated.Drawable;

public enum Presentation implements Drawable
{
	/***/
	TRON("res/games/tron/tronbild.png", games.tron.Tron::new);

	private Image image;
	private GameConstructor	gameConstructor;

	private Presentation(final String path, final GameConstructor gameConstructor)
	{
		try
		{
			this.image = Toolkit.getDefaultToolkit().getImage(new File(path).toURI().toURL());
		}
		catch (final IOException e)
		{
			e.printStackTrace();
		}
		this.gameConstructor = gameConstructor;
	}

	@Override
	public void draw(final Graphics2D g)
	{
		g.drawImage(this.image, 0, 0, 1048, 1048, null);
	}

	public Game getGame(final CtrlFactory ctrlFactory)
	{
		return this.gameConstructor.newGame(ctrlFactory);
	}
}
