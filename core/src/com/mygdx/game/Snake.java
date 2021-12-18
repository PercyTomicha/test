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

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Snake{
    private Texture textura;
    public float px;
    public float py;
    public int vidas;
    public int puntaje;

    public Snake(Texture texture) {
        this.textura = texture;
        this.px = 0f;
        this.py = 0f;
        this.vidas = 3;
        this.puntaje = 0;
    }

    public Snake(Texture textura, float xPosition, float yPosition) {
        this.textura = textura;
        this.px = xPosition;
        this.py = yPosition;
    }

    public void leerTeclado() {
        if (Gdx.input.isKeyPressed(Input.Keys.W)) py += 5.0;
        if (Gdx.input.isKeyPressed(Input.Keys.S)) py -= 5.0;
        if (Gdx.input.isKeyPressed(Input.Keys.D)) px += 5.0;
        if (Gdx.input.isKeyPressed(Input.Keys.A)) px -= 5.0;
    }

    public void draw(SpriteBatch batch) {
        batch.draw(textura, px, py);
    }

    public void dispose() {
        textura.dispose();
    }
//
//    public Texture getTexture() {
//        return texture;
//    }
//
//    public void setTexture(Texture texture) {
//        this.texture = texture;
//    }
}
