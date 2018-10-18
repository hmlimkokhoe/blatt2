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
public class Aufgabe6 extends Kara {

    /**
     * Die 'act'-Methode wird einmalig ausgefuehrt, wenn in der Greenfoot-Umgebung
     * auf 'Act' geklickt wird.
     */
    public void act() {
        while (!isOnLeaf()) {
            if (!isTreeLeft()) {
                turnLeft();
                move();
            } else {
                if (!isTreeFront()) {
                    move();
                } else {
                if (!isTreeRight()) {
                    turnRight();
                    move();
                } else {
                    turnLeft();
                  }
                }
            }
        }
        removeLeaf();
    }
}
