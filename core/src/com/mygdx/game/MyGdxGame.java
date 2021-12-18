package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {

    SpriteBatch batch;
    Snake snake;
    float yPosition;
    float xPosition;

    @Override
    public void create() {
        batch = new SpriteBatch();
        snake = new Snake(new Texture("badlogic.jpg"));
        //img = new Texture("badlogic.jpg");
    }

    @Override
    public void render() {
        ScreenUtils.clear(1, 0, 0, 1);

        snake.leerTeclado();
        batch.begin();
        snake.draw(batch);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        snake.dispose();
    }
}
