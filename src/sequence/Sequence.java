package sequence;

public class Sequence {

    private int[] args;

    public int next() {
        int next = this.args[0];
        int[] newArgs = new int[this.args.length - 1];
        System.arraycopy(args, 1, newArgs, 0, this.args.length - 1);
        this.args = newArgs;
        return next;
    }

    public static void main(String[] args) {
        // ch3: ex 4
        IntSequence seq = IntSequence.of(3, 4, 5, 6);
        while (seq.hasNext())
            System.out.print(seq.next() + " ");

        System.out.println("\n" + "*********************");

        // ch3: ex 5
        IntSequence constant = IntSequence.constant(1);
        int iterator = 0;
        while (iterator < 20){
            System.out.print(constant.next() + " ");
            iterator++;
        }
    }
}
