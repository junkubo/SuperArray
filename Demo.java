public class Demo{

  public static void removeDuplicates(SuperArray s){
    for(int i = 0; i < s.size(); i++) {
      for(int j = i + 1; j < s.size(); j++) {
        if (s.get(i).equals(s.get(j))) {
          s.remove(j);
          j -= 1;
        }
      }
    }
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    removeDuplicates(a);
    removeDuplicates(b);
    SuperArray c = new SuperArray();
    for(int i = 0; i < a.size(); i++) {
      for(int j = 0; j < b.size(); j++) {
        if (a.get(i).equals(b.get(j))) {
          c.add(a.get(i));
        }
      }
    }
    return c;
  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    SuperArray words2 = new SuperArray();
    words2.add("una");    words2.add("ebi");     words2.add("toro");
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
    System.out.println(words2);
    System.out.println(findOverlap(words, words2));
    System.out.println(words.lastIndexOf("una"));
    System.out.println(words.equals(words2));
    System.out.println(words.equals(words));
  }
}
