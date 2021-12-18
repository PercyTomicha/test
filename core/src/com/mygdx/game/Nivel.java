/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Percy Tomicha
 */
package com.mygdx.game;

public class Nivel {
    char nivel[][];
    byte nivel_actual;
    public Nivel(){
        nivel_actual = 1;
        nivel = Niveles.nivel_1;
    }
}
