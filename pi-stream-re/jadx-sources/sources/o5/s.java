package o5;

/* loaded from: classes.dex */
public enum s implements a {
    /* JADX INFO: Fake field, exist only in values array */
    ED256(-260),
    /* JADX INFO: Fake field, exist only in values array */
    ED512(-261),
    /* JADX INFO: Fake field, exist only in values array */
    ED25519(-8),
    /* JADX INFO: Fake field, exist only in values array */
    ES256(-7),
    /* JADX INFO: Fake field, exist only in values array */
    ES384(-35),
    /* JADX INFO: Fake field, exist only in values array */
    ES512(-36);


    /* renamed from: a, reason: collision with root package name */
    public final int f8273a;

    s(int i10) {
        this.f8273a = i10;
    }

    @Override // o5.a
    public final int a() {
        return this.f8273a;
    }
}
