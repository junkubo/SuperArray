import java.util.*;

class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    data = new String[0];
    size = 0;
  }
  public SuperArray(int initialCapacity) {
    data = new String[initialCapacity];
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
  public void clear() {
    data = new String[10];
    size = 0;
  }
  public String toString() {
    String x = "[";
    for (int i = 0; i < data.length; i++) {
      x += data[i];
      if (i < data.length-1) {
        x += ", ";
      }
    }
    x += "]";
    return x;
  }

  public boolean contains(String s) {
    if (s == null) return false;
    for (int i = 0; i < data.length; i++) {
        if (s.equals(data[i])) {
          return true;
        }
    }
      return false;
  }

  public void add(int index, String element) {
    if (index >= 0 && index < data.length) {
       String[] datatemp = new String[data.length + 1];
       for(int i = 0; i < index; i++) {
         datatemp[i] = data[i];
       }
       datatemp[index] = element;
       for(int i = index + 1; i < datatemp.length; i++) {
         datatemp[i] = data[i-1];
         //System.out.println("Adding: " + data[i-1]);
       }
       data = datatemp;
       size = data.length;
   }
  }

  public String remove(int index) {
    //if (index < 0 || index > data.length-1) return "";
    String[] datatemp = new String[data.length - 1];
    String toRemove = data[index];

    for(int i = 0; i < index; i++) {
      datatemp[i] = data[i];
    }
    for(int i = index; i < datatemp.length; i++) {
      datatemp[i] = data[i + 1];
    }
    data = datatemp;
    size = data.length;
    return toRemove;
  }

  public int indexOf(String s) {
    for(int i = 0; i < data.length; i++){
      if(data[i].equals(s)) {
        return i;
      }
    }
      return -1;
  }

  public String[] toArray() {
    String[] newData = new String[data.length];
    for (int i = 0; i < data.length; i++) {
      newData[i] = data[i];
    }
    return newData;
  }

}
