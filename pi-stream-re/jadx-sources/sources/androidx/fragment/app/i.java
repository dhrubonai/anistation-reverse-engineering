package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f903c;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.f901a = i10;
        this.f903c = obj;
        this.f902b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f901a;
        Object obj = this.f902b;
        switch (i10) {
            case 0:
                b1.a(4, (ArrayList) obj);
                return;
            default:
                ((n1) obj).c();
                return;
        }
    }
}
