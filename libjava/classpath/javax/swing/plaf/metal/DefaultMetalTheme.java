/* DefaultMetalTheme.java --
   Copyright (C) 2004, 2005 Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */


package javax.swing.plaf.metal;

import gnu.classpath.SystemProperties;

import java.awt.Font;

import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

/**
 * The default theme for the {@link MetalLookAndFeel}.
 *
 * @see MetalLookAndFeel#setCurrentTheme(MetalTheme)
 */
public class DefaultMetalTheme extends MetalTheme
{
  private static final ColorUIResource PRIMARY1 =
    new ColorUIResource(102, 102, 153);
  private static final ColorUIResource PRIMARY2 =
    new ColorUIResource(153, 153, 204);
  private static final ColorUIResource PRIMARY3 =
    new ColorUIResource(204, 204, 255);
  private static final ColorUIResource SECONDARY1 =
    new ColorUIResource(102, 102, 102);
  private static final ColorUIResource SECONDARY2 =
    new ColorUIResource(153, 153, 153);
  private static final ColorUIResource SECONDARY3 =
    new ColorUIResource(204, 204, 204);

  private static final FontUIResource SUB_TEXT_FONT =
    new FontUIResource("Dialog", Font.PLAIN, 10);
  private static final FontUIResource SYSTEM_TEXT_FONT =
    new FontUIResource("Dialog", Font.PLAIN, 12);
  private static final FontUIResource USER_TEXT_FONT =
    new FontUIResource("Dialog", Font.PLAIN, 12);
  private static final FontUIResource WINDOW_TITLE_FONT =
    new FontUIResource("Dialog", Font.BOLD, 12);

  /**
   * The control text font for swing.boldMetal=false.
   */
  private static final FontUIResource PLAIN_CONTROL_TEXT_FONT =
    new FontUIResource("Dialog", Font.PLAIN, 12);

  /**
   * The standard control text font.
   */
  private static final FontUIResource BOLD_CONTROL_TEXT_FONT =
    new FontUIResource("Dialog", Font.BOLD, 12);

  /**
   * The menu text font for swing.boldMetal=false.
   */
  private static final FontUIResource PLAIN_MENU_TEXT_FONT =
    new FontUIResource("Dialog", Font.PLAIN, 12);

  /**
   * The menu control text font.
   */
  private static final FontUIResource BOLD_MENU_TEXT_FONT =
    new FontUIResource("Dialog", Font.BOLD, 12);

  /**
   * Indicates the control text font.
   */
  static final int CONTROL_TEXT_FONT = 1;

  /**
   * Indicates the menu text font.
   */
  static final int MENU_TEXT_FONT = 2;

  /**
   * Creates a new instance of this theme.
   */
  public DefaultMetalTheme()
  {
    // Do nothing here.
  }

  /**
   * Returns the name of the theme.
   *
   * @return <code>"Steel"</code>.
   */
  public String getName()
  {
    return "Steel";
  }

  /**
   * Returns the first primary color for this theme.
   *
   * @return The first primary color.
   */
  protected ColorUIResource getPrimary1()
  {
    return PRIMARY1;
  }

  /**
   * Returns the second primary color for this theme.
   *
   * @return The second primary color.
   */
  protected ColorUIResource getPrimary2()
  {
    return PRIMARY2;
  }

  /**
   * Returns the third primary color for this theme.
   *
   * @return The third primary color.
   */
  protected ColorUIResource getPrimary3()
  {
    return PRIMARY3;
  }

  /**
   * Returns the first secondary color for this theme.
   *
   * @return The first secondary color.
   */
  protected ColorUIResource getSecondary1()
  {
    return SECONDARY1;
  }

  /**
   * Returns the second secondary color for this theme.
   *
   * @return The second secondary color.
   */
  protected ColorUIResource getSecondary2()
  {
    return SECONDARY2;
  }

  /**
   * Returns the third secondary color for this theme.
   *
   * @return The third secondary color.
   */
  protected ColorUIResource getSecondary3()
  {
    return SECONDARY3;
  }

  /**
   * Returns the font used for text on controls.  In this case, the font is
   * <code>FontUIResource("Dialog", Font.BOLD, 12)</code>, unless the
   * <code>swing.boldMetal</code> UI default is set to {@link Boolean#FALSE}
   * in which case it is <code>FontUIResource("Dialog", Font.PLAIN, 12)</code>.
   *
   * @return The font.
   */
  public FontUIResource getControlTextFont()
  {
    return getFont(CONTROL_TEXT_FONT);
  }

  /**
   * Returns the font used for text in menus.  In this case, the font is
   * <code>FontUIResource("Dialog", Font.BOLD, 12)</code>, unless the
   * <code>swing.boldMetal</code> UI default is set to {@link Boolean#FALSE}
   * in which case it is <code>FontUIResource("Dialog", Font.PLAIN, 12)</code>.
   *
   * @return The font used for text in menus.
   */
  public FontUIResource getMenuTextFont()
  {
    return getFont(MENU_TEXT_FONT);
  }

  /**
   * Returns the font used for sub text.  In this case, the font is
   * <code>FontUIResource("Dialog", Font.PLAIN, 10)</code>.
   *
   * @return The font used for sub text.
   */
  public FontUIResource getSubTextFont()
  {
    return SUB_TEXT_FONT;
  }

  /**
   * Returns the font used for system text.  In this case, the font is
   * <code>FontUIResource("Dialog", Font.PLAIN, 12)</code>.
   *
   * @return The font used for system text.
   */
  public FontUIResource getSystemTextFont()
  {
    return SYSTEM_TEXT_FONT;
  }

  /**
   * Returns the font used for user text.  In this case, the font is
   * <code>FontUIResource("Dialog", Font.PLAIN, 12)</code>.
   *
   * @return The font used for user text.
   */
  public FontUIResource getUserTextFont()
  {
    return USER_TEXT_FONT;
  }

  /**
   * Returns the font used for window titles.  In this case, the font is
   * <code>FontUIResource("Dialog", Font.BOLD, 12)</code>.
   *
   * @return The font used for window titles.
   */
  public FontUIResource getWindowTitleFont()
  {
    return WINDOW_TITLE_FONT;
  }

  /**
   * Returns the appropriate font. The font type to return is identified
   * by the specified id.
   *
   * @param id the font type to return
   *
   * @return the correct font
   */
  private FontUIResource getFont(int id)
  {
    FontUIResource font = null;
    switch (id)
      {
      case CONTROL_TEXT_FONT:
        if (isBoldMetal())
          font = BOLD_CONTROL_TEXT_FONT;
        else
          font = PLAIN_CONTROL_TEXT_FONT;
        break;
      case MENU_TEXT_FONT:
        if (isBoldMetal())
          font = BOLD_MENU_TEXT_FONT;
        else
          font = PLAIN_MENU_TEXT_FONT;
      break;
      // TODO: Add other font types and their mapping here.
      }
    return font;
  }

  /**
   * Determines if the theme should be bold or not. The theme is bold by
   * default, this can be turned off by setting the system property
   * swing.boldMetal to true, or by putting the property with the same name
   * into the current UIManager's defaults.
   *
   * @return <code>true</code>, when the theme is bold, <code>false</code>
   *         otherwise
   */
  private boolean isBoldMetal()
  {
    Object boldMetal = UIManager.get("swing.boldMetal");
    return (boldMetal == null || ! Boolean.FALSE.equals(boldMetal))
        && ! ("false".equals(SystemProperties.getProperty("swing.boldMetal")));
  }
}
