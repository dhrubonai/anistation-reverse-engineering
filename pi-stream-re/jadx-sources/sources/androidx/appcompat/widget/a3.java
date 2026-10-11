package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public int f406a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f407b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f408c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f409d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f410e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f411f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f412g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f413h = false;

    public final void a(int i10, int i11) {
        this.f408c = i10;
        this.f409d = i11;
        this.f413h = true;
        if (this.f412g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f406a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f407b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f406a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f407b = i11;
        }
    }
}
