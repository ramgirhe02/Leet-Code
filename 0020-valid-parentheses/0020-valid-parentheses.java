class Solution {
    public boolean isValid(String s) {
        Character top ;
    Stack<Character> ss = new Stack<>();
    for(Character ch : s.toCharArray()){
        if(ch=='('|| ch=='{' || ch=='[' )
            ss.push(ch);
        else{
             if (ss.isEmpty()) {
                    return false;
                }
            top = ss.peek();
            if((ch==')' && top=='(') || (ch=='}' && top=='{') || (ch==']' && top=='[') )
                ss.pop();
            else   return false;  
        }
    }
     
        return ss.isEmpty();
    
    }
}

    //     Character c ;
    //     HashMap<Character , Integer>map=new HashMap<>();
    //     for( int i=0;i<S.length();i++ ){
    //         c = S.charAt(i);
    //         if(map.containsKey(c)){
    //             map.put(c,map.get(c)+1);
    //         }
    //         else
    //             map.put(c,1);
    //     }
     
    //     if(map.get('(')!=map.get(')'))
    //                     return false;
    //     if(map.get('{')!=map.get('}'))
    //                     return false;
    //     if(map.get('[')!=map.get(']'))
    //                     return false;
        
    //     return true;
    // }
