// { dg-options "-std=c++0x -pedantic-errors" }

#include <utility>

class A { };

static void g ( A && ) { }

template < class T > class B {
public:
 void f ( ) {
  A a;
  g ( std :: move ( a ) );
 }
};
