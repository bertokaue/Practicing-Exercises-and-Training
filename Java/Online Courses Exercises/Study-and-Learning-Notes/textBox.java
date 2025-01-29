public class textBox {
    public String text = ""; //Field, must have some value because as a reference type if we just use String text; it will have NULL value, what can crash our program.

    public void setText(String text) {
        this.text = text;
    }

    public void clear(){ 
        text = "";
    }

}
