public class Fifth { 

    public static void main(String[] args) { 

    var textBox1 = new textBox(); // textBox textBox1 = new textBox(); we could use it like that, but the var recognizes what is after the '=' and simplify the code.
    textBox1.setText("BOX 1");
    System.out.println(textBox1.text);

    var textBox2 = new textBox(); //textBox() is allocated in the heap, while textBox1 and 2, are allocated in the stack.
    textBox2.setText("Box 2");
    System.out.println(textBox2.text);

    }

}