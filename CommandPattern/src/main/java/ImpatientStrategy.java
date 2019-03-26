public class ImpatientStrategy implements OrderingStrategy {
    @Override
    public void wants(StringRecipe recipe, StringBar bar) {
        recipe.mix();
    }

    @Override
    public void happyHourStarted(StringBar bar) {

    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
