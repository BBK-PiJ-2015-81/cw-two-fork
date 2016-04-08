package sml;

import java.util.ArrayList;

/**
 * Created by Tom on 07/04/2016.
 */
public class BnzInstruction extends Instruction {
    private int register;
    private String nextIns;
    //private ArrayList<Instruction> program;
    //private Translator myTrans = new Translator();

    public BnzInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public BnzInstruction(String label, int register, String nextIns) {
        super(label, "out");
        this.register = register;
        this.nextIns = nextIns;
        //this.program = program;
    }

    public void execute(Machine m){
        ArrayList<Instruction> machineInstructions = m.getProg();
        if (m.getRegisters().getRegister(register) != 0) {
            for (int i = 0; i < machineInstructions.size(); i++) {
                Instruction x = machineInstructions.get(i);
                if (x.label.equals(nextIns)) {
                    m.setPc(i+1);
                    x.execute(m);
                }
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register + " value is ";
    }
}
