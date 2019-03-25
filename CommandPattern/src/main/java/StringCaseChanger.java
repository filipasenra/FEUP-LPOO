import static java.lang.Character.isLowerCase;

public class StringCaseChanger implements StringTransformer {

    StringDrink drink;

    public StringCaseChanger(StringDrink drink) {
        this.drink = drink;
    }

    @Override
    public void execute() {

        StringBuilder myName = new StringBuilder(this.drink.getText());

        for(int i = 0; i < myName.length(); i++)
        {
            char a;

            if(isLowerCase(myName.charAt(i)))
            {
                a = Character.toUpperCase(myName.charAt(i));
            }
            else
            {
                a = Character.toLowerCase(myName.charAt(i));
            }

            myName.setCharAt(i, a);

        }

        this.drink.setText(myName.toString());
    }
}
