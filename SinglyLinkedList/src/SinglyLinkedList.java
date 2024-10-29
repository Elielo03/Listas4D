public class SinglyLinkedList {
    
    Nodo cabeza;
    SinglyLinkedList(){
        this.cabeza=null;
    }

    public void insertar(Integer valor){
        Nodo nuevoNodo=new Nodo(valor);//crear el nuevo
        if(cabeza==null){
            cabeza=nuevoNodo;
        }else{
            Nodo temp=cabeza;//Seleccionar el primer nodo
        //vamos a recorrer todos los nodos
        while(temp.getSiguiente()!=null){
            temp=temp.getSiguiente();
        }
        temp.setSiguiente(nuevoNodo);//creacion del nuevo Nodo
        }
    }
    public void mostrar(){
            Nodo temp=cabeza;
            while(temp!=null){
                System.out.print(temp.getDato()+"->");
                temp=temp.getSiguiente();
            }
            System.out.print("null");           
    }

}
