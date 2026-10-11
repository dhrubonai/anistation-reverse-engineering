package y8;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f11664n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11665a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11666b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11667c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11668d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11669e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11670f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11671g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11672h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11673i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f11674j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11675k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11676l;

    /* renamed from: m, reason: collision with root package name */
    public String f11677m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        r6.h0.u(timeUnit, "timeUnit");
        timeUnit.toSeconds(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public c(boolean z9, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13, int i12, int i13, boolean z14, boolean z15, boolean z16, String str) {
        this.f11665a = z9;
        this.f11666b = z10;
        this.f11667c = i10;
        this.f11668d = i11;
        this.f11669e = z11;
        this.f11670f = z12;
        this.f11671g = z13;
        this.f11672h = i12;
        this.f11673i = i13;
        this.f11674j = z14;
        this.f11675k = z15;
        this.f11676l = z16;
        this.f11677m = str;
    }

    public final String toString() {
        boolean z9;
        String str = this.f11677m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f11665a) {
                sb.append("no-cache, ");
            }
            if (this.f11666b) {
                sb.append("no-store, ");
            }
            int i10 = this.f11667c;
            if (i10 != -1) {
                sb.append("max-age=");
                sb.append(i10);
                sb.append(", ");
            }
            int i11 = this.f11668d;
            if (i11 != -1) {
                sb.append("s-maxage=");
                sb.append(i11);
                sb.append(", ");
            }
            if (this.f11669e) {
                sb.append("private, ");
            }
            if (this.f11670f) {
                sb.append("public, ");
            }
            if (this.f11671g) {
                sb.append("must-revalidate, ");
            }
            int i12 = this.f11672h;
            if (i12 != -1) {
                sb.append("max-stale=");
                sb.append(i12);
                sb.append(", ");
            }
            int i13 = this.f11673i;
            if (i13 != -1) {
                sb.append("min-fresh=");
                sb.append(i13);
                sb.append(", ");
            }
            if (this.f11674j) {
                sb.append("only-if-cached, ");
            }
            if (this.f11675k) {
                sb.append("no-transform, ");
            }
            if (this.f11676l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            String sb2 = sb.toString();
            r6.h0.s(sb2, "StringBuilder().apply(builderAction).toString()");
            this.f11677m = sb2;
            return sb2;
        }
        return str;
    }
}
