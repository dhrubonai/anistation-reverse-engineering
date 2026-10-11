package androidx.media3.exoplayer.hls;

import androidx.appcompat.widget.a0;
import androidx.fragment.app.g;
import androidx.lifecycle.q0;
import c1.f0;
import c1.k0;
import j1.l;
import j6.e;
import java.util.List;
import o1.q;
import p1.c;
import p1.d;
import p1.k;
import p1.o;
import q1.p;
import v1.v;

/* loaded from: classes.dex */
public final class HlsMediaSource$Factory implements v {

    /* renamed from: a, reason: collision with root package name */
    public final c f1185a;

    /* renamed from: f, reason: collision with root package name */
    public final g f1190f = new g();

    /* renamed from: c, reason: collision with root package name */
    public final e f1187c = new e(26);

    /* renamed from: d, reason: collision with root package name */
    public final l f1188d = q1.c.F;

    /* renamed from: b, reason: collision with root package name */
    public final d f1186b = k.f8459a;

    /* renamed from: g, reason: collision with root package name */
    public final q0 f1191g = new q0(0);

    /* renamed from: e, reason: collision with root package name */
    public final e f1189e = new e(29);

    /* renamed from: i, reason: collision with root package name */
    public final int f1193i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final long f1194j = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1192h = true;

    public HlsMediaSource$Factory(h1.g gVar) {
        this.f1185a = new c(gVar);
    }

    public final o a(k0 k0Var) {
        f0 f0Var = k0Var.f1769b;
        f0Var.getClass();
        p pVar = this.f1187c;
        List list = f0Var.f1685d;
        if (!list.isEmpty()) {
            pVar = new a0(12, pVar, list);
        }
        c cVar = this.f1185a;
        d dVar = this.f1186b;
        e eVar = this.f1189e;
        q b10 = this.f1190f.b(k0Var);
        q0 q0Var = this.f1191g;
        this.f1188d.getClass();
        return new o(k0Var, cVar, dVar, eVar, b10, q0Var, new q1.c(this.f1185a, q0Var, pVar), this.f1194j, this.f1192h, this.f1193i);
    }
}
