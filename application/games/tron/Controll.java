package games.tron;

import java.awt.event.KeyEvent;

import com.game.Game;
import com.game.ctrl.KeyCtrl;
import com.game.deprecated.ProceedsInput;
import com.game.deprecated.Updateable;

public class Controll implements Updateable, ProceedsInput
{

	private final KeyCtrl	KEYS;
	private final Game		game;

	public Controll(final Game game, final KeyCtrl KEYS)
	{
		this.game = game;
		this.KEYS = KEYS;
	}

	@Override
	public void processInput()
	{
		if (this.KEYS.isPressed(KeyEvent.VK_ESCAPE))
		{
			System.exit(0);
		}
	}

	@Override
	public void update(final long elapsed)
	{
	}
}
