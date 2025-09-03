package Unit3;
import java.util.*;
public class Arraylist03 {
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of products");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            product.add(sc.next());
        }
        Iterator itr=product.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        product.addFirst("Litchi");
        product.addLast("apple");
        product.add(3,"mango");
        System.out.println();
        Collections.sort(product);
        System.out.println(product);
        System.out.println(product.getFirst());
        System.out.println(product.getLast());
        System.out.println(product.get(3));
    }
}
