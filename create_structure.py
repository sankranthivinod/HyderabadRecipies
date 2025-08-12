import os

# Define the base root directory where your Kotlin files reside
base_dir = os.path.join("app", "src", "main", "java", "com", "sankranthivinod", "hyderabadrecipies")

# List of file paths relative to base_dir
files = [
    "data/local/AppDatabase.kt",
    "data/local/dao/RecipeDao.kt",
    "data/local/entity/RecipeEntity.kt",
    "data/repository/RecipeRepository.kt",

    "domain/model/Recipe.kt",

    "ui/splash/SplashActivity.kt",
    "ui/splash/SplashViewModel.kt",
    "ui/dashboard/DashboardFragment.kt",
    "ui/dashboard/DashboardViewModel.kt",
    "ui/category/CategoryFragment.kt",
    "ui/category/CategoryViewModel.kt",
    "ui/recipeList/RecipeListFragment.kt",
    "ui/recipeList/RecipeListViewModel.kt",
    "ui/recipeDetail/RecipeDetailFragment.kt",
    "ui/recipeDetail/RecipeDetailViewModel.kt",
    "ui/components/RecipeItemView.kt",

    "utils/Constants.kt",
    "navigation/AppNavGraph.kt",
    "di/AppModule.kt",

    "MainActivity.kt",
    "HyderabadRecipesApp.kt"
]

# Create the files and folders under the base_dir
for relative_path in files:
    full_path = os.path.join(base_dir, relative_path)
    dir_path = os.path.dirname(full_path)
    if dir_path:
        os.makedirs(dir_path, exist_ok=True)
    with open(full_path, 'w') as f:
        f.write("")

print(f"✅ Folder and file structure created under: {base_dir}")
