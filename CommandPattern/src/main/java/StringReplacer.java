import static java.lang.Character.isLowerCase;

public class StringReplacer implements StringTransformer {

    StringDrink drink;
    char previous;
    char current;

    public StringReplacer(StringDrink drink, char previous, char current) {
        this.drink = drink;
        this.previous = previous;
        this.current = current;
    }

    @Override
    public void execute() {

        this.drink.setText(this.drink.getText().replace(previous, current));
    }
}
