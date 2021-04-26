//___Escriba una funcion que reciba una pila de Strings y dos palabras. La primera palabra a recibir será considerada como nueva y la segunda palabra como vieja, reemplace todas las coincidencias de la palabra vieja por la palabra nueva en la pila
//EJEMPLO (ENTRADA): ({"Zelda","Mario","Metroid","Megaman"},"Zelda","Link")
//EJEMPLO (SALIDA):({"Link","Mario","Metroid","Megaman"})
package pila;

import java.util.Stack;

public class PilaMain {
public static final Pila p1 = new Pila("Zelda");
public static final Pila p2 = new Pila("Mario");
public static final Pila p3 = new Pila("Metroid");
public static final Pila p4 = new Pila("Megaman");
public static final Pila reemplazar = new Pila("Zelda", "Link");

  public static void main(String[] args) {
   Pila pila = new Pila();
   Stack<Pila>elemento = new Stack();
  elemento.push(p1);
  elemento.push(p2);
  elemento.push(p3);
  elemento.push(p4);
  pila.mostrar(elemento,reemplazar);
  pila.reemplazar_elemento(elemento,reemplazar);
  }
}
