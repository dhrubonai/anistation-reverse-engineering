package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w0 extends androidx.lifecycle.w0 {

    /* renamed from: g, reason: collision with root package name */
    public static final v0 f1021g = new v0(0);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1025d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1022a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1023b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1024c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f1026e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1027f = false;

    public w0(boolean z9) {
        this.f1025d = z9;
    }

    public final void b(y yVar) {
        if (s0.H(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + yVar);
        }
        c(yVar.f1037e);
    }

    public final void c(String str) {
        HashMap hashMap = this.f1023b;
        w0 w0Var = (w0) hashMap.get(str);
        if (w0Var != null) {
            w0Var.onCleared();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f1024c;
        androidx.lifecycle.b1 b1Var = (androidx.lifecycle.b1) hashMap2.get(str);
        if (b1Var != null) {
            b1Var.a();
            hashMap2.remove(str);
        }
    }

    public final void d(y yVar) {
        boolean z9;
        if (this.f1027f) {
            if (s0.H(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if (this.f1022a.remove(yVar.f1037e) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && s0.H(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + yVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f1022a.equals(w0Var.f1022a) && this.f1023b.equals(w0Var.f1023b) && this.f1024c.equals(w0Var.f1024c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1024c.hashCode() + ((this.f1023b.hashCode() + (this.f1022a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.w0
    public final void onCleared() {
        if (s0.H(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1026e = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f1022a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f1023b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f1024c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
