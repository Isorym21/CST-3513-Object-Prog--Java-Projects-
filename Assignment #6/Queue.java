
/*
 * Santana, Isory 
 * 10/28/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #6

Problem 3. (25%) (The Queue class) Section 10.6 gives a class for Stack. Design a class named Queue for storing integers.
Like a stack, a queue holds elements. In a stack, the elements are retrieved in a last-in first-out fashion. 
In a queue, the elements are retrieved in a first-in first-out fashion. The class contains: 

•	An int[] data field named elements that stores the int values in the queue.
•	A data field named size that stores the number of elements in the queue.
•	A constructor that creates a Queue object with a default capacity of 8.
•	The method enqueue(int v) that adds v into the queue.
•	The method dequeue() that removes and returns the element from the queue.
•	The method empty() that returns true if the queue is empty.
•	The method getSize() that returns the size of the queue.

Draw the UML diagram for the class. Implement the class with the initial array size set to 8. 
The array size will be doubled once the number of elements exceeds the size. After an element 
is removed from the beginning of the array, you need to shift all elements in the array one 
position to the left. Write a test program that adds 20 numbers from 1 to 20 into 
the queue and removes these numbers and display them.


*/

public class Queue {
private int size;
private int[] elements;
Queue() {
elements = new int[8];
size = 0;
}

public void enqueue(int v){

elements[size+1] = v; 
size++;
if (size >= elements.length){
int[] temp_array = elements;
elements = new int[size*2];
for (int i = 0; i<temp_array.length; i++){
   
elements[i] = temp_array[i];

}

}

}

public int dequeue(){

int v = -1;

if (empty() == true){

System.out.println("Queue is empty");

}

else{
    v = elements[0];
    for(int i =0; i<elements.length-1; i++){
        elements[i] = elements[i+1];

}

size = size - 1;

}

return v;

}

public boolean empty(){
    if (size == 0){
        return true;
}

else{
        return false;

}

}

public int getSize(){
    return size;

}

public static void main(String[] args) {
    Queue myQueue = new Queue();
    for (int i = 0; i<20; i++){
        myQueue.enqueue(i);

}
    for (int j = 0; j<20; j++){
        System.out.printf("%2d ", myQueue.dequeue());
        if ((j+1)%5 == 0){
            System.out.println();

}

}

}

}


