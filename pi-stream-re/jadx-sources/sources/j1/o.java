package j1;

import android.content.Context;
import android.os.Looper;
import msr.pistream.app.ui.player.PlayerActivity;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5838a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.v f5839b;

    /* renamed from: c, reason: collision with root package name */
    public final q6.m f5840c;

    /* renamed from: d, reason: collision with root package name */
    public final q6.m f5841d;

    /* renamed from: e, reason: collision with root package name */
    public final q6.m f5842e;

    /* renamed from: f, reason: collision with root package name */
    public final q6.m f5843f;

    /* renamed from: g, reason: collision with root package name */
    public final q6.m f5844g;

    /* renamed from: h, reason: collision with root package name */
    public final q6.f f5845h;

    /* renamed from: i, reason: collision with root package name */
    public final Looper f5846i;

    /* renamed from: j, reason: collision with root package name */
    public final c1.g f5847j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5848k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5849l;

    /* renamed from: m, reason: collision with root package name */
    public final j1 f5850m;

    /* renamed from: n, reason: collision with root package name */
    public final long f5851n;
    public final long o;

    /* renamed from: p, reason: collision with root package name */
    public final h f5852p;

    /* renamed from: q, reason: collision with root package name */
    public final long f5853q;

    /* renamed from: r, reason: collision with root package name */
    public final long f5854r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5855s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5856t;

    public o(PlayerActivity playerActivity) {
        n nVar = new n(playerActivity, 0);
        n nVar2 = new n(playerActivity, 1);
        n nVar3 = new n(playerActivity, 2);
        h3.e eVar = new h3.e(0);
        n nVar4 = new n(playerActivity, 3);
        h3.e eVar2 = new h3.e(0);
        playerActivity.getClass();
        this.f5838a = playerActivity;
        this.f5840c = nVar;
        this.f5841d = nVar2;
        this.f5842e = nVar3;
        this.f5843f = eVar;
        this.f5844g = nVar4;
        this.f5845h = eVar2;
        int i10 = f1.b0.f3799a;
        Looper myLooper = Looper.myLooper();
        this.f5846i = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f5847j = c1.g.f1695g;
        this.f5848k = 1;
        this.f5849l = true;
        this.f5850m = j1.f5808c;
        this.f5851n = 5000L;
        this.o = 15000L;
        this.f5852p = new h(f1.b0.O(20L), f1.b0.O(500L), 0.999f);
        this.f5839b = f1.a.f3794a;
        this.f5853q = 500L;
        this.f5854r = 2000L;
        this.f5855s = true;
    }
}
