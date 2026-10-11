package androidx.appcompat.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class q0 implements v0, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public f.j f605a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f606b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f607c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f608d;

    public q0(w0 w0Var) {
        this.f608d = w0Var;
    }

    @Override // androidx.appcompat.widget.v0
    public final boolean b() {
        f.j jVar = this.f605a;
        if (jVar != null) {
            return jVar.isShowing();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.v0
    public final int c() {
        return 0;
    }

    @Override // androidx.appcompat.widget.v0
    public final void dismiss() {
        f.j jVar = this.f605a;
        if (jVar != null) {
            jVar.dismiss();
            this.f605a = null;
        }
    }

    @Override // androidx.appcompat.widget.v0
    public final Drawable e() {
        return null;
    }

    @Override // androidx.appcompat.widget.v0
    public final void g(CharSequence charSequence) {
        this.f607c = charSequence;
    }

    @Override // androidx.appcompat.widget.v0
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.v0
    public final void j(int i10) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.v0
    public final void k(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.v0
    public final void l(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.v0
    public final void m(int i10, int i11) {
        if (this.f606b == null) {
            return;
        }
        w0 w0Var = this.f608d;
        f.i iVar = new f.i(w0Var.getPopupContext());
        CharSequence charSequence = this.f607c;
        if (charSequence != null) {
            iVar.setTitle(charSequence);
        }
        ListAdapter listAdapter = this.f606b;
        int selectedItemPosition = w0Var.getSelectedItemPosition();
        f.e eVar = iVar.f3730a;
        eVar.f3656k = listAdapter;
        eVar.f3657l = this;
        eVar.o = selectedItemPosition;
        eVar.f3659n = true;
        f.j create = iVar.create();
        this.f605a = create;
        AlertController$RecycleListView alertController$RecycleListView = create.f3738e.f3709f;
        o0.d(alertController$RecycleListView, i10);
        o0.c(alertController$RecycleListView, i11);
        this.f605a.show();
    }

    @Override // androidx.appcompat.widget.v0
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        w0 w0Var = this.f608d;
        w0Var.setSelection(i10);
        if (w0Var.getOnItemClickListener() != null) {
            w0Var.performItemClick(null, i10, this.f606b.getItemId(i10));
        }
        dismiss();
    }

    @Override // androidx.appcompat.widget.v0
    public final CharSequence p() {
        return this.f607c;
    }

    @Override // androidx.appcompat.widget.v0
    public final void q(ListAdapter listAdapter) {
        this.f606b = listAdapter;
    }
}
