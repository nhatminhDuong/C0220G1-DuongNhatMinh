package com.codegym.model;

public class Sandwich {
    private boolean lettuceTicked = false;
    private boolean tomatoTicked = false;
    private boolean mustardTicked = false;
    private boolean sproutsTicked = false;

    public Sandwich() {
    }

    public Sandwich(boolean lettuceTicked, boolean tomatoTicked, boolean mustardTicked, boolean sproutsTicked) {
        this.lettuceTicked = lettuceTicked;
        this.tomatoTicked = tomatoTicked;
        this.mustardTicked = mustardTicked;
        this.sproutsTicked = sproutsTicked;
    }

    public boolean isLettuceTicked() {
        return lettuceTicked;
    }

    public void setLettuceTicked(boolean lettuceTicked) {
        this.lettuceTicked = lettuceTicked;
    }

    public boolean isTomatoTicked() {
        return tomatoTicked;
    }

    public void setTomatoTicked(boolean tomatoTicked) {
        this.tomatoTicked = tomatoTicked;
    }

    public boolean isMustardTicked() {
        return mustardTicked;
    }

    public void setMustardTicked(boolean mustardTicked) {
        this.mustardTicked = mustardTicked;
    }

    public boolean isSproutsTicked() {
        return sproutsTicked;
    }

    public void setSproutsTicked(boolean sproutsTicked) {
        this.sproutsTicked = sproutsTicked;
    }
}
