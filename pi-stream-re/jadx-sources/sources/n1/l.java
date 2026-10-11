package n1;

import android.net.Uri;
import c1.v;
import java.util.ArrayList;
import java.util.List;
import r6.o0;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: h, reason: collision with root package name */
    public final String f7956h;

    /* renamed from: i, reason: collision with root package name */
    public final j f7957i;

    /* renamed from: j, reason: collision with root package name */
    public final t f7958j;

    public l(long j4, v vVar, o0 o0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(vVar, o0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) o0Var.get(0)).f7904a);
        long j10 = rVar.f7979e;
        if (j10 <= 0) {
            jVar = null;
        } else {
            jVar = new j(null, rVar.f7978d, j10);
        }
        this.f7957i = jVar;
        this.f7956h = null;
        this.f7958j = jVar == null ? new t(new j(null, 0L, -1L)) : null;
    }

    @Override // n1.m
    public final String a() {
        return this.f7956h;
    }

    @Override // n1.m
    public final m1.k l() {
        return this.f7958j;
    }

    @Override // n1.m
    public final j m() {
        return this.f7957i;
    }
}
