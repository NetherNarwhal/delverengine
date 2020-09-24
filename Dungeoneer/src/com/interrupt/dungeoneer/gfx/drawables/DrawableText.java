package com.interrupt.dungeoneer.gfx.drawables;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector3;
import com.interrupt.dungeoneer.entities.Entity;
import com.interrupt.dungeoneer.entities.NeoText;

public class DrawableText extends Drawable {

    public String text = "";
    public Color worldColor = Color.WHITE;
    public Vector3 parentPosition = new Vector3();
    public Vector3 parentRotation = new Vector3();
    public Entity.EditorState editorState = Entity.EditorState.hovered;
    public Color pickingColor = Color.BLACK;

    public DrawableText() {
    }

    public DrawableText(String text) {
        this.text = text;
    }

    public void update(Entity e) {
        if (e instanceof NeoText) {
            text = ((NeoText) e).text;
            color.set(((NeoText) e).textColor);
        }

        scale = e.scale;

        parentPosition.set(e.x, e.y, e.z);
        parentRotation.set(e.getRotation());

        editorState = e.editorState;
    }
}