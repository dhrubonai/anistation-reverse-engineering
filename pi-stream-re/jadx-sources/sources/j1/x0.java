package j1;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1.n f5923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1.s f5924c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f5925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5927f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f5928x;

    public /* synthetic */ x0(Object obj, Object obj2, v1.n nVar, v1.s sVar, IOException iOException, boolean z9, int i10) {
        this.f5922a = i10;
        this.f5927f = obj;
        this.f5928x = obj2;
        this.f5923b = nVar;
        this.f5924c = sVar;
        this.f5925d = iOException;
        this.f5926e = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5922a;
        Object obj = this.f5928x;
        Object obj2 = this.f5927f;
        switch (i10) {
            case 0:
                Pair pair = (Pair) obj;
                v1.n nVar = this.f5923b;
                v1.s sVar = this.f5924c;
                IOException iOException = this.f5925d;
                boolean z9 = this.f5926e;
                ((k1.a0) ((a1) ((androidx.appcompat.widget.a0) obj2).f404c).f5626h).D(((Integer) pair.first).intValue(), (v1.w) pair.second, nVar, sVar, iOException, z9);
                return;
            default:
                v1.b0 b0Var = (v1.b0) obj2;
                ((v1.c0) obj).D(b0Var.f10365a, b0Var.f10366b, this.f5923b, this.f5924c, this.f5925d, this.f5926e);
                return;
        }
    }
}
