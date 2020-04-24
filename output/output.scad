render (convexity=1) {
  difference () {
    difference () {
      cube ([9, 53.0, 13], center=true);
      translate ([0, 0, 3]) {
        cube ([10, 26.5, 10], center=true);
      }
    }
    rotate ([0.0,90.0,0.0]) {
      translate ([-13/2, 26.5, 0]) {
        cylinder ($fn=1000, h=11, r=11, center=true);
      }
    }
    mirror ([0, 1, 0]) {
      rotate ([0.0,90.0,0.0]) {
        translate ([-13/2, 26.5, 0]) {
          cylinder ($fn=1000, h=11, r=11, center=true);
        }
      }
    }
  }
}
