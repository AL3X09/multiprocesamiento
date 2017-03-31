/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlexCifuentes
 */
// Definimos unos sencillos hilos. Se detendrán un rato
// antes de imprimir sus nombres y retardos

class TestTh extends Thread {
    private String nombre;
    private int retardo;

    // Constructor para almacenar nuestro nombre
    // y el retardo
    public TestTh( String s,int d ) {
        nombre = s;
        retardo = d;
        }

    // El metodo run() es similar al main(), pero para
    // threads. Cuando run() termina el thread muere
    public void run() {
        // Retasamos la ejecución el tiempo especificado
        try {
            sleep( retardo );
        } catch( InterruptedException e ) {
            ;
        }

        // Ahora imprimimos el nombre
        System.out.println( "Hola Mundo! "+nombre+" "+retardo );
        }
    }

			
public class MultiHola {
    public static void main( String args[] ) {
        TestTh t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;

        // Creamos los threads
        t1 = new TestTh( "Thread 1",(int)(Math.random()*2000) );
        t2 = new TestTh( "Thread 2",(int)(Math.random()*2000) );
        t3 = new TestTh( "Thread 3",(int)(Math.random()*2000) );
        t4 = new TestTh( "Thread 3",(int)(Math.random()*2000) );
        t5 = new TestTh( "Thread 3",(int)(Math.random()*2000) );
        t6 = new TestTh( "Thread 3",(int)(Math.random()*2000) );
        t7 = new TestTh( "Thread 3",(int)(Math.random()*2000) );
        t8 = new TestTh( "Thread 3",(int)(Math.random()*2000) );
        t9 = new TestTh( "Thread 3",(int)(Math.random()*2000) );
        t10 = new TestTh( "Thread 3",(int)(Math.random()*2000) );

        // Arrancamos los threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        }
    }