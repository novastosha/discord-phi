package net.zoda.phi.bot;

public final class PhiBot {

    private static PhiBot instance;

    public static PhiBot getInstance() {
        return instance == null? instance = new PhiBot(): instance;
    }
}
