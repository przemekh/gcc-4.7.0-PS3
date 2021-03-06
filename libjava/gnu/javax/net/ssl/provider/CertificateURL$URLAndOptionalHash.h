
// DO NOT EDIT THIS FILE - it is machine generated -*- c++ -*-

#ifndef __gnu_javax_net_ssl_provider_CertificateURL$URLAndOptionalHash__
#define __gnu_javax_net_ssl_provider_CertificateURL$URLAndOptionalHash__

#pragma interface

#include <java/lang/Object.h>
#include <gcj/array.h>

extern "Java"
{
  namespace gnu
  {
    namespace javax
    {
      namespace net
      {
        namespace ssl
        {
          namespace provider
          {
              class CertificateURL$URLAndOptionalHash;
          }
        }
      }
    }
  }
  namespace java
  {
    namespace nio
    {
        class ByteBuffer;
    }
  }
}

class gnu::javax::net::ssl::provider::CertificateURL$URLAndOptionalHash : public ::java::lang::Object
{

public:
  CertificateURL$URLAndOptionalHash(::java::nio::ByteBuffer *);
  CertificateURL$URLAndOptionalHash(::java::lang::String *);
  CertificateURL$URLAndOptionalHash(::java::lang::String *, JArray< jbyte > *);
  virtual jint length();
  virtual ::java::nio::ByteBuffer * buffer();
  virtual ::java::lang::String * url();
  virtual jint urlLength();
  virtual ::java::nio::ByteBuffer * urlBuffer();
  virtual jboolean hashPresent();
  virtual JArray< jbyte > * sha1Hash();
  virtual ::java::lang::String * toString();
  virtual ::java::lang::String * toString(::java::lang::String *);
private:
  ::java::nio::ByteBuffer * __attribute__((aligned(__alignof__( ::java::lang::Object)))) buffer__;
public:
  static ::java::lang::Class class$;
};

#endif // __gnu_javax_net_ssl_provider_CertificateURL$URLAndOptionalHash__
