package org.latexlab.docs.client.content.icons.latex;

import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.ImageBundle;

//TODO: eliminate the deprecated ImageBundle parent reference.
/**
* An image bundle storing LaTeX icons.
*/
@SuppressWarnings("deprecation")
public interface LatexGroupsIconsImageBundle extends ImageBundle {

  public AbstractImagePrototype AboveAndBelow();
  public AbstractImagePrototype Accents();
  public AbstractImagePrototype Arrows();
  public AbstractImagePrototype ArrowsWithCaptions();
  public AbstractImagePrototype BinaryOperators();
  public AbstractImagePrototype Boundaries();
  public AbstractImagePrototype Comparison();
  public AbstractImagePrototype DiverseSymbols();
  public AbstractImagePrototype Formatting();
  public AbstractImagePrototype GreekLowercaseLetters();
  public AbstractImagePrototype GreekUppercaseLetters();
  public AbstractImagePrototype Logical();
  public AbstractImagePrototype Mathematical();
  public AbstractImagePrototype Operators();
  public AbstractImagePrototype Sets();
  public AbstractImagePrototype SubscriptAndSuperscript();
  public AbstractImagePrototype WhiteSpacesAndDots();
  
}
