import java.time.LocalDateTime;

class Square {
    private double sideLength;
    private LocalDateTime creationTime;

    public Square() {
        this.sideLength = 1.0; // Default side length
        this.creationTime = LocalDateTime.now();
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
        this.creationTime = LocalDateTime.now();
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Square (Side Length: " + sideLength + ", Area: " + getArea() + ", Created at: " + creationTime + ")";
    }
}

class LinkedListNode {
    private Square square;
    private LinkedListNode next;

    public LinkedListNode(Square square) {
        this.square = square;
        this.next = null;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}

class SquareLinkedList {
    private LinkedListNode head;

    public SquareLinkedList() {
        this.head = null;
    }

    public void addSquare(Square square) {
        LinkedListNode newNode = new LinkedListNode(square);
        if (head == null) {
            head = newNode;
        } else {
            LinkedListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void printAllSquares() {
        LinkedListNode current = head;
        while (current != null) {
            System.out.println(current.getSquare());
            current = current.getNext();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SquareLinkedList squareList = new SquareLinkedList();

        for (int i = 0; i < 5; i++) {
            squareList.addSquare(new Square(i + 2)); // Varying side lengths
        }

        squareList.printAllSquares();
    }
}
