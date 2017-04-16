package edu.minnstate.go.go1375rs.jbrandesex3a;
import java.text.DecimalFormat;

/**
 * Created by go137 on 4/15/2017.
 */

public class Loops {
    private int max;

    public Loops(int max) {
        this.max = max;
    }

    public String whileLoop() {
        DecimalFormat fmt = new DecimalFormat("  00");
        StringBuilder output = new StringBuilder("While Loop\nCount\tSum\n=====\t=====\n");
        int i = 1, total = 0;

        while (i <= max)		{
            total += i;
            output.append(fmt.format(i)); output.append('\t');
            output.append(fmt.format(total)); output.append('\n');
            i++;
        }
        return output.toString();
    }

    public String doWhileLoop() {
        DecimalFormat fmt = new DecimalFormat("  00");
        StringBuilder output = new StringBuilder("Do While Loop\nCount\tSum\n=====\t=====\n");
        int i = 1, total = 0;

        do {
            total += i;
            output.append(fmt.format(i)); output.append('\t');
            output.append(fmt.format(total)); output.append('\n');
            i++;
        }
        while (i <= max);
        return output.toString();
    }

    public String forLoop(){
        DecimalFormat fmt = new DecimalFormat("  00");
        StringBuilder output = new StringBuilder("For Loop\nCount\tSum\n=====\t=====\n");
        int total = 0;
        for(int i = 1; i < max; i++){
            total += i;
            output.append(fmt.format(i)); output.append('\t');
            output.append(fmt.format(total)); output.append('\n');
        }
        return output.toString();

    }
}
