package com.andi;

class InnerStaticSingleton{

    private InnerStaticSingleton(){}

    private static class Impl{
        private static final InnerStaticSingleton
        INSTANCE = new InnerStaticSingleton();
    }

    public InnerStaticSingleton getInstance() {
        return Impl.INSTANCE;
    }

}


public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
