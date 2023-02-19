import java.util.*;

public class Main {
    //I had to initialize it outside and so I could return them when using the StackAt function Under
    private static MyStack<String> Stack1 = new MyStack<>();
    private static MyStack<String> Stack2 = new MyStack<>();
    private static MyStack<String> Stack3 = new MyStack<>();
    private static MyStack<String> Stack4 = new MyStack<>();
    private static MyStack<String> Stack5 = new MyStack<>();
    private static MyStack<String> Stack6 = new MyStack<>();
    private static MyStack<String> Stack7 = new MyStack<>();
    private static MyStack<String> Stack8 = new MyStack<>();
    private static MyStack<String> Stack9 = new MyStack<>();

    public static void main(String[] args) throws StackOverflowException, StackUnderflowException {

        Stack1.push("N"); Stack1.push("C"); Stack1.push("R"); Stack1.push("T"); Stack1.push("M"); Stack1.push("Z"); Stack1.push("P");
        Stack2.push("D"); Stack2.push("N"); Stack2.push("T"); Stack2.push("S"); Stack2.push("B"); Stack2.push("Z");
        Stack3.push("M"); Stack3.push("H"); Stack3.push("Q"); Stack3.push("R"); Stack3.push("F"); Stack3.push("C"); Stack3.push("T"); Stack3.push("G");
        Stack4.push("G"); Stack4.push("R"); Stack4.push("Z");
        Stack5.push("Z"); Stack5.push("N"); Stack5.push("R"); Stack5.push("H");
        Stack6.push("F"); Stack6.push("H"); Stack6.push("S"); Stack6.push("W"); Stack6.push("P"); Stack6.push("Z"); Stack6.push("L"); Stack6.push("D");
        Stack7.push("W"); Stack7.push("D"); Stack7.push("Z"); Stack7.push("R"); Stack7.push("C"); Stack7.push("G"); Stack7.push("M");
        Stack8.push("S"); Stack8.push("J"); Stack8.push("F"); Stack8.push("L"); Stack8.push("H"); Stack8.push("W"); Stack8.push("Z"); Stack8.push("Q");
        Stack9.push("S"); Stack9.push("Q"); Stack9.push("P"); Stack9.push("W"); Stack9.push("N");

        //move 7 from 6 to 8

        //example
        String[] Instructions = {"move 2 from 4 to 5"};
        for(String s: Instructions){
            String[] parts = s.split(" ");
            int crateNum = Integer.parseInt(parts[1]);
            int fromStack = Integer.parseInt(parts[3]);
            int toStack = Integer.parseInt(parts[5]);

            String crate;
            for(int i = 0; i < crateNum; i++){
                crate = (StackAt(fromStack).pop());
                //might parse instead
                StackAt(toStack).push(String.valueOf(crate));
            }

        }

        System.out.println(Stack1.top()+ Stack2.top()+ Stack3.top()+ Stack4.top()+ Stack5.top()+ Stack6.top()+ Stack7.top()+ Stack8.top()+ Stack9.top() );

    }

    //method to help the Stack get to a given index
    private static MyStack<String> StackAt(int index){
        switch(index){
            case 1:
                return Stack1;
            case 2:
                return Stack2;
            case 3:
                return Stack3;
            case 4:
                return Stack4;
            case 5:
                return Stack5;
            case 6:
                return Stack6;
            case 7:
                return Stack7;
            case 8:
                return Stack8;
            default:
                return Stack9;

        }
    }





}
