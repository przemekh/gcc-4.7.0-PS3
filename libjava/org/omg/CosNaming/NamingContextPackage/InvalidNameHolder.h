
// DO NOT EDIT THIS FILE - it is machine generated -*- c++ -*-

#ifndef __org_omg_CosNaming_NamingContextPackage_InvalidNameHolder__
#define __org_omg_CosNaming_NamingContextPackage_InvalidNameHolder__

#pragma interface

#include <java/lang/Object.h>
extern "Java"
{
  namespace org
  {
    namespace omg
    {
      namespace CORBA
      {
          class TypeCode;
        namespace portable
        {
            class InputStream;
            class OutputStream;
        }
      }
      namespace CosNaming
      {
        namespace NamingContextPackage
        {
            class InvalidName;
            class InvalidNameHolder;
        }
      }
    }
  }
}

class org::omg::CosNaming::NamingContextPackage::InvalidNameHolder : public ::java::lang::Object
{

public:
  InvalidNameHolder();
  InvalidNameHolder(::org::omg::CosNaming::NamingContextPackage::InvalidName *);
  void _read(::org::omg::CORBA::portable::InputStream *);
  ::org::omg::CORBA::TypeCode * _type();
  void _write(::org::omg::CORBA::portable::OutputStream *);
  ::org::omg::CosNaming::NamingContextPackage::InvalidName * __attribute__((aligned(__alignof__( ::java::lang::Object)))) value;
  static ::java::lang::Class class$;
};

#endif // __org_omg_CosNaming_NamingContextPackage_InvalidNameHolder__
