import java.util.ArrayList;
import java.util.List;


public class Actividad5_2 {
    public static void main(String[] args) {
        TaskList tareas= new TaskList("arraylist");

        String nuevaTarea = "Tarea 1";
        tareas.anadirTarea(nuevaTarea);
        System.out.println(tareas);


        String tareaBorrar  ="Tarea 1";
        tareas.eliminarTarea(tareaBorrar);
        System.out.println(tareas);

        System.out.println(" ");

        String tareaCompletada = "Tarea 2";
        tareas.tareaCompletada(tareaCompletada);
        System.out.println(tareas);

        System.out.println(" ");

        tareas.getTasks();
    }
}
