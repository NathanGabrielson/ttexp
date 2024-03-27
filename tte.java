class TTE {

  public static long[][] ttexp(int rows_, int cols_, int exp_) {
    long[][] temp = new long[rows_][cols_];
    
    for (int row = 0; row < rows_; row++) {
      for (int col = 0; col < cols_; col++) {
        temp[row][col] = (long)Math.pow((col + row * cols_) + 1, exp_);
      }
    }
    return temp;
  }
}
