/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
      Node temp = head;
        // Create a HashMap to map original nodes
        // to their corresponding copied nodes
        HashMap<Node, Node> map = new HashMap<>();

        // Step 1: Create copies of each
        // node and store them in the map
        while (temp != null) {
            // Create a new node with the
            // same data as the original node
            Node newNode = new Node(temp.val);
            // Map the original node to its
            // corresponding copied node in the map
            map.put(temp, newNode);
            // Move to the next node in the original list
            temp = temp.next;
        }

        temp = head;
        // Step 2: Connect the next and random
        // pointers of the copied nodes using the map
        while (temp != null) {
            // Access the copied node corresponding
            // to the current original node
            Node copyNode = map.get(temp);
            // Set the next pointer of the copied node
            // to the copied node mapped to the
            // next node in the original list
            copyNode.next = map.get(temp.next);
            // Set the random pointer of the copied node
            // to the copied node mapped to the
            // random node in the original list
            copyNode.random = map.get(temp.random);
            // Move to the next node in the original list
            temp = temp.next;
        }

        // Return the head of the
        // deep copied list from the map
        return map.get(head);
    }
}