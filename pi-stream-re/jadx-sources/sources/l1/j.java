package l1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6675a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6676b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6677c;

    public final k a() {
        if (!this.f6675a && (this.f6676b || this.f6677c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new k(this);
    }

    public final boolean b() {
        if ((this.f6677c || this.f6676b) && this.f6675a) {
            return true;
        }
        return false;
    }
}
