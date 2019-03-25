import java.util.ArrayList;
import java.util.List;

public class StringTransformerGroup implements StringTransformer{

    List<StringTransformer> transformers = new ArrayList<>();

    public StringTransformerGroup(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    @Override
    public void execute() {

        for(int i = 0; i < transformers.size(); i++)
        {

            transformers.get(i).execute();
        }

    }
}
