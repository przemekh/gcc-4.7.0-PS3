
// DO NOT EDIT THIS FILE - it is machine generated -*- c++ -*-

#ifndef __gnu_java_awt_color_GrayScaleConverter__
#define __gnu_java_awt_color_GrayScaleConverter__

#pragma interface

#include <java/lang/Object.h>
#include <gcj/array.h>

extern "Java"
{
  namespace gnu
  {
    namespace java
    {
      namespace awt
      {
        namespace color
        {
            class GrayScaleConverter;
        }
      }
    }
  }
}

class gnu::java::awt::color::GrayScaleConverter : public ::java::lang::Object
{

public:
  GrayScaleConverter();
  virtual JArray< jfloat > * toCIEXYZ(JArray< jfloat > *);
  virtual JArray< jfloat > * toRGB(JArray< jfloat > *);
  virtual JArray< jfloat > * fromCIEXYZ(JArray< jfloat > *);
  virtual JArray< jfloat > * fromRGB(JArray< jfloat > *);
public: // actually package-private
  JArray< jdouble > * __attribute__((aligned(__alignof__( ::java::lang::Object)))) coeff;
private:
  static JArray< jfloat > * D50;
public:
  static ::java::lang::Class class$;
};

#endif // __gnu_java_awt_color_GrayScaleConverter__
