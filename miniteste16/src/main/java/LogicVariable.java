public class LogicVariable {
    private String name;
    private boolean value = true;
    private LogicGate logicGate = null;

    public LogicVariable(String name) {
        this.name = name;
    }

    public LogicVariable(String name, boolean value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public boolean getValue() {

        if (logicGate != null)
            logicGate.updateValue();

        return value;
    }

    public void setValue(boolean value) {

        this.value = value;
    }

    public void setLogicGate(LogicGate logicGate)
    {
        this.logicGate = logicGate;
    }

    public LogicGate getCalculatedBy()
    {
        return this.logicGate;
    }

    public String getFormula()
    {
        if(this.logicGate == null)
            return name;

        return logicGate.getFormula();
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null) return false;

        if (getClass() != o.getClass())
            return false;

        LogicVariable p = (LogicVariable) o;

        return name.equals(p.getName());

    }
}
