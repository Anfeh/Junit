package prueba4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.aggregator.AggregateWith;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GestorDeTareasTest {
    GestorDeTareas tareas = new GestorDeTareas();
   @BeforeEach
   void inicializarTareas(){
       for(int i = 1; i<=3; i++){
           tareas.agregarTarea("Tarea "+i);
       }
   }

   @AfterEach
    void limpiarTareas(){
       tareas.limpiarTareas();
   }
   @Test
    public void testTareaAgregada(){
       tareas.agregarTarea("Tarea 1");
       List<String> arrTareas = tareas.obtenerTareas();
       assertTrue(arrTareas.contains("Tarea 1"));
   }

   @Test
    public void testTareaLimpia(){
       tareas.limpiarTareas();
       List<String> arrTareas = tareas.obtenerTareas();
       assertTrue(arrTareas.isEmpty());


   }

}