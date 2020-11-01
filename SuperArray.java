class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    data = String[10];
    size = 0;
  }
  public int size() {
    return size;
  }
  public boolean add(String element) {
    data[size] = element;
    size += 1;
  }
  public String get(int index) {
    return data[index];
  }
}
