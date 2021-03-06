import java.util.ArrayList;

class Question3 {

    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int carry = 0;
        int endA = a.size()-1;
        int endB = b.size()-1;
        //System.out.println(endA +"," + endB);

        while (endA >= 0 || endB >= 0) {
            int sum = 0;
            if (endA >= 0 && endB >= 0) {
                sum = a.get(endA) + b.get(endB) + carry;
                //System.out.print("1: "+a.get(endA) + " + " + b.get(endB) + " + " + carry);
            } else if (endA >= 0) {
                sum = a.get(endA) + carry;  
                //System.out.print("2: "+a.get(endA) + " + " + carry);
            } else if (endB >= 0) {
                sum = b.get(endB) + carry;
                //System.out.print("3: "+b.get(endB) + " + " + carry);
            } else {  
                sum = carry;
                //System.out.print("4: "+carry);
            }

            if (sum > 9) {
                carry = 1;
                sum -= 10;
                //System.out.println(" carrying...");
            } else {
                carry = 0;
                //System.out.println(" not carrying...");
            }

            answer.add(0, sum);
            endA--;
            endB--;
        }

        if (carry > 0) {
            answer.add(0, 1);
        }

        return answer;
    }

    public static void main (String[] args) {
        ArrayList<Integer> n1 = new ArrayList<Integer>();
        n1.add(9);
        n1.add(9);
        ArrayList<Integer> n2 = new ArrayList<Integer>();
        n2.add(9);
        n2.add(9);
        ArrayList<Integer> n3 = add(n1, n2);
        System.out.println(n3);

    }
}
