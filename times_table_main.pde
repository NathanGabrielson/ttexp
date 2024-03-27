int rows = 4;
int cols = 3;
int exp = 2;

long[][] tt;

void setup() {

  tt = TTE.ttexp(rows, cols, exp);
  print_tte(tt);
}

void print_tte(long[][] toPrint) {
  for (long[] i : toPrint) {
    for (long j : i) {
      print("\t");
      print(j);
    }
    println();
  }
}  
