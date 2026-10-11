package f;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class k implements n3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3747a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3748b;

    public k(n3.e eVar) {
        r6.h0.u(eVar, "registry");
        this.f3748b = new LinkedHashSet();
        eVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // n3.d
    public final Bundle a() {
        int i10 = this.f3747a;
        Object obj = this.f3748b;
        switch (i10) {
            case 0:
                Bundle bundle = new Bundle();
                ((androidx.appcompat.app.a) obj).k().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((Set) obj));
                return bundle2;
        }
    }

    public k(g8.a aVar) {
        this.f3748b = aVar;
    }
}
