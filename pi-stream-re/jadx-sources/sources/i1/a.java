package i1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5246a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f5247b;

    public a() {
    }

    public static String f(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public final void e(int i10) {
        this.f5247b = i10 | this.f5247b;
    }

    public final boolean g(int i10) {
        if ((this.f5247b & i10) == i10) {
            return true;
        }
        return false;
    }

    public String toString() {
        switch (this.f5246a) {
            case 1:
                return f(this.f5247b);
            default:
                return super.toString();
        }
    }

    public a(int i10) {
        this.f5247b = i10;
    }
}
