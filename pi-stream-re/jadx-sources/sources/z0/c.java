package z0;

import androidx.fragment.app.v0;
import androidx.lifecycle.w0;
import i4.v;
import n.l;

/* loaded from: classes.dex */
public final class c extends w0 {

    /* renamed from: c, reason: collision with root package name */
    public static final v0 f11883c = new v0(2);

    /* renamed from: a, reason: collision with root package name */
    public final l f11884a = new l();

    /* renamed from: b, reason: collision with root package name */
    public boolean f11885b = false;

    @Override // androidx.lifecycle.w0
    public final void onCleared() {
        l lVar = this.f11884a;
        int i10 = lVar.f7895c;
        for (int i11 = 0; i11 < i10; i11++) {
            b bVar = (b) lVar.f7894b[i11];
            a1.b bVar2 = bVar.f11880n;
            bVar2.a();
            bVar2.f20d = true;
            v vVar = bVar.f11881p;
            if (vVar != null) {
                bVar.i(vVar);
                if (vVar.f5380b) {
                    ((k3.d) vVar.f5382d).getClass();
                }
            }
            a1.c cVar = bVar2.f18b;
            if (cVar != null) {
                if (cVar == bVar) {
                    bVar2.f18b = null;
                    bVar2.f21e = true;
                    bVar2.f19c = false;
                    bVar2.f20d = false;
                    bVar2.f22f = false;
                } else {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
            } else {
                throw new IllegalStateException("No listener register");
            }
        }
        int i12 = lVar.f7895c;
        Object[] objArr = lVar.f7894b;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        lVar.f7895c = 0;
    }
}
