// Last updated: 7/30/2025, 9:31:31 AM
class Solution {
    public boolean isValid(String s) {


        Stack<Character> stack = new Stack<>();


        for(char ch: s.toCharArray())
        {
            
            switch (ch)
            {
                
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')

                    
                    {
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                    {
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[')
                    {
                        return false;
                    }
                    break;
            }
        }

        return stack.isEmpty();
        
    }
}