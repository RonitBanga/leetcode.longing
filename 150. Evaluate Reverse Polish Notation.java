// 150. Evaluate Reverse Polish Notation

class Solution {
    public int evalRPN(String[] tokens) {
        int cur = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        HashSet<String> operator = new HashSet<String>();
        operator.add("+");
        operator.add("-");
        operator.add("/");
        operator.add("*");
        
        Stack<Integer> stack = new Stack<Integer>();
        for(String c : tokens)
        {
            if(!operator.contains(c))
                stack.add(Integer.parseInt(c));
            else
            {
                num2 = stack.pop();
                num1 = stack.pop();
                // System.out.println(num1);
                // System.out.println(num2);
                if(c.equals("/"))
                    num3 = num1 / num2;
                else if(c.equals("+"))
                    num3 = num1 + num2;
                else if(c.equals("-"))
                    num3 = num1 - num2;
                else if(c.equals("*"))
                    num3 = num1 * num2;
                stack.add(num3);
                // System.out.println(c);
                // System.out.println(num3);
            }
        }
        return stack.pop();
    }
}