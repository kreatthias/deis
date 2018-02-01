package de.feuerwehraumuehle.feuerwehrapp.config;

/**
 * Created by mmi on 01.02.2018.
 */

public class GlobalDefaults extends Configuration {

	public final int defaultButtonColor;
	public final int defaultTextColor;
	public final String defaultIcon;
	public final int defaultBackgroundColor;
	public final boolean randomizeAllButtonColors;

	public GlobalDefaults(int defaultButtonColor, int defaultTextColor, String defaultIcon, int
			defaultBackgroundColor, boolean randomizeAllButtonColors) {
		this.defaultButtonColor = defaultButtonColor;
		this.defaultTextColor = defaultTextColor;
		this.defaultIcon = defaultIcon;
		this.defaultBackgroundColor = defaultBackgroundColor;
		this.randomizeAllButtonColors = randomizeAllButtonColors;
	}
}
