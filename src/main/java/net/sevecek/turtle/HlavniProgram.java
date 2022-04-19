package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();

        double kratsiStrana = 60;
        double delsiStrana = 90;

        zofka.setLocation(120, 140);
        for (int i = 0; i < 4; i++) {
            nakresliDomecek(zofka, kratsiStrana, delsiStrana);
            zofka.turnRight(90);
            zofka.penUp();
            zofka.move(180);
            zofka.turnLeft(90);
            zofka.penDown();
        }
        nakresliDomecek(zofka, kratsiStrana, delsiStrana);

        zofka.setLocation(120, 300);
        nakresliDomecek(zofka, kratsiStrana, delsiStrana);
        zofka.setLocation(600, 300);
        nakresliDomecek(zofka, kratsiStrana, delsiStrana);

        zofka.setLocation(300, 300);
        nakresliPrasatko(zofka, kratsiStrana, delsiStrana, 30);

        zofka.setLocation(130  , 50);
        nakresliSlunce(zofka, 20, 3);

        zofka.setLocation(60, 490);

        nakresliM(zofka);
        nakresliA(zofka);
        nakresliR(zofka);
        nakresliT(zofka);
        nakresliI(zofka);
        nakresliN(zofka);
        nakresliA(zofka);


        // Úkol01 - Část 2:
//        nakresliPrasatko(zofka, 90, 120, 40);
//
//        zofka.setLocation(30, 400);
//        nakresliOsmiuhelnik(zofka, 60);
//
//        zofka.setLocation(210, 370);
//        nakresliKruh(zofka, 10);
//
//        zofka.setLocation(210, 150);
//        nakresliSlunce(zofka, 40, 10);

    }

    private void nakresliA(Turtle zofka) {
        zofka.turnRight(20);
        zofka.move(30);
        zofka.turnRight(70);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(20);
        zofka.turnRight(110);
        zofka.penDown();
        zofka.move(37);
        zofka.turnRight(140);
        zofka.move(67);
        zofka.turnLeft(70);
        mezeraMeziPismeny(zofka);
    }

    private void nakresliN(Turtle zofka) {
        zofka.move(60);
        zofka.turnRight(150);
        zofka.move(70);
        zofka.turnLeft(150);
        zofka.move(60);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(60);
        zofka.turnLeft(90);
        mezeraMeziPismeny(zofka);
    }

    private void nakresliI(Turtle zofka) {
        zofka.move(60);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(60);
        zofka.turnLeft(90);
        mezeraMeziPismeny(zofka);
    }

    private void nakresliT(Turtle zofka) {
        zofka.move(60);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.penDown();
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(30);
        mezeraMeziPismeny(zofka);
    }

    private void nakresliR(Turtle zofka) {
        zofka.move(60);
        zofka.turnRight(90);
        zofka.move(6);
        for (int i = 0; i < 20; i++) {
            zofka.move(2.5);
            zofka.turnRight(9);
        }
        zofka.move(6);
        zofka.turnLeft(135);
        zofka.move(40);
        zofka.turnLeft(45);
        mezeraMeziPismeny(zofka);
    }

    private void nakresliM(Turtle zofka) {
        zofka.move(60);
        zofka.turnRight(150);
        zofka.move(40);
        zofka.turnLeft(120);
        zofka.move(40);
        zofka.turnRight(150);
        zofka.move(60);
        zofka.turnLeft(90);
        mezeraMeziPismeny(zofka);
    }

    private void mezeraMeziPismeny(Turtle zofka) {
        zofka.penUp();
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    private void nakresliDomecek(Turtle zofka, double kratsiStrana, double delsiStrana) {
        zofka.turnRight(90);
        nakresliObdelnikSTrojuhelnikem(zofka, kratsiStrana, delsiStrana);
        zofka.turnRight(60);
    }

    private void nakresliSlunce(Turtle zofka, int delkaPaprsku, int velikostKruhu ) {
        for (int i = 0; i < 12; i++) {
            nakresliPaprsek(zofka, delkaPaprsku);
            for (int j = 0; j < 4; j++) {
                zofka.move(velikostKruhu);
                zofka.turnRight(7.5);
            }
        }
    }

    private void nakresliPaprsek(Turtle zofka, int delkaPaprsku) {
        zofka.turnLeft(90);
        zofka.move(delkaPaprsku);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(delkaPaprsku);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    private void nakresliKruh(Turtle zofka, int velikostKruhu) {
        for (int i = 0; i < 48; i++) {
            zofka.move(velikostKruhu);
            zofka.turnRight(7.5);
        }
    }

    private void nakresliOsmiuhelnik(Turtle zofka, double delkaStrany) {
        for (int i = 0; i < 8; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(45);
        }
    }

    private void nakresliPrasatko(Turtle zofka, double kratsiStrana, double delsiStrana, double delkaNohy) {
        // tělo
        nakresliObdelnikSTrojuhelnikem(zofka,kratsiStrana, delsiStrana);
        // nohy
        nakresliNohu(zofka, delkaNohy);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(delsiStrana);
        zofka.turnRight(120);
        zofka.penDown();
        nakresliNohu(zofka, delkaNohy);
        // ocasek
        zofka.penUp();
        zofka.move(kratsiStrana);
        zofka.turnRight(150);
        zofka.penDown();
        nakresliVlnkuOcasku(zofka);
        for (int j = 0; j < 15; j++) {
            zofka.move(2);
            zofka.turnLeft(12);
        }
        nakresliVlnkuOcasku(zofka);
        zofka.turnRight(30);
    }

    private void nakresliObdelnikSTrojuhelnikem(Turtle zofka, double kratsiStrana, double delsiStrana) {
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(90);
            zofka.move(delsiStrana);
            zofka.turnRight(90);
            zofka.move(kratsiStrana);
        }
        for (int i = 0; i < 2; i++) {
            zofka.turnLeft(120);
            zofka.move(kratsiStrana);
        }
        zofka.turnRight(90);
    }

    private void nakresliVlnkuOcasku(Turtle zofka) {
        for (int i = 0; i < 20; i++) {
            zofka.move(3);
            zofka.turnLeft(9);
        }
    }

    private void nakresliNohu(Turtle zofka, double delkaNohy) {
        zofka.move(delkaNohy);
        zofka.turnLeft(120);
        zofka.penUp();
        zofka.move(delkaNohy);
        zofka.turnLeft(120);
        zofka.penDown();
        zofka.move(delkaNohy);
        zofka.turnRight(30);
    }

}
