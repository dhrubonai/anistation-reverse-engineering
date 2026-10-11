package b2;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import msr.pistream.app.viewmodel.PlayerViewModel;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1309c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1310d;

    public /* synthetic */ c0(Object obj, Object obj2, long j4, int i10) {
        this.f1307a = i10;
        this.f1309c = obj;
        this.f1310d = obj2;
        this.f1308b = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1307a;
        final long j4 = this.f1308b;
        final Object obj = this.f1310d;
        Object obj2 = this.f1309c;
        switch (i10) {
            case 0:
                e0 e0Var = (e0) obj2;
                e0Var.getClass();
                int i11 = f1.b0.f3799a;
                j1.d0 d0Var = ((j1.z) e0Var.f1337b).f5932a;
                k1.a0 a0Var = (k1.a0) d0Var.f5687q;
                final k1.b V = a0Var.V();
                a0Var.W(V, 26, new f1.l(V, obj, j4) { // from class: k1.p

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ Object f6396a;

                    {
                        this.f6396a = obj;
                    }

                    @Override // f1.l
                    public final void invoke(Object obj3) {
                        ((c) obj3).getClass();
                    }
                });
                if (d0Var.O == obj) {
                    d0Var.f5683l.l(26, new j1.l(2));
                    return;
                }
                return;
            default:
                PlayerViewModel playerViewModel = (PlayerViewModel) obj2;
                String str = (String) obj;
                playerViewModel.getClass();
                try {
                    List a10 = playerViewModel.f7828d.a(str);
                    if (a10 == null) {
                        a10 = Collections.emptyList();
                    }
                    playerViewModel.o.put(str, new ArrayList(a10));
                    if (!playerViewModel.c(j4)) {
                        playerViewModel.f7838n.h(b8.a.d(new ArrayList(a10)));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    Log.e("PlayerVM", "load dubs", e10);
                    return;
                }
        }
    }
}
