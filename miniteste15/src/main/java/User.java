public class User {

    String name;

    public User(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;

        if (o == null) return false;

        if (getClass() != o.getClass()) return false;

        User p = (User) o;
        return name == p.getName();
    }
}
