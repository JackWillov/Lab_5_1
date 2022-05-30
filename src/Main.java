import ToothPasteEx1.ToothPasteEx1;
import ToothPasteEx2.ToothPasteEx2;

public class Main {
    public static void main(String[] args) {



        ToothPasteEx2 toothPasteEx2 = new ToothPasteEx2();

        String str = "String ob";
        int x = 21;

        toothPasteEx2.printObAndType(str,x);

        System.out.println(toothPasteEx2.returnAloneOb("alone ob"));
    }
}
