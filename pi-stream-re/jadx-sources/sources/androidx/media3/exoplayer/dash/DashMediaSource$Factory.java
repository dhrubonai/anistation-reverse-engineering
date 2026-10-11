package androidx.media3.exoplayer.dash;

import androidx.appcompat.widget.a0;
import androidx.lifecycle.q0;
import c1.f0;
import c1.k0;
import h1.g;
import j6.e;
import java.util.List;
import m1.j;
import m1.m;
import v1.v;
import z1.q;

/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements v {

    /* renamed from: a, reason: collision with root package name */
    public final m f1178a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1179b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.fragment.app.g f1180c = new androidx.fragment.app.g();

    /* renamed from: e, reason: collision with root package name */
    public final q0 f1182e = new q0(0);

    /* renamed from: f, reason: collision with root package name */
    public final long f1183f = 30000;

    /* renamed from: g, reason: collision with root package name */
    public final long f1184g = 5000000;

    /* renamed from: d, reason: collision with root package name */
    public final e f1181d = new e(29);

    public DashMediaSource$Factory(g gVar) {
        this.f1178a = new m(gVar);
        this.f1179b = gVar;
    }

    public final j a(k0 k0Var) {
        q qVar;
        f0 f0Var = k0Var.f1769b;
        f0Var.getClass();
        n1.e eVar = new n1.e();
        List list = f0Var.f1685d;
        if (!list.isEmpty()) {
            qVar = new a0(13, eVar, list);
        } else {
            qVar = eVar;
        }
        return new j(k0Var, this.f1179b, qVar, this.f1178a, this.f1181d, this.f1180c.b(k0Var), this.f1182e, this.f1183f, this.f1184g);
    }
}
