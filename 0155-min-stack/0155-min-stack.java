class MinStack {

    static class Val{
        int v;
        int m;
    }

    Stack<Val> s;

    public MinStack() {
        s = new Stack<Val>();
    }
    
    public void push(int val) {
        Val obj = new Val();
        obj.v=val;

        if(s.isEmpty() || s.peek().m >=val){
            obj.m = val;
        }
        else{
            obj.m = s.peek().m;
        }
       
       s.push(obj);
    }
    
    public void pop() {
        
       s.pop();
    }
    
    public int top() {
         return s.peek().v;
    }
    
    public int getMin() {
        return s.peek().m;
    }
}