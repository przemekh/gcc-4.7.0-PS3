
// DO NOT EDIT THIS FILE - it is machine generated -*- c++ -*-

#ifndef __java_awt_event_MouseMotionAdapter__
#define __java_awt_event_MouseMotionAdapter__

#pragma interface

#include <java/lang/Object.h>
extern "Java"
{
  namespace java
  {
    namespace awt
    {
      namespace event
      {
          class MouseEvent;
          class MouseMotionAdapter;
      }
    }
  }
}

class java::awt::event::MouseMotionAdapter : public ::java::lang::Object
{

public:
  MouseMotionAdapter();
  virtual void mouseDragged(::java::awt::event::MouseEvent *);
  virtual void mouseMoved(::java::awt::event::MouseEvent *);
  static ::java::lang::Class class$;
};

#endif // __java_awt_event_MouseMotionAdapter__
