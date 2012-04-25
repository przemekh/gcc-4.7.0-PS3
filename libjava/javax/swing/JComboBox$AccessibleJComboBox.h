
// DO NOT EDIT THIS FILE - it is machine generated -*- c++ -*-

#ifndef __javax_swing_JComboBox$AccessibleJComboBox__
#define __javax_swing_JComboBox$AccessibleJComboBox__

#pragma interface

#include <javax/swing/JComponent$AccessibleJComponent.h>
extern "Java"
{
  namespace javax
  {
    namespace accessibility
    {
        class Accessible;
        class AccessibleAction;
        class AccessibleRole;
        class AccessibleSelection;
    }
    namespace swing
    {
        class JComboBox;
        class JComboBox$AccessibleJComboBox;
    }
  }
}

class javax::swing::JComboBox$AccessibleJComboBox : public ::javax::swing::JComponent$AccessibleJComponent
{

public:
  JComboBox$AccessibleJComboBox(::javax::swing::JComboBox *);
  virtual jint getAccessibleChildrenCount();
  virtual ::javax::accessibility::Accessible * getAccessibleChild(jint);
  virtual ::javax::accessibility::AccessibleSelection * getAccessibleSelection();
  virtual ::javax::accessibility::Accessible * getAccessibleSelection(jint);
  virtual jboolean isAccessibleChildSelected(jint);
  virtual ::javax::accessibility::AccessibleRole * getAccessibleRole();
  virtual ::javax::accessibility::AccessibleAction * getAccessibleAction();
  virtual ::java::lang::String * getAccessibleActionDescription(jint);
  virtual jint getAccessibleActionCount();
  virtual jboolean doAccessibleAction(jint);
  virtual jint getAccessibleSelectionCount();
  virtual void addAccessibleSelection(jint);
  virtual void removeAccessibleSelection(jint);
  virtual void clearAccessibleSelection();
  virtual void selectAllAccessibleSelection();
private:
  static const jlong serialVersionUID = 8217828307256675666LL;
public: // actually package-private
  ::javax::swing::JComboBox * __attribute__((aligned(__alignof__( ::javax::swing::JComponent$AccessibleJComponent)))) this$0;
public:
  static ::java::lang::Class class$;
};

#endif // __javax_swing_JComboBox$AccessibleJComboBox__
