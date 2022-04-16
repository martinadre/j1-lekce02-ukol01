package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        nakresliPrasatko(zofka);

        zofka.setLocation(30, 400);

        nakresliOsmiuhelnik(zofka);

        zofka.setLocation(210, 370);

        nakresliKruh(zofka);

        zofka.setLocation(210, 150);

        nakresliSlunce(zofka);


    }

    private void nakresliSlunce(Turtle zofka) {
        for (int i = 0; i < 12; i++) {
            nakresliPaprsek(zofka);
            for (int j = 0; j < 4; j++) {
                zofka.move(10);
                zofka.turnRight(7.5);
            }
        }
    }

    private void nakresliPaprsek(Turtle zofka) {
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    private void nakresliKruh(Turtle zofka) {
        for (int i = 0; i < 48; i++) {
            zofka.move(10);
            zofka.turnRight(7.5);
        }
    }

    private void nakresliOsmiuhelnik(Turtle zofka) {
        for (int i = 0; i < 8; i++) {
            zofka.move(60);
            zofka.turnRight(45);
        }
    }

    private void nakresliPrasatko(Turtle zofka) {
        // tělo
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(90);
            zofka.move(120);
            zofka.turnRight(90);
            zofka.move(90);
        }
        for (int i = 0; i < 2; i++) {
            zofka.turnLeft(120);
            zofka.move(90);
        }
            zofka.turnRight(90);
        // nohy
        nakresliNohu(zofka);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(120);
        zofka.turnRight(120);
        zofka.penDown();
        nakresliNohu(zofka);
        // ocasek
        zofka.penUp();
        zofka.move(90);
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

    private void nakresliVlnkuOcasku(Turtle zofka) {
        for (int i = 0; i < 20; i++) {
            zofka.move(3);
            zofka.turnLeft(9);
        }
    }

    private void nakresliNohu(Turtle zofka) {
        zofka.move(40);
        zofka.turnLeft(120);
        zofka.penUp();
        zofka.move(40);
        zofka.turnLeft(120);
        zofka.penDown();
        zofka.move(40);
        zofka.turnRight(30);
    }

}
