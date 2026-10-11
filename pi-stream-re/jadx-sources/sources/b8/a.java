package b8;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1545a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1546b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1547c;

    public a(int i10, Object obj, String str) {
        this.f1545a = i10;
        this.f1546b = obj;
        this.f1547c = str;
    }

    public static a a(String str) {
        return new a(3, null, str);
    }

    public static a c() {
        return new a(1, null, null);
    }

    public static a d(Object obj) {
        return new a(2, obj, null);
    }

    public final boolean b() {
        if (this.f1545a == 2) {
            return true;
        }
        return false;
    }
}
