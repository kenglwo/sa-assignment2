/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 21 07:43:14 GMT 2021
 */

package comp5111.assignment.cut;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;

import java.nio.CharBuffer;
import java.util.Locale;
import java.util.function.Supplier;
import java.util.regex.Pattern;

import org.evosuite.runtime.ViolatedAssumptionAnswer;

// public class ToolBox_FaultRevealing2_ESTest extends ToolBox_FaultRevealing2_ESTest_scaffolding {
public class ToolBox_FaultRevealing2_ESTest {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'U';
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "\r", charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) "comp5111.assignment.cut.ToolBox$ArrayTools", (CharSequence) "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '2';
      boolean boolean0 = ToolBox.StringTools.containsNone("6|l4vD/DqNFqa.!~9", charArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'U';
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) "S`ckAX56V J&", charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "|kldLKYmSF%RQdG~Bh|kldLKYmSF%RQdG~Bh");
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, 0, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      // Undeclared exception!
      try {
        ToolBox.CharSequenceTools.regionMatches("OH-x@pXp;9", false, 1, (CharSequence) null, 1, 1);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("comp5111.assignment.cut.ToolBox$CharSequenceTools", e);
      }
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.limit(6);
      int int0 = ToolBox.CharSequenceTools.indexOf(charBuffer0, 7, 7);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "comp5111.assignment.cut.ToolBox$CharTools");
      int int0 = ToolBox.CharSequenceTools.indexOf(charBuffer0, 0, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      // Undeclared exception!
      try {
        ToolBox.LocaleTools.toLocale("p` 1c]?-z*g");
        fail("Expecting exception: IllegalArgumentException");

      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: p` 1c]?-z*g
         //
         verifyException("comp5111.assignment.cut.ToolBox$LocaleTools", e);
      }
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      int int0 = ToolBox.StringTools.length("\r");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isEmpty("comp5111.assignment.cut.ToolBox$CharTools");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      char[] charArray0 = new char[4];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      int int0 = ToolBox.ArrayTools.getLength((Object) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable("4");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable(" ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable("#a~iOK`7");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable("_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable("6d3}~2d^K5@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isMixedCase("4rjtw2'0mxKZ9Sa\"/;");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isMixedCase("Iij9");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isMixedCase(" ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isAllUpperCase("E");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isAllUpperCase((CharSequence) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isAllUpperCase("\"M>b xwZ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'x';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = ToolBox.StringTools.isAllLowerCase(charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isAllLowerCase((CharSequence) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isNumeric((CharSequence) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isNumeric("\n");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer1.limit(6);
      CharSequence[] charSequenceArray0 = new CharSequence[9];
      charSequenceArray0[0] = (CharSequence) charBuffer1;
      charSequenceArray0[1] = (CharSequence) charBuffer1;
      charSequenceArray0[2] = (CharSequence) charBuffer0;
      charSequenceArray0[3] = (CharSequence) charBuffer0;
      charSequenceArray0[4] = (CharSequence) charBuffer1;
      charSequenceArray0[5] = (CharSequence) charBuffer1;
      charSequenceArray0[6] = (CharSequence) charBuffer0;
      charSequenceArray0[7] = (CharSequence) charBuffer0;
      charSequenceArray0[8] = (CharSequence) charBuffer0;
      int int0 = ToolBox.StringTools.indexOfDifference(charSequenceArray0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "k!*V#8";
      stringArray0[1] = "k!*V#8";
      stringArray0[2] = "k!*V#8";
      stringArray0[3] = "\n";
      String string0 = ToolBox.StringTools.getCommonPrefix(stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "\r";
      stringArray0[1] = "\r";
      String string0 = ToolBox.StringTools.getCommonPrefix(stringArray0);
      assertEquals("\r", string0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      CharSequence[] charSequenceArray0 = new CharSequence[9];
      charSequenceArray0[2] = (CharSequence) "&QPSH<&Lo^c1EZ}<5#";
      int int0 = ToolBox.StringTools.indexOfDifference(charSequenceArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      String[] stringArray0 = new String[1];
      int int0 = ToolBox.StringTools.indexOfDifference(stringArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "dcL|(>K2dV1", (CharSequence) "dcL|(>K2dV1");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "D1[!9z=!Thc", (CharSequence) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) " ", (CharSequence) "\n");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "", (CharSequence) "");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) charBuffer0, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      char[] charArray0 = new char[1];
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "\r", charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      char[] charArray0 = new char[0];
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "1/3=F\"h^EZl=K!PsUT", charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      char[] charArray0 = ToolBox.CharSequenceTools.toCharArray(" ");
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) " ", charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      char[] charArray0 = new char[1];
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "", charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "\n");
      char[] charArray0 = new char[2];
      charArray0[0] = '\n';
      int int0 = ToolBox.StringTools.indexOfAny(charBuffer0, charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[2] = '-';
      int int0 = ToolBox.StringTools.indexOfAny("P|#Wenu-2i%DSNo?", charArray0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      char[] charArray0 = new char[5];
      int int0 = ToolBox.StringTools.indexOfAny("P|#Wenu-2i%DSNo?", charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      int int0 = ToolBox.StringTools.indexOfAny("6d3}~2d^K5@", (char[]) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      String[] stringArray0 = new String[5];
      CharSequence charSequence0 = ToolBox.StringTools.getIfEmpty((CharSequence) stringArray0[2], (Supplier<CharSequence>) null);
      assertNull(charSequence0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "");
      Supplier<CharSequence> supplier0 = (Supplier<CharSequence>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      CharSequence charSequence0 = ToolBox.StringTools.getIfEmpty((CharSequence) charBuffer0, supplier0);
      assertNull(charSequence0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      String string0 = ToolBox.StringTools.getIfEmpty(" ", (Supplier<String>) null);
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      String string0 = ToolBox.StringTools.getCommonPrefix(stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[2] = "";
      String string0 = ToolBox.StringTools.getCommonPrefix(stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      String string0 = ToolBox.StringTools.getCommonPrefix((String[]) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) "\n", (CharSequence) "\n");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) "I5oerz^mBlTP,F/~y4c", (CharSequence) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) " ", (CharSequence) " ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) "", (CharSequence) "rFT");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      char[] charArray0 = ToolBox.CharSequenceTools.toCharArray(" ");
      boolean boolean0 = ToolBox.StringTools.containsNone(" ", charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.containsNone("", (char[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      char[] charArray0 = ToolBox.CharSequenceTools.toCharArray(" ");
      boolean boolean0 = ToolBox.StringTools.containsNone((CharSequence) null, charArray0);
      assertTrue(boolean0);
      assertEquals(1, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) null, (CharSequence) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) "Iij9", (CharSequence) "\n");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) null, (char[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.contains("", (-1745));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.contains(" ", 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int int0 = ToolBox.StringTools.compareIgnoreCase("", (String) null, false);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = ToolBox.StringTools.compareIgnoreCase("Invalid locale format: ", (String) null, true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      int int0 = ToolBox.StringTools.compareIgnoreCase((String) null, "OH-x@pXp;9", true);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      int int0 = ToolBox.StringTools.compareIgnoreCase((String) null, "OH-x@pXp;9", false);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = ToolBox.StringTools.compareIgnoreCase("zLGg", "zLGg", true);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = ToolBox.StringTools.compareIgnoreCase("", "comp5111.assignment.cut.ToolBox$StringTools", false);
      assertEquals((-43), int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int int0 = ToolBox.StringTools.compare("", (String) null, false);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int int0 = ToolBox.StringTools.compare((String) null, "9>skMJ6WsNj", true);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      int int0 = ToolBox.StringTools.compare("", "", true);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      int int0 = ToolBox.StringTools.compare((String) null, " ", false);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      char[] charArray0 = ToolBox.CharSequenceTools.toCharArray((CharSequence) null);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replacePattern("F1o[_N", "F1o[_N", (String) null);
      assertEquals("F1o[_N", string0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replacePattern("\r", "\r", "\r");
      assertEquals("\r", string0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replacePattern("", (String) null, "");
      assertNotNull(string0);

      boolean boolean0 = ToolBox.StringTools.isMixedCase(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replacePattern((String) null, "D1[!9z=!Thc", "D1[!9z=!Thc");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceFirst("", "comp5111.assignment.cut.ToolBox$LocaleTools", (String) null);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceFirst("o", (String) null, (String) null);
      assertEquals("o", string0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      // Undeclared exception!
      try {
        ToolBox.RegExTools.replaceFirst("$lXg{zt1r+nZ~}B#6", "", "\"&3$JG a[}D#eF");
        fail("Expecting exception: IllegalArgumentException");

      } catch(IllegalArgumentException e) {
         //
         // Illegal group reference
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceFirst((String) null, (String) null, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("\n", 0);
      String string0 = ToolBox.RegExTools.replaceFirst("$R;*vC*=p2=.h^mF", pattern0, (String) null);
      assertEquals("$R;*vC*=p2=.h^mF", string0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceFirst("", (Pattern) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("&QPSH<&Lo^c1EZ}<5#");
      String string0 = ToolBox.RegExTools.replaceFirst("", pattern0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("ta2}!LCSG", (int) (short)215);
      String string0 = ToolBox.RegExTools.replaceFirst((String) null, pattern0, "ta2}!LCSG");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceAll("oFG|\"", "oFG|\"", (String) null);
      assertEquals("oFG|\"", string0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceAll("_", (String) null, (String) null);
      assertEquals("_", string0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceAll("@<~btAGW@r{TGlYT?{", " ", " ");
      assertEquals("@<~btAGW@r{TGlYT?{", string0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceAll((String) null, "", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("OH-x@pXp;9", 1);
      String string0 = ToolBox.RegExTools.replaceAll("", pattern0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceAll("comp5111.assignment.cut.ToolBox$ArrayTools", (Pattern) null, "");
      assertEquals("comp5111.assignment.cut.ToolBox$ArrayTools", string0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("@<~btAGW@r{TGlYT?{", (-420));
      String string0 = ToolBox.RegExTools.replaceAll("@<~btAGW@r{TGlYT?{", pattern0, "YhQ&");
      assertEquals("YhQ&", string0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("i", 0);
      String string0 = ToolBox.RegExTools.replaceAll((String) null, pattern0, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, charBuffer0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2294);
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, charBuffer0, 2294);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, "", 10);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "oFG|\"");
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, "oFG|\"", (-1872));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "\r");
      int int0 = ToolBox.CharSequenceTools.lastIndexOf("", charBuffer0, 55);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      int int0 = ToolBox.CharSequenceTools.lastIndexOf((CharSequence) null, "oFG|\"", (-1872));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      int int0 = ToolBox.CharSequenceTools.lastIndexOf("zLGg", "zLGg", 95);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      int int0 = ToolBox.CharSequenceTools.lastIndexOf("", (CharSequence) null, (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "\r");
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, (short)1570, (short) (-933));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1930);
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, 1930, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(" ", 0, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      boolean boolean0 = ToolBox.CharSequenceTools.regionMatches(" ", true, (-1), " ", (-1), 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      // Undeclared exception!
      try {
        ToolBox.CharSequenceTools.regionMatches((CharSequence) null, false, (byte)10, (CharSequence) null, (-619), 54);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("comp5111.assignment.cut.ToolBox$CharSequenceTools", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "oFG|\"|oFG|\"");
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) charBuffer0, (CharSequence) charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      int int0 = ToolBox.CharSequenceTools.indexOf(" ", " ", (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      int int0 = ToolBox.CharSequenceTools.indexOf(charBuffer0, charBuffer0, (-1509));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = ToolBox.CharSequenceTools.indexOf(charBuffer0, 7, 7);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      boolean boolean0 = ToolBox.ArrayTools.isEmpty((short[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      short[] shortArray0 = new short[1];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(shortArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(objectArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      String[] stringArray0 = new String[3];
      String string0 = ToolBox.StringTools.getCommonPrefix(stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      long[] longArray0 = new long[0];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(longArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      long[] longArray0 = new long[2];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(longArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      boolean boolean0 = ToolBox.ArrayTools.isEmpty((int[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      int[] intArray0 = new int[7];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      float[] floatArray0 = new float[0];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      float[] floatArray0 = new float[2];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) "\n", (CharSequence) "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      // Undeclared exception!
      try {
        ToolBox.LocaleTools.toLocale("_^k)nE$S{!'");
        fail("Expecting exception: IllegalArgumentException");

      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: _^k)nE$S{!'
         //
         verifyException("comp5111.assignment.cut.ToolBox$LocaleTools", e);
      }
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      // Undeclared exception!
      try {
        ToolBox.LocaleTools.toLocale(" ");
        fail("Expecting exception: IllegalArgumentException");

      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format:
         //
         verifyException("comp5111.assignment.cut.ToolBox$LocaleTools", e);
      }
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      // Undeclared exception!
      try {
        ToolBox.LocaleTools.toLocale(".KUY]M0FH(Yjt+#5F");
        fail("Expecting exception: IllegalArgumentException");

      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: .KUY]M0FH(Yjt+#5F
         //
         verifyException("comp5111.assignment.cut.ToolBox$LocaleTools", e);
      }
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      Locale locale0 = ToolBox.LocaleTools.toLocale("");
      assertEquals("", locale0.getVariant());
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      Locale locale0 = ToolBox.LocaleTools.toLocale((String) null);
      assertNull(locale0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      // Undeclared exception!
      try {
        ToolBox.LocaleTools.toLocale(")=U2CcldnWU2eo:fI<");
        fail("Expecting exception: IllegalArgumentException");

      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: )=U2CcldnWU2eo:fI<
         //
         verifyException("comp5111.assignment.cut.ToolBox$LocaleTools", e);
      }
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      ToolBox.ArrayTools toolBox_ArrayTools0 = new ToolBox.ArrayTools();
      int int0 = ToolBox.StringTools.indexOfAny((CharSequence) null, toolBox_ArrayTools0.EMPTY_CHAR_ARRAY);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      ToolBox.CharTools toolBox_CharTools0 = new ToolBox.CharTools();
      assertEquals('\u0000', ToolBox.CharTools.NUL);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      ToolBox.CharSequenceTools toolBox_CharSequenceTools0 = new ToolBox.CharSequenceTools();
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      ToolBox.LocaleTools toolBox_LocaleTools0 = new ToolBox.LocaleTools();
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      ToolBox.RegExTools toolBox_RegExTools0 = new ToolBox.RegExTools();
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      ToolBox.StringTools toolBox_StringTools0 = new ToolBox.StringTools();
      assertEquals((-1), ToolBox.StringTools.INDEX_NOT_FOUND);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      ToolBox toolBox0 = new ToolBox();
  }
    // ##########################
    @Test
    public void test143() throws Throwable {
        java.lang.String[] strArray0 = new java.lang.String[] {"aaa", " "};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test144() throws Throwable {
        char[] charArray8 = new char[] { ' ', '4', 'a', '\000', '\000' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r h \r \r \r i \r \r \r ! \r \r \r ", charArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test145() throws Throwable {
      CharSequence[] charSequenceArray0 = new CharSequence[2];
      charSequenceArray0[0] = (CharSequence) " +u&&6B";
      charSequenceArray0[1] = (CharSequence) "\r";
      int int0 = ToolBox.StringTools.indexOfDifference(charSequenceArray0);
      org.junit.Assert.assertEquals(0, int0); 
    }

    // ========================================
    public void test146() throws Throwable {
        java.lang.String[] strArray0 = new java.lang.String[] {"bbb", " "};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test147() throws Throwable {
        char[] charArray8 = new char[] { ' ', '5', 'b', '\000', '\000' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r h \r \r \r i \r \r \r ! \r \r \r ", charArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test148() throws Throwable {
      CharSequence[] charSequenceArray0 = new CharSequence[2];
      charSequenceArray0[0] = (CharSequence) " +u&&6B";
      charSequenceArray0[1] = (CharSequence) "\n";
      int int0 = ToolBox.StringTools.indexOfDifference(charSequenceArray0);
      org.junit.Assert.assertEquals(0, int0); 
    }

    @Test
    public void test149() throws Throwable {
        boolean boolean0 = ToolBox.StringTools.isCreatable("6");
        org.junit.Assert.assertTrue(boolean0);
    }

    @Test
    public void test150() throws Throwable {
        boolean boolean0 = ToolBox.StringTools.isCreatable("5");
        org.junit.Assert.assertTrue(boolean0);
    }

    // #################################
}
