package j;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* loaded from: classes.dex */
public final class k implements c0, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f5533a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f5534b;

    /* renamed from: c, reason: collision with root package name */
    public o f5535c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f5536d;

    /* renamed from: e, reason: collision with root package name */
    public b0 f5537e;

    /* renamed from: f, reason: collision with root package name */
    public j f5538f;

    public k(Context context) {
        this.f5533a = context;
        this.f5534b = LayoutInflater.from(context);
    }

    @Override // j.c0
    public final void a(o oVar, boolean z9) {
        b0 b0Var = this.f5537e;
        if (b0Var != null) {
            b0Var.a(oVar, z9);
        }
    }

    @Override // j.c0
    public final boolean c(q qVar) {
        return false;
    }

    @Override // j.c0
    public final void e() {
        j jVar = this.f5538f;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // j.c0
    public final void g(Context context, o oVar) {
        if (this.f5533a != null) {
            this.f5533a = context;
            if (this.f5534b == null) {
                this.f5534b = LayoutInflater.from(context);
            }
        }
        this.f5535c = oVar;
        j jVar = this.f5538f;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // j.c0
    public final boolean h() {
        return false;
    }

    @Override // j.c0
    public final boolean i(q qVar) {
        return false;
    }

    @Override // j.c0
    public final void j(b0 b0Var) {
        this.f5537e = b0Var;
    }

    @Override // j.c0
    public final boolean k(i0 i0Var) {
        if (!i0Var.hasVisibleItems()) {
            return false;
        }
        p pVar = new p(i0Var);
        Context context = i0Var.f5546a;
        f.i iVar = new f.i(context);
        k kVar = new k(iVar.getContext());
        pVar.f5571c = kVar;
        kVar.f5537e = pVar;
        i0Var.b(kVar, context);
        k kVar2 = pVar.f5571c;
        if (kVar2.f5538f == null) {
            kVar2.f5538f = new j(kVar2);
        }
        j jVar = kVar2.f5538f;
        f.e eVar = iVar.f3730a;
        eVar.f3656k = jVar;
        eVar.f3657l = pVar;
        View view = i0Var.o;
        if (view != null) {
            eVar.f3650e = view;
        } else {
            eVar.f3648c = i0Var.f5559n;
            iVar.setTitle(i0Var.f5558m);
        }
        eVar.f3655j = pVar;
        f.j create = iVar.create();
        pVar.f5570b = create;
        create.setOnDismissListener(pVar);
        WindowManager.LayoutParams attributes = pVar.f5570b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        pVar.f5570b.show();
        b0 b0Var = this.f5537e;
        if (b0Var != null) {
            b0Var.m(i0Var);
            return true;
        }
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j4) {
        this.f5535c.q(this.f5538f.getItem(i10), this, 0);
    }
}
