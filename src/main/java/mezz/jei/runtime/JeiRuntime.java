package mezz.jei.runtime;

import mezz.jei.api.IIngredientFilter;
import mezz.jei.api.IJeiRuntime;
import mezz.jei.api.ingredients.IIngredientManager;
import mezz.jei.gui.overlay.IngredientListOverlay;
import mezz.jei.gui.recipes.RecipesGui;
import mezz.jei.recipes.RecipeManager;

public class JeiRuntime implements IJeiRuntime {

	private final RecipeManager recipeManager;
	private final IngredientListOverlay ingredientListOverlay;
	private final RecipesGui recipesGui;
	private final IIngredientFilter ingredientFilter;
	private final IIngredientManager ingredientManager;

	public JeiRuntime(RecipeManager recipeManager, IngredientListOverlay ingredientListOverlay, RecipesGui recipesGui, IIngredientFilter ingredientFilter, IIngredientManager ingredientManager) {
		this.recipeManager = recipeManager;
		this.ingredientListOverlay = ingredientListOverlay;
		this.recipesGui = recipesGui;
		this.ingredientFilter = ingredientFilter;
		this.ingredientManager = ingredientManager;
	}

	public void close() {
		this.recipesGui.close();
	}

	@Override
	public RecipeManager getRecipeManager() {
		return recipeManager;
	}

	@Override
	public IIngredientFilter getIngredientFilter() {
		return ingredientFilter;
	}

	@Override
	public IngredientListOverlay getIngredientListOverlay() {
		return ingredientListOverlay;
	}

	@Override
	public IIngredientManager getIngredientManager() {
		return ingredientManager;
	}

	@Override
	public RecipesGui getRecipesGui() {
		return recipesGui;
	}
}