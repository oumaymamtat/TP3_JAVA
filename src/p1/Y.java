
package p1;

import p2.Z;
//import p2.*;

class Y {
public void toto() {
System.out.println("toto de Y");
}
public static void main(String args[]) {
System.out.println("main de Y");
Y y = new Y();
y.toto();
X x = new X();
x.toto();

//p2.Z z = new p2.Z();

Z z = new Z();
}}