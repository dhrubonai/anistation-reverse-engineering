package m3;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public int f7406a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f7407b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f7408c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f7409d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f7410e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7411f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7412g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7413h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7414i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7415j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7416k = false;

    /* renamed from: l, reason: collision with root package name */
    public int f7417l;

    /* renamed from: m, reason: collision with root package name */
    public long f7418m;

    /* renamed from: n, reason: collision with root package name */
    public int f7419n;

    public final void a(int i10) {
        if ((this.f7409d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f7409d));
    }

    public final int b() {
        if (this.f7412g) {
            return this.f7407b - this.f7408c;
        }
        return this.f7410e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f7406a + ", mData=null, mItemCount=" + this.f7410e + ", mIsMeasuring=" + this.f7414i + ", mPreviousLayoutItemCount=" + this.f7407b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f7408c + ", mStructureChanged=" + this.f7411f + ", mInPreLayout=" + this.f7412g + ", mRunSimpleAnimations=" + this.f7415j + ", mRunPredictiveAnimations=" + this.f7416k + '}';
    }
}
