class MinStack {
    private Stack<Integer> s;
    public MinStack() {
        s=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        int mini=s.peek();
        Stack<Integer> tmp=new Stack<>();
        while(!s.isEmpty()){
            mini=Math.min(mini,s.peek());
            tmp.push(s.pop());
        }
        while(!tmp.isEmpty()){
            s.push(tmp.pop());
        }
    
    return mini;
}
}

