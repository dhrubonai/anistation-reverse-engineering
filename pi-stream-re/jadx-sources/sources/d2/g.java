package d2;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f3140d = new g(-3, -9223372036854775807L, -1);

    /* renamed from: e, reason: collision with root package name */
    public static g f3141e;

    /* renamed from: a, reason: collision with root package name */
    public long f3142a;

    /* renamed from: b, reason: collision with root package name */
    public long f3143b;

    /* renamed from: c, reason: collision with root package name */
    public int f3144c;

    public g(int i10, long j4, long j10) {
        this.f3144c = i10;
        this.f3142a = j4;
        this.f3143b = j10;
    }

    public static g b(long j4) {
        return new g(0, -9223372036854775807L, j4);
    }

    public void a(long j4, double d10, double d11) {
        double d12 = (0.01720197f * (((float) (j4 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + ((float) Math.round((r3 - 9.0E-4f) - r7)) + 9.0E-4f + ((-d11) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d13 = 0.01745329238474369d * d10;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d13))) / (Math.cos(asin) * Math.cos(d13));
        if (sin3 >= 1.0d) {
            this.f3144c = 1;
            this.f3142a = -1L;
            this.f3143b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f3144c = 0;
                this.f3142a = -1L;
                this.f3143b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f3142a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f3143b = round;
            if (round < j4 && this.f3142a > j4) {
                this.f3144c = 0;
            } else {
                this.f3144c = 1;
            }
        }
    }
}
