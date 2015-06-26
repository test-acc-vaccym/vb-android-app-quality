package vb.android.app.quality;

import vb.android.app.quality.pi.PiGenerator;

/**
 * Very slow class to compute PI.
 */
public final class Pi implements PiGenerator {

    @Override
    public double calcPiDigits(int max) {
        double sum = 0.0;      // final sum
        double term;           // term without sign
        double sign = 1.0;     // sign on each term
        for (int k = 0; k < max; k++) {
            term = 1.0 / (2.0 * k + 1.0);
            sum = sum + sign * term;
            sign = -sign;
        }
        return sum * 4;
    }
}