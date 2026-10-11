package n1;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7984a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7985b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7986c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(String str) {
        this(str, 1, null);
        this.f7984a = 1;
    }

    public final String toString() {
        switch (this.f7984a) {
            case 0:
                return this.f7985b + ", " + this.f7986c;
            default:
                return super.toString();
        }
    }

    public u(String str, int i10, String str2) {
        this.f7984a = i10;
        if (i10 != 1) {
            this.f7985b = str;
            this.f7986c = str2;
            return;
        }
        if (str != null) {
            Object[] objArr = {str, 23};
            if (str.length() <= 23) {
                this.f7985b = str;
                if (str2 == null || str2.length() <= 0) {
                    this.f7986c = null;
                    return;
                } else {
                    this.f7986c = str2;
                    return;
                }
            }
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        throw new NullPointerException("log tag cannot be null");
    }
}
