package x3;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11139a;

    public /* synthetic */ a(int i10) {
        this.f11139a = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f11139a) {
            case 0:
                return new Thread(new androidx.appcompat.widget.j(4, this, runnable), "glide-active-resources");
            default:
                return new i1.j(this, runnable);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a() {
        this(1);
        this.f11139a = 1;
    }
}
