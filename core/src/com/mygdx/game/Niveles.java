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

class Niveles {
    /*
        0 = N = Nada
        1 = P = Pared
        2 = C = Cabeza de la Serpiente
        3 = S = Cuerpo de la Serpiente
        4 = F = Fruta
    */
    static int nivel1[][] = {{1,1,0,0,0,0,0,0,1,1},
                             {1,0,0,0,0,0,0,0,0,1},
                             {0,0,0,0,0,0,0,4,0,0},
                             {0,0,0,0,0,0,0,0,0,0},
                             {3,3,0,0,0,0,0,0,0,0},
                             {0,3,3,2,0,0,0,0,0,0},
                             {0,0,0,0,0,0,0,0,0,0},
                             {0,0,0,0,0,0,0,0,0,0},
                             {1,0,0,0,0,4,0,0,0,1},
                             {1,1,0,0,0,0,0,0,1,1}};
    static char nivel_1[][] = {{'P','P','N','N','N','N','N','N','P','P'},
                               {'P','N','N','N','N','N','N','N','N','P'},
                               {'N','N','N','N','N','N','N','F','N','N'},
                               {'N','N','N','N','N','N','N','N','N','N'},
                               {'S','S','N','N','N','N','N','N','N','N'},
                               {'N','S','S','C','N','N','N','N','N','N'},
                               {'N','N','N','N','N','N','N','N','N','N'},
                               {'N','N','N','N','N','N','N','N','N','N'},
                               {'P','N','N','N','N','F','N','N','N','P'},
                               {'P','P','N','N','N','N','N','N','P','P'}};
    static int nivel2[][] = {{1,1,0,0,0,1,0,0,1,1},
                             {1,0,0,0,0,1,0,0,0,1},
                             {0,0,0,0,0,1,0,4,0,0},
                             {0,3,3,3,0,0,0,0,0,0},
                             {1,1,1,3,0,0,0,0,0,0},
                             {0,0,0,2,0,0,0,1,1,1},
                             {0,0,0,0,0,0,0,0,0,0},
                             {0,0,0,0,1,0,0,0,0,0},
                             {1,0,0,0,1,4,0,0,0,1},
                             {1,1,0,0,1,0,0,0,1,1}};
    static char nivel_2[][] = {{'P','P','N','N','N','P','N','N','P','P'},
                               {'P','N','N','N','N','P','N','N','N','P'},
                               {'N','N','N','N','N','P','N','F','N','N'},
                               {'N','S','S','S','N','N','N','N','N','N'},
                               {'P','P','P','S','N','N','N','N','N','N'},
                               {'N','S','S','C','N','N','N','P','P','P'},
                               {'N','N','N','N','N','N','N','N','N','N'},
                               {'N','N','N','N','P','N','N','N','N','N'},
                               {'P','N','N','N','P','F','N','N','N','P'},
                               {'P','P','N','N','P','N','N','N','P','P'}};
}
