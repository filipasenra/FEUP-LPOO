public abstract  class LogicGate {

    protected LogicVariable output;
    protected LogicVariable[] inputs;

    public LogicVariable getOutput()
    {
        return this.output;
    }

    public LogicVariable[] getInputs() {
        return inputs;
    }

    abstract String getSymbol();

    abstract String getFormula();

    abstract void updateValue();
}
