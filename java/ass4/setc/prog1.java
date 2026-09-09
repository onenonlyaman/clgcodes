import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

class prog1 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");

        System.out.println("Display using Iterator:");
        Iterator<String> itr = colors.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Display in reverse order using ListIterator:");
        ListIterator<String> litr = colors.listIterator(colors.size());
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }

        LinkedList<String> newColors = new LinkedList<>();
        newColors.add("pink");
        newColors.add("green");

        int index = colors.indexOf("yellow");
        colors.addAll(index, newColors);

        System.out.println("After inserting pink and green between blue and yellow:");
        System.out.println(colors);
    }
}
