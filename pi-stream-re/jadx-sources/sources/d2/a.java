package d2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3088a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3089b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3090c;

    public /* synthetic */ a(int i10, int i11, String str) {
        this.f3089b = i10;
        this.f3090c = i11;
        this.f3088a = str;
    }

    public static a a(f1.t tVar) {
        String str;
        tVar.H(2);
        int v9 = tVar.v();
        int i10 = v9 >> 1;
        int v10 = ((tVar.v() >> 3) & 31) | ((v9 & 1) << 5);
        if (i10 != 4 && i10 != 5 && i10 != 7) {
            if (i10 == 8) {
                str = "hev1";
            } else if (i10 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i10);
        if (v10 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(v10);
        return new a(i10, v10, sb.toString());
    }

    public a(String str, int i10, int i11, int i12, long j4) {
        this.f3088a = str;
        this.f3090c = i10;
        this.f3089b = i11;
    }

    public a(String str, int i10, int i11) {
        this.f3088a = str;
        this.f3089b = i10;
        this.f3090c = i11;
    }
}
