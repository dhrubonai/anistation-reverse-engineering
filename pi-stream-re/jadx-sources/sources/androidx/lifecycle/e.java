package androidx.lifecycle;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class e implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1092a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1093b;

    public e(i[] iVarArr) {
        this.f1093b = iVarArr;
    }

    @Override // androidx.lifecycle.s
    public final void onStateChanged(u uVar, n nVar) {
        int i10 = this.f1092a;
        boolean z9 = false;
        Object obj = this.f1093b;
        switch (i10) {
            case 0:
                new HashMap();
                i[] iVarArr = (i[]) obj;
                if (iVarArr.length <= 0) {
                    if (iVarArr.length <= 0) {
                        return;
                    }
                    i iVar = iVarArr[0];
                    throw null;
                }
                i iVar2 = iVarArr[0];
                throw null;
            case 1:
                if (nVar == n.ON_CREATE) {
                    z9 = true;
                }
                if (z9) {
                    uVar.getLifecycle().b(this);
                    ((s0) obj).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + nVar).toString());
                }
            default:
                a3.g.z(obj);
                throw null;
        }
    }

    public e(s0 s0Var) {
        this.f1093b = s0Var;
    }
}
