package c4;

import b4.o;
import b4.v;
import b4.w;
import b4.x;
import java.util.ArrayDeque;
import p4.i;
import v3.k;
import v3.l;

/* loaded from: classes.dex */
public final class a implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final k f2062b = k.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    public final k3.d f2063a;

    public a(k3.d dVar) {
        this.f2063a = dVar;
    }

    @Override // b4.x
    public final w a(Object obj, int i10, int i11, l lVar) {
        o oVar = (o) obj;
        k3.d dVar = this.f2063a;
        if (dVar != null) {
            v a10 = v.a(oVar);
            Object a11 = ((i) dVar.f6453b).a(a10);
            ArrayDeque arrayDeque = v.f1497d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a10);
            }
            o oVar2 = (o) a11;
            if (oVar2 == null) {
                ((i) dVar.f6453b).d(v.a(oVar), oVar);
            } else {
                oVar = oVar2;
            }
        }
        return new w(oVar, new com.bumptech.glide.load.data.l(oVar, ((Integer) lVar.c(f2062b)).intValue()));
    }

    @Override // b4.x
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
