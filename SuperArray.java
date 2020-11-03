class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    data = new String[10];
    size = 0;
  }
  public int size() {
    return size;
  }
  public String get(int index) {
    return data[index];
  }
  public String set(int index, String element) {
    String i = data[index];
    data[index] = element;
    return i;
  }
  private void resize() {
    String[] data1 = new String[data.length + 1];
    for (int i = 0; i < data.length; i++) {
      data1[i] = data[i];
    }
    data = data1;
  }
  public boolean add(String element) {
    if (size == data.length) {
      resize();
    }
    data[size] = element;
    size += 1;
    return true;
    }
    public boolean isEmpty() {
      return size == 0;
    }
}
