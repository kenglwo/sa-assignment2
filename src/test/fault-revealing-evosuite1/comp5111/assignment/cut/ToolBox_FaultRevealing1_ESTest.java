/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 21 06:06:04 GMT 2021
 */

package comp5111.assignment.cut;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import comp5111.assignment.cut.ToolBox;
import java.nio.CharBuffer;
import java.util.Locale;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

// public class ToolBox_FaultRevealing1_ESTest extends ToolBox_FaultRevealing1_ESTest_scaffolding {
public class ToolBox_FaultRevealing1_ESTest {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(5);
      char[] charArray0 = new char[5];
      charArray0[0] = 'x';
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) charBuffer0, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) "hx", (CharSequence) "ow.fpL");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = ToolBox.StringTools.contains(charBuffer0, 749);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      // Undeclared exception!
      try {
        ToolBox.LocaleTools.toLocale("Ie");
        fail("Expecting exception: IllegalArgumentException");

      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: Ie
         //
         verifyException("comp5111.assignment.cut.ToolBox$LocaleTools", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      int int0 = ToolBox.ArrayTools.getLength((Object) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      int int0 = ToolBox.StringTools.length("MzOw`<Ii;BvBVSD6\"");
      assertEquals(19, int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isEmpty("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable("m");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable("6");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable("EI0_rrQ@:ziS");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable(".ghtIF-NSk9<Z$8bA");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable("9[&8,jYAzj");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable(",D<r`]-%");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable(" ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isCreatable("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate((short)57);
      boolean boolean0 = ToolBox.StringTools.isMixedCase(charBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isMixedCase("dVIunA6/4R|cXzjwqO");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isMixedCase(" ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isMixedCase("C/");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isMixedCase("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'S';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = ToolBox.StringTools.isAllUpperCase(charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isAllUpperCase((CharSequence) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isAllUpperCase("\r");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isAllLowerCase("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isNumeric("3bqPNkTm");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.isNumeric("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "=COU";
      stringArray0[1] = "_";
      String string0 = ToolBox.StringTools.getCommonPrefix(stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      CharSequence[] charSequenceArray0 = new CharSequence[2];
      charSequenceArray0[0] = (CharSequence) "";
      charSequenceArray0[1] = (CharSequence) "";
      int int0 = ToolBox.StringTools.indexOfDifference(charSequenceArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      String string0 = ToolBox.StringTools.getCommonPrefix(stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = ToolBox.StringTools.getCommonPrefix(stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) " -", (CharSequence) "_A}x|-");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "C/", (CharSequence) "");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "", (CharSequence) "");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      char[] charArray0 = new char[8];
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "LHq0)A!pIH", charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ToolBox.ArrayTools toolBox_ArrayTools0 = new ToolBox.ArrayTools();
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "", toolBox_ArrayTools0.EMPTY_CHAR_ARRAY);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[3] = '>';
      int int0 = ToolBox.StringTools.indexOfAny(">RyM&@7~lPB\"`'", charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[1] = 'P';
      int int0 = ToolBox.StringTools.indexOfAny(">RyM&@7~lPB\"`'", charArray0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      char[] charArray0 = new char[0];
      int int0 = ToolBox.StringTools.indexOfAny("3bqPNkTm", charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      char[] charArray0 = new char[4];
      int int0 = ToolBox.StringTools.indexOfAny(">RyM&@7~lPB\"`'", charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      char[] charArray0 = new char[8];
      int int0 = ToolBox.StringTools.indexOfAny("", charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(supplier0).get();
      String string0 = ToolBox.StringTools.getIfEmpty("", supplier0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      String string0 = ToolBox.StringTools.getIfEmpty("", (Supplier<String>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Supplier<CharSequence> supplier0 = (Supplier<CharSequence>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      CharSequence charSequence0 = ToolBox.StringTools.getIfEmpty((CharSequence) "\n", supplier0);
      assertEquals("\n", charSequence0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "\r";
      stringArray0[1] = "\r";
      String string0 = ToolBox.StringTools.getCommonPrefix(stringArray0);
      assertEquals("\r", string0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      String string0 = ToolBox.StringTools.getCommonPrefix((String[]) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      String[] stringArray0 = new String[2];
      String string0 = ToolBox.StringTools.getCommonPrefix(stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "");
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) "Ieg,^aP%t'\"", (CharSequence) charBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) null, (CharSequence) "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) "", (CharSequence) "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.equals((CharSequence) "", (CharSequence) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[3] = 'p';
      boolean boolean0 = ToolBox.StringTools.containsNone("comp5111.assignment.cut.ToolBox$RegExTools", charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      char[] charArray0 = new char[7];
      boolean boolean0 = ToolBox.StringTools.containsNone("comp5111.assignment.cut.ToolBox$RegExTools", charArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.containsNone("", (char[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ToolBox.ArrayTools toolBox_ArrayTools0 = new ToolBox.ArrayTools();
      boolean boolean0 = ToolBox.StringTools.containsNone((CharSequence) null, toolBox_ArrayTools0.EMPTY_CHAR_ARRAY);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) "\n", (CharSequence) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'E';
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) "S!0tE", charArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) "\r", (CharSequence) "V3t-$]Y5@}@A\b");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      char[] charArray0 = new char[1];
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) "", charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.contains("", 693);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      int int0 = ToolBox.StringTools.compareIgnoreCase("", (String) null, false);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      int int0 = ToolBox.StringTools.compareIgnoreCase("", (String) null, true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      int int0 = ToolBox.StringTools.compareIgnoreCase((String) null, "", true);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      int int0 = ToolBox.StringTools.compareIgnoreCase((String) null, "Invalid locale format: ", false);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      int int0 = ToolBox.StringTools.compareIgnoreCase("", "", false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      int int0 = ToolBox.StringTools.compareIgnoreCase("comp5111.assignment.cut.ToolBox$ArrayTools", "", false);
      assertEquals(42, int0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int int0 = ToolBox.StringTools.compare("\n", (String) null, false);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = ToolBox.StringTools.compare("Y[~Hsy", (String) null, true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      int int0 = ToolBox.StringTools.compare((String) null, "9n0>uV_/j\"CX", false);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      int int0 = ToolBox.StringTools.compare("&YThU*{='2d", "", false);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = ToolBox.StringTools.compare("\n", "\n", true);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = ToolBox.StringTools.compare((String) null, "", true);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      char[] charArray0 = ToolBox.CharSequenceTools.toCharArray((CharSequence) null);
      assertArrayEquals(new char[] {}, charArray0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replacePattern("", "", (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replacePattern("e\"\"W2+]J<{2oJg", (String) null, "");
      assertNotNull(string0);
      assertEquals("e\"\"W2+]J<{2oJg", string0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replacePattern("C/", "C/", "C/");
      assertEquals("C/", string0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replacePattern((String) null, "", "S;lxTbg");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceFirst("comp5111.assignment.cut.ToolBox$ArrayTools", "", (String) null);
      assertEquals("comp5111.assignment.cut.ToolBox$ArrayTools", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceFirst("S!0tE", (String) null, "S!0tE");
      assertEquals("S!0tE", string0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceFirst("", ":LvK", "comp5111.assignment.cut.ToolBox$ArrayTools");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceFirst((String) null, "comp5111.assignment.cut.ToolBox$LocaleTools", "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("", (-1));
      String string0 = ToolBox.RegExTools.replaceFirst("[HW#MMx0", pattern0, "2@Z-p,");
      assertEquals("2@Z-p,[HW#MMx0", string0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceFirst("", (Pattern) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("j=@R.&W6A6KmkZe", 0);
      String string0 = ToolBox.RegExTools.replaceFirst(">RyM&@7~lPB\"`'", pattern0, (String) null);
      assertEquals(">RyM&@7~lPB\"`'", string0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("", (-1));
      String string0 = ToolBox.RegExTools.replaceFirst((String) null, pattern0, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceAll("", "vS_0xn4W4", (String) null);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceAll("X'*puo-3u", (String) null, "X'*puo-3u");
      assertEquals("X'*puo-3u", string0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceAll("", "V3t-$]Y5@}@A\b", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceAll((String) null, "ldNf+97aO2?->ldNf+97aO2?->", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("", (-519));
      String string0 = ToolBox.RegExTools.replaceAll("g=_q!<", pattern0, "");
      assertEquals("g=_q!<", string0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = ToolBox.RegExTools.replaceAll(" -", (Pattern) null, "_A}x|-");
      assertEquals(" -", string0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("zg,~q");
      String string0 = ToolBox.RegExTools.replaceAll("MzOw`<Ii;BvBVSD6\"", pattern0, (String) null);
      assertEquals("MzOw`<Ii;BvBVSD6\"", string0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("");
      String string0 = ToolBox.RegExTools.replaceAll((String) null, pattern0, "RSE5Mg4|:oq~");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(10);
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, "\n", 69);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate('\n');
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, " ", 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(8);
      int int0 = ToolBox.CharSequenceTools.lastIndexOf("comp5111.assignment.cut.ToolBox$RegExTools", charBuffer0, 101);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      char[] charArray0 = new char[17];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, charBuffer0, 76);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.flip();
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, charBuffer0, 76);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "\n");
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, "\n", (-178));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, charBuffer0, 83);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String[] stringArray0 = new String[8];
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(stringArray0[2], "}\"v=Pj=;aQd[TwqA:", 119);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      int int0 = ToolBox.CharSequenceTools.lastIndexOf("", "", (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      int int0 = ToolBox.CharSequenceTools.lastIndexOf((CharSequence) null, (CharSequence) null, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      int int0 = ToolBox.CharSequenceTools.lastIndexOf("C/", 0, (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "");
      int int0 = ToolBox.CharSequenceTools.lastIndexOf(charBuffer0, (-516), 693);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      boolean boolean0 = ToolBox.CharSequenceTools.regionMatches(charBuffer0, false, 1, charBuffer0, 1, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
      boolean boolean0 = ToolBox.CharSequenceTools.regionMatches(charBuffer0, false, 0, "\r", 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = ToolBox.CharSequenceTools.regionMatches("", false, 0, charBuffer0, 0, (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = ToolBox.CharSequenceTools.regionMatches(charBuffer0, true, 64, charBuffer0, (-4008), (-4008));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "");
      boolean boolean0 = ToolBox.CharSequenceTools.regionMatches(charBuffer0, false, (-1), "", (byte) (-17), (byte)0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      boolean boolean0 = ToolBox.CharSequenceTools.regionMatches("", false, (-22), "", 3, (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "\r");
      char[] charArray0 = ToolBox.CharSequenceTools.toCharArray(charBuffer0);
      int int0 = ToolBox.StringTools.indexOfAny(charBuffer0, charArray0);
      assertEquals(0, int0);
      assertEquals(1, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      boolean boolean0 = ToolBox.StringTools.containsAny((CharSequence) "2@Z-p,[HW#MMx0", (CharSequence) "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      int int0 = ToolBox.CharSequenceTools.indexOf("TJ$psk", " ", (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      // Undeclared exception!
      try {
        ToolBox.CharSequenceTools.indexOf((CharSequence) null, (CharSequence) null, (-2704));
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("comp5111.assignment.cut.ToolBox$CharSequenceTools", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = 'g';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) charBuffer0, (CharSequence) charBuffer0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "\n");
      int int0 = ToolBox.CharSequenceTools.indexOf(charBuffer0, 13, 10);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      short[] shortArray0 = new short[0];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(shortArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      short[] shortArray0 = new short[7];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(shortArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(objectArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      boolean boolean0 = ToolBox.ArrayTools.isEmpty((long[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      long[] longArray0 = new long[2];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(longArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      boolean boolean0 = ToolBox.ArrayTools.isEmpty((int[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      int[] intArray0 = new int[1];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      float[] floatArray0 = new float[0];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      float[] floatArray0 = new float[3];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      char[] charArray0 = new char[5];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      boolean boolean0 = ToolBox.ArrayTools.isEmpty((boolean[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[8];
      boolean boolean0 = ToolBox.ArrayTools.isEmpty(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      // Undeclared exception!
      try {
        ToolBox.LocaleTools.toLocale("_VN2Vn-$!'p_FD9");
        fail("Expecting exception: IllegalArgumentException");

      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: _VN2Vn-$!'p_FD9
         //
         verifyException("comp5111.assignment.cut.ToolBox$LocaleTools", e);
      }
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      // Undeclared exception!
      try {
        ToolBox.LocaleTools.toLocale("m");
        fail("Expecting exception: IllegalArgumentException");

      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: m
         //
         verifyException("comp5111.assignment.cut.ToolBox$LocaleTools", e);
      }
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      // Undeclared exception!
      try {
        ToolBox.LocaleTools.toLocale("#ORj,X=#&>y@;O4-oZ");
        fail("Expecting exception: IllegalArgumentException");

      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: #ORj,X=#&>y@;O4-oZ
         //
         verifyException("comp5111.assignment.cut.ToolBox$LocaleTools", e);
      }
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      Locale locale0 = ToolBox.LocaleTools.toLocale("");
      assertEquals("", locale0.getISO3Country());
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      Locale locale0 = ToolBox.LocaleTools.toLocale((String) null);
      assertNull(locale0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      Locale locale0 = ToolBox.LocaleTools.toLocale("wz");
      assertNotNull(locale0);
      assertEquals("wz", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      ToolBox.ArrayTools toolBox_ArrayTools0 = new ToolBox.ArrayTools();
      int int0 = ToolBox.StringTools.indexOfAnyBut((CharSequence) "C/", toolBox_ArrayTools0.EMPTY_CHAR_ARRAY);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      ToolBox.CharTools toolBox_CharTools0 = new ToolBox.CharTools();
      assertEquals('\r', ToolBox.CharTools.CR);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      ToolBox.CharSequenceTools toolBox_CharSequenceTools0 = new ToolBox.CharSequenceTools();
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      ToolBox.LocaleTools toolBox_LocaleTools0 = new ToolBox.LocaleTools();
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      ToolBox.RegExTools toolBox_RegExTools0 = new ToolBox.RegExTools();
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      ToolBox.StringTools toolBox_StringTools0 = new ToolBox.StringTools();
      assertEquals((-1), ToolBox.StringTools.INDEX_NOT_FOUND);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      ToolBox toolBox0 = new ToolBox();
  }
}
