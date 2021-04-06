package comp5111.assignment.cut;

import comp5111.assignment.cut.ToolBox;

public class ToolBoxTest {
  public static void main(String[] args){
    ToolBox t = new ToolBox();

    CharSequence[] charSequenceArray0 = new CharSequence[2];
    charSequenceArray0[0] = (CharSequence) " +u&&6B";
    charSequenceArray0[1] = (CharSequence) "\r";
    int int0 = ToolBox.StringTools.indexOfDifference(charSequenceArray0);

    System.out.println(int0); // true?

  }
}