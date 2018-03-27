package by.belstu.it.haiduk;

public class TextFunction {
    public String s;
    public int n;

    public String getValue()
    {
        return "Hello from First project";
    }

    public void deleteString()
    {
        System.out.print("Вызов функции deleteString");
        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }
    }

    public TextFunction() {
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

