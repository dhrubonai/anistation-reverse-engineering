package y3;

/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11584a;

    public final int a(Object obj) {
        switch (this.f11584a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    public final String b() {
        switch (this.f11584a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}
