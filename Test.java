class Test {
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("ebi");
    words.add("ebi1");
    words.add("ebi2");
    words.add("ebi3");
    words.add("ebi4");
    words.add("ebi5");
    words.add("ebi6");
    words.add("ebi7");
    words.add("ebi8");

    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    System.out.println(words.isEmpty());
  }
}
