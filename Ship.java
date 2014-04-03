public class Ship {
  private int size = 0;
  private int hits = 0;
  private boolean orientation = false;   //true veritical, false horizontal

  public Ship(int size, boolean orientation) {
    this.size = size;
    this.orientation = orientation;
  }

  public boolean isSunk() {
    return hits == size;
  }

  public void hit() {
    hits++;
  }

  public boolean isVertical() {
    return orientation;
  }

  public int getSize() {
    return size;
  }
}
