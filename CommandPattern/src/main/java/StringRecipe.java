import java.util.ArrayList;
import java.util.List;

public class StringRecipe {
    List<StringTransformer> transformers = new ArrayList<>();

    public StringRecipe(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    public void mix() {


        for(int i = 0; i < transformers.size(); i++)
        {
            transformers.get(i).execute();
        }
    }
}
