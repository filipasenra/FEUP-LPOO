public class StringInverter implements StringTransformer {

    StringDrink drink;

    public StringInverter(StringDrink drink) {
        this.drink = drink;
    }

    @Override
    public void execute() {

        drink.setText(new StringBuilder(drink.getText()).reverse().toString());
    }

}
