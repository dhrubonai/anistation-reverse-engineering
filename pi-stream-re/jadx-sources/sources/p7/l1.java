package p7;

/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final w4.o f8714a = new w4.o("COMPLETING_ALREADY", 3);

    /* renamed from: b, reason: collision with root package name */
    public static final w4.o f8715b = new w4.o("COMPLETING_WAITING_CHILDREN", 3);

    /* renamed from: c, reason: collision with root package name */
    public static final w4.o f8716c = new w4.o("COMPLETING_RETRY", 3);

    /* renamed from: d, reason: collision with root package name */
    public static final w4.o f8717d = new w4.o("TOO_LATE_TO_CANCEL", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final w4.o f8718e = new w4.o("SEALED", 3);

    /* renamed from: f, reason: collision with root package name */
    public static final n0 f8719f = new n0(false);

    /* renamed from: g, reason: collision with root package name */
    public static final n0 f8720g = new n0(true);

    public static final Object a(Object obj) {
        y0 y0Var;
        x0 x0Var;
        if (obj instanceof y0) {
            y0Var = (y0) obj;
        } else {
            y0Var = null;
        }
        if (y0Var != null && (x0Var = y0Var.f8757a) != null) {
            return x0Var;
        }
        return obj;
    }
}
