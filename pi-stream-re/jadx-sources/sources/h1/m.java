package h1;

import android.content.Context;

/* loaded from: classes.dex */
public final class m implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4607a;

    /* renamed from: b, reason: collision with root package name */
    public final g f4608b;

    public m(Context context) {
        o oVar = new o();
        this.f4607a = context.getApplicationContext();
        this.f4608b = oVar;
    }

    @Override // h1.g
    public final h a() {
        return new n(this.f4607a, this.f4608b.a());
    }
}
