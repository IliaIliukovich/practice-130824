package lesson20241031;

public class Human {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void feedCat(Cat cat) {
        System.out.println("Human " + name + " feeds the cat " + cat.getName());
        cat.feed();
    }
    public void feedCat(Cat[] cats){
        for (Cat cat : cats) {
            feedCat(cat);
        }
    }
}
