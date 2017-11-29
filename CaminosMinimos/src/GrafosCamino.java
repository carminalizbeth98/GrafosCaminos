/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carmina Lizbeth Flores Solano
 */
public class GrafosCamino{


    public static void main (String[] args) {
        long matrizA[][] = {{0, 3, 4, 9999999, 8, 99999999}, {99999999, 0, 99999999, 99999999, 5, 99999999}, {99999999, 99999999},
                {99999999, 99999999, 99999999, 7, 0, 3}, {99999999, 99999999, 99999999, 2, 99999999, 0}};
        CaminosMinimos ruta = new CaminosMinimos();
        System.out.println(ruta.algoritmoFloyd(matrizA));
    }
}
