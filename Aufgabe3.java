/**
 * Aufgabe 1 beschreibt eine konkrete Auspraegung eines Verhaltens für Kara, den
 * Kaefer. Sie koennen in der act-Methode definieren, was Kara tut, wenn in der
 * Greenfoot-Umgebung auf "Act" geklickt wird. Beachten Sie die in der Vorlesung
 * besprochenen Regeln von Kara und Vorgaben auf dem Aufgabenblatt bezueglich der
 * zulaessigen Elemente zur Loesung.
 * 
 * Allgemein stehen Ihnen folgende Aktionen und Sensoren zur Verfuegung:
 * 
 * Aktionen:
 * <ol>
 * <li>move() - Kara bewegt sich ein Feld in Blickrichtung.</li>
 * <li>turnLeft() - Kara dreht sich um 90 Grad nach links.</li>
 * <li>turnRight() - Kara dreht sich um 90 Grad nach rechts.</li>
 * <li>putLeaf() - Kara hinterlaesst ein Kleeblatt.</li>
 * <li>removeLeaf() - Kara nimmt ein Kleeblatt auf.</li>
 * </ol>
 * 
 * Sensoren:
 * <ol>
 * <li>isOnLeaf() - ist Kara auf einem Kleeblatt?</li>
 * <li>isTreeFront() - ist vor Kara ein Baum?</li>
 * <li>isTreeLeft() - ist links von Kara ein Baum?</li>
 * <li>isTreeRight() - ist rechts von Kara ein Baum?</li>
 * <li>isMushRoomFront() - steht Kara vor einem Pilz?</li>
 * </ol>
 * 
 */
public class Aufgabe3 extends Kara {

    /**
     * Die 'act'-Methode wird einmalig ausgefuehrt, wenn in der Greenfoot-Umgebung
     * auf 'Act' geklickt wird.
     */
    public void act() {
        turnLeft();
        turnLeft();
        move();                 //between both tree spawn points
        if (isTreeRight()) {
            turnRight();
            turnRight();
            move();
            turnRight();
            move();
            turnLeft();         //facing target mushroom
            move();
            move();
            turnLeft();
            move();
            move();
            turnRight();
            move();
            removeLeaf();
        } else {
            turnRight();
            turnRight();
            move();
            turnLeft();
            move();
            turnRight();
            move();
            move();
            turnRight();
            move();
            move();
            turnLeft();
            move();
            removeLeaf();
        }
    }
}
