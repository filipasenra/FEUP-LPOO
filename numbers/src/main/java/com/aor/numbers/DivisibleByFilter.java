package com.aor.numbers;

public class DivisibleByFilter implements IListFilter{

    Integer denominator;

    public DivisibleByFilter(Integer number)
    {
        this.denominator = number;
    }

    @Override
    public boolean accept(Integer number) {
        return (number % this.denominator) == 0;
    }
}
