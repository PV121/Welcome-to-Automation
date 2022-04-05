import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Scrum");
        list.add("Java");
        list.add("Jira");
        list.add("Seenium");
        list.add("Cucumber");
        list.add("Postman");
        list.add("Rest Assured");

        for ( String a :list ){


            System.out.println(a);
        }
    }
}
