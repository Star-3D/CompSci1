
/**
 * Write a description of class MysteryNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MysteryNumber{
    public static void main (String[]args){
        int mystery = 100;
        mystery += 50;
        --mystery;
        mystery *= 3;
        ++mystery;
        mystery /= 2;
        mystery += 15;
        mystery -= 6;
        ++mystery;
        mystery -= 5;
        mystery %= 10;
        mystery *= 100;
        mystery += 12;
        --mystery;
        System.out.println("The Mystery Number = " + mystery);
        }
}
