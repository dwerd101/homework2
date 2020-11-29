package com.lesson.l5.online.generic;

public class Robot2 {
        private Body body;
        private Head h;

    public Robot2(Body body, Head h) {
        this.body = body;
        this.h = h;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Head getH() {
        return h;
    }

    public void setH(Head h) {
        this.h = h;
    }
}
