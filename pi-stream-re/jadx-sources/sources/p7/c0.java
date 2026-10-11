package p7;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f8669a;

    static {
        String str;
        boolean z9;
        f0 f0Var;
        int i10 = t7.y.f10092a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z9 = Boolean.parseBoolean(str);
        } else {
            z9 = false;
        }
        if (!z9) {
            f0Var = b0.f8663z;
        } else {
            u7.d dVar = i0.f8691a;
            Object obj = t7.s.f10087a;
            q7.d dVar2 = ((q7.d) obj).f9230f;
            if (!(obj instanceof f0)) {
                f0Var = b0.f8663z;
            } else {
                f0Var = (f0) obj;
            }
        }
        f8669a = f0Var;
    }
}
