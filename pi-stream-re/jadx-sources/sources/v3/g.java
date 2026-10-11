package v3;

import e4.v;
import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.load.data.n f10642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y3.h f10643b;

    public /* synthetic */ g(com.bumptech.glide.load.data.n nVar, y3.h hVar) {
        this.f10642a = nVar;
        this.f10643b = hVar;
    }

    @Override // v3.h
    public final int a(e eVar) {
        v vVar;
        y3.h hVar = this.f10643b;
        com.bumptech.glide.load.data.n nVar = this.f10642a;
        try {
            vVar = new v(new FileInputStream(nVar.b().getFileDescriptor()), hVar);
            try {
                int c6 = eVar.c(vVar, hVar);
                vVar.f();
                nVar.b();
                return c6;
            } catch (Throwable th) {
                th = th;
                if (vVar != null) {
                    vVar.f();
                }
                nVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = null;
        }
    }
}
