package c8;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f2080c;

    public a(b bVar, int i10, String str) {
        this.f2080c = bVar;
        this.f2078a = i10;
        this.f2079b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f2080c.j(this.f2078a, 1, this.f2079b);
    }
}
