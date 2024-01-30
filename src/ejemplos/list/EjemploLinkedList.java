package ejemplos.list;

import ejemplos.set.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Alumno> ll = new LinkedList<>();
        System.out.println(ll + " , size: "+ ll.size());
        ll.add(new Alumno("JUAN", 5));
        ll.add(new Alumno("PEDRO", 8));
        ll.add(new Alumno("LUCIANO", 10));
        ll.add(new Alumno("BENJA", 4));
        ll.add(new Alumno("ALONSO", 6));


        System.out.println(ll + " , size: "+ ll.size());
        ll.addFirst(new Alumno("TORIBIO", 9));
        ll.addLast(new Alumno("SELINA", 4.5));

        System.out.println(ll + " , size: "+ ll.size());
        System.out.println("ll.getFirst() = " + ll.getFirst());
        System.out.println("ll.getLast() = " + ll.getLast());
        System.out.println("ll.get(2) = " + ll.get(2));
        // metodos similares a get last y get first = peekLast y peekFirst pero no lanza excepcion
        // para remover removeLast y removeFirst lanza excepcion // similar pop()
        // para remover sin lanzar excepcion pollLast o pollFirst
        // remove(alumno) elimina al alumno especificado
        // metodo indexOf(Objeto) para obtener el indice
        // set(indice, alumno) para reemplazar en la posicion de indice

        // List Iterator:
        ListIterator<Alumno> li = ll.listIterator();
        System.out.println("List iterator");
        while(li.hasNext()){
            System.out.println(li.next());
        }
        // como ahora el iterador esta en la ultima posicion volvemos hacia atras

        System.out.println("hacia atras");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
