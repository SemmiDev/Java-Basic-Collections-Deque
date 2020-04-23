package belajar;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        // natural ordering = dia akan memprioritaskan mana yg pertama yg harus show
        PriorityQueue<String> nama = new PriorityQueue<>();
        nama.add("Sammi Aldhiyanto");
        nama.add("Abdul Rauf");
        nama.offer("Mr sam clay");
        nama.offer("Sam Clay");

        // show data
        System.out.println(nama.peek());
        // hapus data
        System.out.println(nama.poll());

        // show data with method
        System.out.println(nama);

        Iterator show = nama.iterator();
        while(show.hasNext()){
            System.out.println(show.next());
        }

        nama.forEach((show2) -> {
            System.out.println(show2);
        });


    }
}
