public class 算数表达式求值 {
    public static void main(String[] args) {
        Stack<String> ops=new Stack<String>();
        Stack<Double> vals=new Stack<Double>();
        String sop="";
        for(int i=0;i<sop.length();i++){
            char ch=sop.charAt(i);
            String s=String.valueOf(ch);
            if(s.equals("(")){

            }else if (s.equals("+")){
                ops.push(s);
            }else if (s.equals("-")){
                ops.push(s);
            }else if (s.equals("*")){
                ops.push(s);
            }else if (s.equals("/")){
                ops.push(s);
            }else if (s.equals(")")){
                String op=ops.pop();
                double v=vals.pop();
                if(op.equals("+")){
                    v=vals.pop()+v;
                }else if(op.equals("-")){
                    v=vals.pop()-v;
                }else if(op.equals("*")){
                    v=vals.pop()*v;
                }else if(op.equals("/")){
                    v=vals.pop()/v;
                }
                vals.push(v);
            }else{
                vals.push(Double.parseDouble(s));
            }
            StdOut.println(vals.pop());
        }
    }
}
