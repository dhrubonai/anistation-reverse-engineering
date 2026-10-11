package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ix3 {
    public static final float a = z51.h;

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (12.0f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (0.0f >= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (12.0f >= 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z3 & z5;
        if (0.0f >= 0.0f) {
            z4 = true;
        }
        if (!(z6 & z4)) {
            cz2.a("Padding must be non-negative");
        }
    }
}
