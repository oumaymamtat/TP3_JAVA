package p1;
class X {
public void toto() {
System.out.println("toto de X");
}
public static void main(String args[]) {
System.out.println("main de X");
Y y = new Y();
y.toto();
X x = new X();
x.toto();
} }