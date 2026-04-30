class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if(s.isEmpty()) {return true;}

        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if(stack.empty()){
                stack.push(s.charAt(i));
                continue;
            }
            switch(stack.peek()){
                case '[' :
                    if(s.charAt(i) == ']') {stack.pop(); continue;}
                    break;
                case '(' :
                    if(s.charAt(i) == ')') {stack.pop(); continue;}
                    break;
                case '{' :
                    if(s.charAt(i) == '}') {stack.pop(); continue;}
                    break;
            }
            stack.push(s.charAt(i));
        }

        return stack.empty();
    }
}
