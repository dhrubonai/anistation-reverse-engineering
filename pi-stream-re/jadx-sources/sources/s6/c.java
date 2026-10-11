package s6;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9927a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d10) {
        boolean z9;
        boolean z10;
        long j4;
        if (Math.getExponent(d10) <= 1023) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (d10 == 0.0d) {
                return true;
            }
            if (Math.getExponent(d10) <= 1023) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int exponent = Math.getExponent(d10);
                long doubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
                if (exponent == -1023) {
                    j4 = doubleToRawLongBits << 1;
                } else {
                    j4 = 4503599627370496L | doubleToRawLongBits;
                }
                if (52 - Long.numberOfTrailingZeros(j4) <= Math.getExponent(d10)) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("not a normal value");
            }
        }
        return false;
    }
}
