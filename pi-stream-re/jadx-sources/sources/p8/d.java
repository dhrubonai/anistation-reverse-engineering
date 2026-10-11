package p8;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z3.e f8769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8770c;

    public /* synthetic */ d(z3.e eVar, int i10, int i11) {
        this.f8768a = i11;
        this.f8769b = eVar;
        this.f8770c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f8768a;
        int i11 = this.f8770c;
        z3.e eVar = this.f8769b;
        switch (i10) {
            case 0:
                if (i11 >= 0) {
                    ((n8.a) eVar.f12044b).H(i11);
                    ((n8.a) eVar.f12044b).v();
                    return;
                } else {
                    eVar.getClass();
                    return;
                }
            default:
                ((n8.a) eVar.f12044b).f8024b.f7750a0 = i11;
                eVar.C();
                return;
        }
    }
}
