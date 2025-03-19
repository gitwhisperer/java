class Main{
    public static void main(String[] args){
        int n1=8; // 8*2^3=8*8=64 // 8<<3=64
        int n2=-8; // -8*2^3=-8*8=-64 // -8<<3=-64
        System.out.println(n1>>>2);
        System.out.println(n2>>>2);
    }
}