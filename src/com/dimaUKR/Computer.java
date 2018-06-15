package com.dimaUKR;

public class Computer {
    class Processor{
        private boolean isStart = false;

        public void start(){
            isStart = true;
            System.out.println("System CPU start is = "+isStart);
        }

        public void shutdown(){
            isStart = false;
            System.out.println("System CPU start is = "+isStart);
        }
    }

    class Ram{
        private boolean isStart = false;

        public void start(){
            isStart = true;
            System.out.println("System RAM start is = "+isStart);
        }

        public void shutdown() {
            isStart = false;
            System.out.println("System RAM start is = "+isStart);
        }
    }

    Processor i3 = new Processor();
    Ram kingston = new Ram();

}
