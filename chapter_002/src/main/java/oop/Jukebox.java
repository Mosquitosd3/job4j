package oop;

public class Jukebox {
    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(3);
    }

    public void music(int musicNuber) {
       switch (musicNuber) {
           case 1:
               System.out.println("Пусть бегут неуклюже");
               break;
           case 2:
               System.out.println("Спокойной ночи");
               break;
           default:
               System.out.println("Песня не найдена");
       }
    }
}
