class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        TreeNode curroot1 = root1;//δεικτης για το 1ο δεντρο
        TreeNode curroot2 = root2;//δεικτης για το 2ο δεντρο
        List<Integer> res = new ArrayList<>();// Λίστα για την αποθήκευση των στοιχείων
        Stack<TreeNode> stack = new Stack<>();// Στοίβα για τη διατήρηση κόμβων προς επεξεργασία

        while(true){
            while(curroot1 != null){// Προσθήκη όλων των αριστερών κόμβων στη στοίβα
                stack.add(curroot1);
                curroot1 = curroot1.left;
            }
            if(stack.isEmpty() == true)break;// Αν η στοίβα είναι άδεια, σταματάμε
            curroot1 = stack.pop();// Παίρνουμε τον πανω πανω κόμβο από τη στοίβα
            res.add(curroot1.val);// Προσθέτουμε την τιμή του στη λίστα
            curroot1 = curroot1.right;// Μετακινούμαστε προς τα δεξιά
        }
        
        while (true) {
            while (curroot2 != null) { // Προσθήκη όλων των αριστερών κόμβων στη στοίβα
                stack.add(curroot2);
                curroot2 = curroot2.left;
            }
            if (stack.isEmpty()) break; // Αν η στοίβα είναι άδεια, σταματάμε
            curroot2 = stack.pop(); // Παίρνουμε τον κόμβο από τη στοίβα
            res.add(curroot2.val); // Προσθέτουμε την τιμή του στη λίστα
            curroot2 = curroot2.right; // Μετακινούμαστε προς τα δεξιά
        }

        Collections.sort(res);

        return res;
    }
}
