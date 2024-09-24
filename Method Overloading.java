class Overloading{
    void sum(double a,int b){
        System.out.println(a+b);
    }
    void sum(double a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        Overloading o=new Overloading();
        o.sum(10,20);
        o.sum(34,67,12);
    }
}
