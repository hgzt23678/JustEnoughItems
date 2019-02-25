package mezz.jei.api.gui;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.recipe.category.IRecipeCategory;

/**
 * An animated {@link IDrawable}, useful for showing a gui animation like furnace flames or progress arrows.
 * Useful for drawing miscellaneous things in {@link IRecipeCategory#draw(Object, double, double)}.
 *
 * To create an instance, use {@link IGuiHelper#createAnimatedDrawable(IDrawableStatic, int, StartDirection, boolean)}.
 * Internally, these use an {@link ITickTimer} to simulate tick-driven animations.
 */
public interface IDrawableAnimated extends IDrawable {
	/**
	 * The direction that the animation starts from.
	 *
	 * @see IGuiHelper#createAnimatedDrawable(IDrawableStatic, int, StartDirection, boolean)
	 */
	enum StartDirection {
		TOP, BOTTOM, LEFT, RIGHT
	}
}