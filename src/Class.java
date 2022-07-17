public class Class {

    private String word;
    private int number;
    private int [] array;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        for (double a : array) {
            System.out.println(a);

        }
    }

    public Class(String word, int number, int[] array) {
        this.word = word;
        this.number = number;
        for (double a : array) {
            System.out.print(a + "  ");
        }
    }}

