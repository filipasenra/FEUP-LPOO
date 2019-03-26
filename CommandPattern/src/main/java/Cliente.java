public interface Cliente extends BarObserver {
    void wants(StringRecipe recipe, StringBar bar);
}
