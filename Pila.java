package pila;

import java.util.Stack;

public class Pila {

private String pila;
private String nueva;
private String vieja;

public Pila(String pila){
  this.pila = pila;
}
public Pila(String nueva, String vieja){
  this.nueva = nueva;
  this.vieja = vieja;
}
public Pila(){
}
public String getPila(){
  return pila;
}
public void setPila(String pila){
  this.pila = pila;
}
public String getNueva(){
  return nueva;
}
public void setNueva(String nueva){
  this.nueva = nueva;
}
public String getVieja(){
  return vieja;
}
public void setVieja(String vieja){
  this.vieja = vieja;
}
public boolean equals(Pila a){
  if(a.getNueva().equals(pila)){
    return true;
  }else{
    return false;
  }
}
public String toString(){
  return String.format("%s",this.pila);
}
public void mostrar(Stack pila,Pila reemplazo){
  System.out.println("La pila ingresada es: ");
    for(int i=0;i<pila.size();i++){
    System.out.println(pila.get(i));
  }
  System.out.println("palabras a intercambiar: "+reemplazo.getNueva()+", "+reemplazo.getVieja());
}
public void reemplazar_elemento(Stack<Pila> pila,Pila reemplazo){
  for(int i=0;i<pila.size();i++){
      if(pila.get(i).equals(reemplazo)){
      Pila nueva = new Pila(reemplazo.getVieja());
      pila.set(i,nueva);
      }
    } 
     System.out.println("La pila resultante es: ");
    for(int i=0;i<pila.size();i++){
      System.out.println(pila.get(i));
    }
  }
}
