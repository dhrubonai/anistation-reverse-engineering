package j3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.view.View;
import android.widget.LinearLayout;
import c1.f1;
import c1.g1;
import c1.z0;
import java.io.File;
import java.util.List;
import java.util.function.IntConsumer;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6092c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6094e;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f6090a = i10;
        this.f6091b = obj;
        this.f6092c = obj2;
        this.f6093d = obj3;
        this.f6094e = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f6090a;
        Object obj = this.f6094e;
        Object obj2 = this.f6093d;
        Object obj3 = this.f6092c;
        Object obj4 = this.f6091b;
        switch (i10) {
            case 0:
                v vVar = (v) obj4;
                f1 f1Var = (f1) obj2;
                t tVar = (t) obj;
                vVar.getClass();
                c1.i iVar = (c1.i) ((z0) obj3);
                if (iVar.d(29)) {
                    j1.d0 d0Var = (j1.d0) iVar;
                    y1.j I = d0Var.I();
                    I.getClass();
                    y1.i iVar2 = new y1.i(I);
                    iVar2.f(new g1(f1Var, r6.o0.o(Integer.valueOf(tVar.f6087b))));
                    iVar2.k(tVar.f6086a.f1802b.f1692c);
                    d0Var.Y(iVar2.d());
                    k kVar = (k) vVar;
                    switch (kVar.f6029f) {
                        case 0:
                            kVar.f6030g.f6114f.f6079e[1] = tVar.f6088c;
                            break;
                    }
                    vVar.f6103e.B.dismiss();
                    return;
                }
                return;
            case 1:
                ((AlertDialog) obj4).dismiss();
                ((IntConsumer) obj3).accept(((int[]) obj2)[((int[]) obj)[0]]);
                return;
            case 2:
                m8.h hVar = (m8.h) obj4;
                String str = (String) obj2;
                List list = (List) obj;
                hVar.getClass();
                m8.a aVar = (m8.a) ((m8.g) obj3);
                int i11 = aVar.f7556a;
                m8.h hVar2 = aVar.f7557b;
                switch (i11) {
                    case 0:
                        hVar2.f7605c = str;
                        break;
                    default:
                        hVar2.f7606d = str;
                        break;
                }
                hVar.h(str, list);
                return;
            default:
                z3.e eVar = (z3.e) obj4;
                LinearLayout linearLayout = (LinearLayout) obj;
                eVar.getClass();
                ((File) obj3).delete();
                Dialog dialog = ((Dialog[]) obj2)[0];
                if (dialog != null) {
                    dialog.dismiss();
                }
                eVar.i(linearLayout);
                return;
        }
    }
}
