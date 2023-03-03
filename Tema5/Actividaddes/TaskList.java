import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TaskList {
    List<String> tareas = new ArrayList<>();
    public List<String> getTareas() {
        return tareas;
    }
    public TaskList(String type) {
        if ("arraylist".equalsIgnoreCase(type)) {
            tareas = new ArrayList<>();
        } else if ("linkedlist".equalsIgnoreCase(type)) {
            tareas = new LinkedList<>();
        }
    }

    public void setTareas(List<String> tareas) {
        this.tareas = tareas;
    }

     List<String> anadirTarea(String nuevaTarea){
        tareas.add(nuevaTarea);
        return tareas;
    }

     List<String> eliminarTarea(String tareaBorrar){
        tareas.remove(tareaBorrar);
        return tareas;
    }

     List<String> tareaCompletada(String tareaCompletada){
        System.out.println("La tarea: " + tareaCompletada + " ha sido completada.");
        tareas.remove(tareaCompletada);
        return tareas;
    }

     void getTasks(){
        Object [] arreglo = tareas.toArray();
        System.out.println(Arrays.toString(arreglo));
    }


}
