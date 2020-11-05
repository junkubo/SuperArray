class Test {
  public static void main(String[] args) {
    SuperArray words = new SuperArray(10);
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
    System.out.println(words.toString());
    System.out.println(words.contains("uni"));
    System.out.println(words.contains("bean"));
    words.add(4, "testadd");
    System.out.println("After adding...");
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    String removed = words.remove(4);
    System.out.println(removed);
    System.out.println("After remove");
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    System.out.println(words.indexOf("ebi2"));
    System.out.println(words.indexOf("ebiy"));
    words.clear();
    System.out.println(words.isEmpty());
  }
}
