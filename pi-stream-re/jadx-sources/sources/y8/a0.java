package y8;

/* loaded from: classes.dex */
public final class a0 extends b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f11658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11659c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f11660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11661e;

    public a0(int i10, int i11, s sVar, byte[] bArr) {
        this.f11658b = sVar;
        this.f11659c = i10;
        this.f11660d = bArr;
        this.f11661e = i11;
    }

    @Override // y8.b0
    public final long a() {
        return this.f11659c;
    }

    @Override // y8.b0
    public final s b() {
        return this.f11658b;
    }

    @Override // y8.b0
    public final void c(k9.h hVar) {
        hVar.d(this.f11660d, this.f11661e, this.f11659c);
    }
}
