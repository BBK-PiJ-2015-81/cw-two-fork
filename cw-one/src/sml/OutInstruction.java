package sml;

/**
 * Created by Tom on 07/04/2016.
 */
public class OutInstruction extends Instruction {
    private int register;

    public OutInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public OutInstruction(String label, int register) {
        super(label, "out");
        this.register = register;
    }

    public void execute(Machine m){
        System.out.println("The output of register "+register+" is: "+m.getRegisters().getRegister(register));
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register + " value is ";
    }
}
